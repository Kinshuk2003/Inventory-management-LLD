package Comparator;

import Entity.Item;
import java.util.Comparator;

public class ItemQuantityComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        // sort by decending order
        return o2.getQuantity() - o1.getQuantity();
    }
}
