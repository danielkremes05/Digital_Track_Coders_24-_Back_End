package strategy.paymentSystem.strategiesPayments;

import strategy.paymentSystem.interfacePaymentSystem.StrategyInterface;

import java.math.BigDecimal;

public class BitcoinPayment implements StrategyInterface {
    private String bitcoinAddress;

    public BitcoinPayment (String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay (BigDecimal amount) {
        System.out.println(amount + " paid using Bitcoin.");
    }
}
