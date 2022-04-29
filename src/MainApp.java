import java.util.ArrayList;
public class MainApp {
    public static void main(String[] args) {
        ReadFile customerFileInMemory = new ReadFile();

        ArrayList<String> customerArrayList;
        ArrayList<String> sparePartsArrayList;

        customerArrayList = customerFileInMemory.readFileCustomers();
        sparePartsArrayList = customerFileInMemory.readFileSpareParts();

        System.out.println(customerArrayList);
        System.out.println(sparePartsArrayList);

    }
}
