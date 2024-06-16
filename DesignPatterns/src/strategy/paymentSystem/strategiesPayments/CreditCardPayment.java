package strategy.paymentSystem.strategiesPayments;

import strategy.paymentSystem.interfacePaymentSystem.StrategyInterface;

import java.math.BigDecimal;
import java.util.Objects;

public class CreditCardPayment implements StrategyInterface {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPayment (String cardNumber, String name, String dateOfExpiry, String cvv) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.dateOfExpiry = dateOfExpiry;
        this.cvv = cvv;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCardPayment that = (CreditCardPayment) o;
        return Objects.equals(cardNumber, that.cardNumber) && Objects.equals(cvv, that.cvv);
    }

    @Override
    public int hashCode () {
        return Objects.hash(cardNumber, cvv);
    }

    @Override
    public void pay (BigDecimal amount) {
        System.out.println(amount + " Done paid !");
    }

    @Override
    public String toString () {
        return "CreditCardPayment " +
                "cardNumber='" + cardNumber + '\'' +
                ", name='" + name + '\'' +
                ", cvv='" + cvv + '\'' +
                ", dateOfExpiry='" + dateOfExpiry + '\'' +
                ' ';
    }


}

