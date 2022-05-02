public record Customer(String id, String name, String paymentType) {

    public String toString() {
        return "Customer [id=" + id + ", Name=" + name + ", Payment Type=" + paymentType + "]";
    }

}
