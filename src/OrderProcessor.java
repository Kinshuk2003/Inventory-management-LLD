import java.util.PriorityQueue;

public class OrderProcessor {
    private PriorityQueue<Order> orderQueue;

    public OrderProcessor() {
        this.orderQueue = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        this.orderQueue.add(order);
    }

    public Order processOrder() {
        return this.orderQueue.poll();
    }

    public int getSize() {
        return this.orderQueue.size();
    }

}
