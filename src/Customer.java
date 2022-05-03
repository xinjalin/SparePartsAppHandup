public record Customer(String id, String name, String paymentType) {

    public String toString() {
        return id + name + paymentType;
    }

}
