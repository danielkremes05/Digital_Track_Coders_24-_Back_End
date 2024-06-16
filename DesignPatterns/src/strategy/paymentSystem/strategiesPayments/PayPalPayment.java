package strategy.paymentSystem.strategiesPayments;

import strategy.paymentSystem.interfacePaymentSystem.StrategyInterface;

import java.math.BigDecimal;

public class PayPalPayment implements StrategyInterface {
    private String emailId;
    private String password;

    public PayPalPayment (String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay (BigDecimal amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
