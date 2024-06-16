package adapter.example;

import java.math.BigDecimal;

// This class represents the transactions for a Jar Current Account
public class JarCurrentAccountTransactions {

    // Method to validate if the balance is sufficient for the desired withdrawal amount
    // Prints a message indicating the balance validation and returns true
    public boolean validateBalance (BigDecimal valueDesired) {
        System.out.println("Validate balance....! ");
        return true; // Assuming validation always returns true for demonstration purposes
    }

    // Method to withdraw a specified amount from the current account
    // Prints a message indicating a withdrawal operation
    public void withdraw (BigDecimal valueDesired) {
        System.out.println("Withdraw.....!");
    }

    // Method to deposit a specified amount into the current account
    // Prints a message indicating a deposit operation
    public void deposit (BigDecimal value) {
        System.out.println("deposit....!");
    }
}
