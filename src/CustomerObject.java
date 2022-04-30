public class CustomerObject {

    private String id;
    private String name;
    private String paymentType;


    public void customer (String id, String name, String paymentType) {
        this.id = id;
        this.name = name;
        this.paymentType = paymentType;
    }

    public String getId() { return id; }

    public String getName() {
        return name;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", paymentType=" + paymentType + "]";
    }

}
