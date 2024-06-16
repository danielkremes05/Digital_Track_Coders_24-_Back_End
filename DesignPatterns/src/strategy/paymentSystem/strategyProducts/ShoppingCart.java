package strategy.paymentSystem.strategyProducts;

import strategy.paymentSystem.interfacePaymentSystem.StrategyInterface;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart () {
        this.items = new ArrayList<>();
    }

    public void addItem (Item item) {
        items.add(item);
    }

    public void removeItem (Item item) {
        items.remove(item);
    }

    public int calculateTotal () {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay (StrategyInterface paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(BigDecimal.valueOf(amount));
    }
}
