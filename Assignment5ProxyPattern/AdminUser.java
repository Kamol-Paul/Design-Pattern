package Assignment5ProxyPattern;

public class AdminUser {
    public static void main(String[] args) {
        System.out.println(ProxyClass.getWarehouseList().size());

        Item itemApple = new Item("apple", 10);
        Item itemOrange = new Item("orange", 20);
        Item  itemPear = new Item("pear", 30);
        WarHouse  wHouse = new WarHouse();
        wHouse.setEmail("ckamol7@gmail.com");
        wHouse.setAddress("XXX");
        wHouse.setPhone("0987654321");
        wHouse.addStock(itemApple.getName(), 10);
        wHouse.addStock(itemOrange.getName(), 20);
        wHouse.addStock(itemPear.getName(), 30);
        ProxyClass.addWarehouse(wHouse);
        WarHouse warHouse = new WarHouse();

        warHouse.addStock(itemApple.getName(), 10);
        warHouse.addStock(itemOrange.getName(), 20);
        warHouse.addStock(itemPear.getName(), 30);
        ProxyClass.addWarehouse(warHouse);
        System.out.println(ProxyClass.getWarehouseList().size());



    }
}
