public record OrderObject (int orderId, String customerName, String customerId, String paymentType, Boolean genuine, String allGenuine, String sparePartName) {

    public String toString() { return "Order [ID:" + allGenuine + orderId + " | Customer Name:" + customerName + " | Customer ID:" + customerId + " | Payment Type:" + paymentType + " | Genuine Parts Only:" + genuine + " | Spare Part Name: " + sparePartName + "]"; }

}

