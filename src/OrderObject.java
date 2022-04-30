public class OrderObject {
    private int orderId;
    private String orderName;
    private int customerId;
    private int productId;
    private int quantity;
    private int genuine;

    public void order(int orderId, String orderName, int customerId, int productId, int quantity, int genuine) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.genuine = genuine;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getGenuine() {
        return genuine;
    }

    public void setGenuine(int genuine) {
        this.genuine = genuine;
    }
}
