import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ReadFile customerFileInMemory = new ReadFile();

        // ArrayList<String> customerArrayList = new ArrayList<>();
        // customerArrayList.add(Arrays.toString(customerFileInMemory.readFileCustomers()));

        // System.out.println(customerArrayList);

        /*String[] test = customerFileInMemory.readFileCustomers();
        String[] testTwo = customerFileInMemory.readFileSpareParts();

        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(testTwo));*/

        ArrayList<String> customerArrayList = new ArrayList<>();

        customerArrayList = customerFileInMemory.result();

        System.out.println(customerArrayList);


    }
}
