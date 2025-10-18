public class Order implements Comparable<Order> {
    private String orderId;
    private Boolean isExpress;

    public Order(String orderId, Boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public String getOrderId() {
        return orderId;
    }

    public Boolean getExpress() {
        return isExpress;
    }

    public void setExpress(Boolean express) {
        isExpress = express;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public int compareTo(Order o) {
        if (this.isExpress == o.isExpress) {
            return this.orderId.compareTo(o.orderId);
        }else if (this.isExpress) {
            return 1;
        }else {
            return -1;
        }
    }
}
