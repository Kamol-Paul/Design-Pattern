package Assignment5ProxyPattern;

import java.util.Hashtable;

public interface IOrder {
    public Hashtable<String, Integer> fullFillOrder(Order order);
}
