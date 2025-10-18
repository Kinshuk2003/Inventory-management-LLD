import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import Entity.Item;
import Exception.InvalidQuantityException;
import Exception.DuplicateItemException;

public class Inventory<T extends Item> {
    private HashMap<String, T> inventory;


    public Inventory() {
        this.inventory = new HashMap<>();
    }

    public void add(T item) {
        if (item.getQuantity() < 0) {
            throw new InvalidQuantityException("Quntity is less than or equal to zero");
        }else if (this.inventory.containsKey(item.getId())) {
            throw new DuplicateItemException("Entity.Item " + item.getName() + " already exists." );
        }else {
            this.inventory.put(item.getId(), item);
        }
    }

    public void remove(T item) {
        this.inventory.remove(item.getId());
    }

    public T get(String id) {
        return this.inventory.get(id);
    }

    public ArrayList<T> getAll() {
        return new ArrayList<>(this.inventory.values());
    }

    public ArrayList<T> filterByPrice(double minPrice, double maxPrice) {
        ArrayList<T> filtered = new ArrayList<>();
        for (T item : this.inventory.values()) {
            if (item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
                filtered.add(item);
            }
        }
        return filtered;
    }

    public ArrayList<T> filterByAvailability() {
        ArrayList<T> filtered = new ArrayList<>();
        for (T item : this.inventory.values()) {
            if(item.getQuantity() > 0) {
                filtered.add(item);
            }
        }
        return filtered;
    }

    public ArrayList<T> sortItems(Comparator<T> comparator) {
        ArrayList<T> items = new ArrayList<>(this.inventory.values());
        Collections.sort(items, comparator);
        return items;
    }
}
