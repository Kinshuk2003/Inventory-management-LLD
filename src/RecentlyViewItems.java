import Entity.Item;

import java.util.ArrayList;
import java.util.LinkedList;

public class RecentlyViewItems {
    private LinkedList<Item> recentlyViewItems;
    public static final int MAX_SIZE = 3;

    public RecentlyViewItems() {
        this.recentlyViewItems = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        if (this.recentlyViewItems.contains(item)) {
            this.recentlyViewItems.remove(item);
        }

        this.recentlyViewItems.addFirst(item);

        if  (this.recentlyViewItems.size() > MAX_SIZE) {
            this.recentlyViewItems.removeLast();
        }
    }

    public ArrayList<Item> getRecentlyViewedItem(Item item) {
        return new ArrayList<Item>(this.recentlyViewItems);
    }
}
