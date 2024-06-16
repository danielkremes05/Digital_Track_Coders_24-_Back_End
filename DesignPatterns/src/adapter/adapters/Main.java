package adapter.adapters;

import adapter.example.JarCurrentAccountTransactions;

import java.math.BigDecimal;

// Main class to demonstrate the usage of the adapter pattern
public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        // Create an instance of JarCurrentAccountTransactions
        JarCurrentAccountTransactions jarAccount = new JarCurrentAccountTransactions();

        // Create an adapter for JarCurrentAccountTransactions
        JarCurrentAccountTransactionsAdpater jarCurrentAccountTransactionsAdpater = new JarCurrentAccountTransactionsAdpater(jarAccount);

        // Create a client adapter for performing operations on the current account
        ClientJarCurrentAccountOperationsAdpater clientJarCurrentAccountOperationsAdpater = new ClientJarCurrentAccountOperationsAdpater(jarCurrentAccountTransactionsAdpater);

        // Perform a withdraw operation using the client adapter
        clientJarCurrentAccountOperationsAdpater.withdraw(new BigDecimal(1500));

        // Note: You can also perform a deposit operation in a similar way:
        // clientJarCurrentAccountOperationsAdpater.deposit(new BigDecimal(1000));
    }
}
