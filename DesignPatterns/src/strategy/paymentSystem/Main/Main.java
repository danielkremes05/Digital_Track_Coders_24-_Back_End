package strategy.paymentSystem.Main;

import strategy.paymentSystem.interfacePaymentSystem.StrategyInterface;
import strategy.paymentSystem.strategiesPayments.BitcoinPayment;
import strategy.paymentSystem.strategiesPayments.CreditCardPayment;
import strategy.paymentSystem.strategiesPayments.PayPalPayment;
import strategy.paymentSystem.strategyProducts.Item;
import strategy.paymentSystem.strategyProducts.ShoppingCart;

public class Main {
    public static void main (String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pay by Credit Card
        StrategyInterface creditCardPayment = new CreditCardPayment("John Doe", "1234567890123456", "786", "12/15");
        cart.pay(creditCardPayment);

        // Pay by PayPal
        StrategyInterface payPalPayment = new PayPalPayment("myemail@example.com", "mypwd");
        cart.pay(payPalPayment);

        // Pay by Bitcoin
        StrategyInterface bitcoinPayment = new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        cart.pay(bitcoinPayment);
    }
}
