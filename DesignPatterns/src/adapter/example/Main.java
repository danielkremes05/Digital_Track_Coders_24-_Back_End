package adapter.example;

import java.math.BigDecimal;

// Main class to demonstrate the usage of ClientJarCurrentAccountOperations
public class Main {
    public static void main(String[] args) {
        // Create an instance of JarCurrentAccountTransactions
        JarCurrentAccountTransactions jarAccount = new JarCurrentAccountTransactions();

        // Create a client instance using the JarCurrentAccountTransactions instance
        ClientJarCurrentAccountOperations client = new ClientJarCurrentAccountOperations(jarAccount);

        // Define the desired amount to withdraw
        BigDecimal valueDesiredToWithdraw = new BigDecimal(1500);

        // Check if the balance is sufficient for the desired withdrawal amount
        if (client.validateBalance(valueDesiredToWithdraw)) {
            // Perform the withdrawal operation if the balance is sufficient
            client.withdraw(valueDesiredToWithdraw);
        }

        // Perform a deposit operation with the specified amount
        client.deposit(new BigDecimal(2500));
    }
}
