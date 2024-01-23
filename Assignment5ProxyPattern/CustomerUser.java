package Assignment5ProxyPattern;

public class CustomerUser {
    public static void main(String[] args) {
        Item itemApple = new Item("apple");
        Item itemOrange = new Item("orange");
        Item  itemPear = new Item("pear");
        WarHouse  wHouse = new WarHouse("Kazla");
        Item itemPotato = new Item("potato");
        wHouse.addStock(itemApple, 10);
        wHouse.addStock(itemOrange, 20);
        wHouse.addStock(itemPear, 30);

        ProxyClass.addWarehouse(wHouse);
        WarHouse warHouse = new WarHouse("Talaimari");

        warHouse.addStock(itemApple, 10);
        warHouse.addStock(itemOrange, 20);
        warHouse.addStock(itemPear, 30);
        warHouse.addStock(itemPotato, 50);
        ProxyClass.addWarehouse(warHouse);

        IOrder  market = new ProxyClass();
        Order order = new Order();
        order.addItem(itemApple);
        order.addItem(itemPear);
        order.addItem(itemPotato);
        order.addItem(new Item("tomato"));
        market.fullFillOrder(order);
        warHouse.addStock(new Item("tomato"), 100);
        market.fullFillOrder(order);
    }
}
