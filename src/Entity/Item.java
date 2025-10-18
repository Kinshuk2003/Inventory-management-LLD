package Entity;

public class Item implements Comparable<Item> {
    private String  id;
    private String name;
    private double price;
    private int quantity;

    public Item(String id, String name, double price,int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item o) {
        if (this.price < o.price) {
            return -1;
        }else if (this.price > o.price) {
            return 1;
        }
        return 0;
    }
}
