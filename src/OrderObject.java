public record OrderObject (int orderId, String customerName, String customerId, String paymentType, Boolean genuine, String sparePartName) {

    public String toString() { return "Order [id= " + orderId + "Customer Name: " + customerName + "Customer ID: " + customerId + "Payment Type: " + paymentType + "Genuine Parts Only" + genuine + "Spare Part Name: " + sparePartName + "]"; }

}

