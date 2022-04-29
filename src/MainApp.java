import java.util.ArrayList;
public class MainApp {
    public static void main(String[] args) {
        ReadFile fileInMemory = new ReadFile();

        ArrayList<String> customerArrayList;
        ArrayList<String> sparePartsArrayList;

        customerArrayList = fileInMemory.readFileCustomers();
        sparePartsArrayList = fileInMemory.readFileSpareParts();

        System.out.println(customerArrayList);
        System.out.println(sparePartsArrayList);

        MenuOptions menu = new MenuOptions();
        menu.display();

    }
}
