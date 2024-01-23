package Assignment5ProxyPattern;

import java.util.ArrayList;
import java.util.List;
public class Order {
    public final List<Item> itemList;
    public Order(){
        itemList = new ArrayList<>();

    }
    public void addItem(Item item){
       itemList.add(item);
    }


}
