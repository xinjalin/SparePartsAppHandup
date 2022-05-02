public record OrderObject (int orderId, String customerName, String customerId, Boolean genuine, String paymentType) {

    public String toString() { return "Order ID: " + orderId + "Customer Name: " + customerName + "Customer ID: " + customerId + "Genuine Parts Only" + genuine + "Payment Type: " + paymentType;}

}

