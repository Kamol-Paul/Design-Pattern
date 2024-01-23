package Assignment5ProxyPattern;

import java.util.ArrayList;
import java.util.Hashtable;

public class WarHouse implements IOrder{
    private final Hashtable<String, Integer> stocks;
    private final String address;
    public WarHouse(String address) {
        stocks = new Hashtable<>();
        this.address = address;
    }

    @Override
    public void fullFillOrder(Order order) {
        ArrayList<Item> sold = new ArrayList<>();
        for (Item item : order.itemList) {
            if(currentInventory(item) > 0){
                System.out.println(item.sku + " have bought from " + address);
                sold.add(item);

            }
        }
        order.itemList.removeAll(sold);
    }

    public void addStock(Item item, int quantity) {
        if (stocks.containsKey(item.sku)) {
            stocks.put(item.sku, stocks.get(item.sku) + quantity);
        } else {
            stocks.put(item.sku, quantity);
        }

    }

    int currentInventory(Item item) {
        if (!stocks.containsKey(item.sku)) {
            return 0;
        }
        return stocks.get(item.sku);
    }
}
