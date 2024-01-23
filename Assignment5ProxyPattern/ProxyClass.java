package Assignment5ProxyPattern;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ProxyClass implements IOrder{
    private static final List<WarHouse> warehouseList = new ArrayList<>();
    public ProxyClass(){

    }
    public static void addWarehouse(WarHouse warHouse){
        warehouseList.add(warHouse);
    }
    @Override
    public void fullFillOrder(Order order) {
       for(WarHouse warHouse : warehouseList){
           warHouse.fullFillOrder(order);
           if(order.itemList.isEmpty()) return;
       }
       for(Item item : order.itemList){
           System.out.println(item.sku + " is not available any warehouse.");
       }
    }
}
