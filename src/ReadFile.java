import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {

    public ArrayList<String> readFileSpareParts() {
        ArrayList<String> result = new ArrayList<>();
        try {
            // Open Customers.txt read lines. then split the stored line string to an array at the comma
            File fileReadObject = new File("src\\SpareParts.txt");
            Scanner fileReader = new Scanner(fileReadObject);
            while (fileReader.hasNextLine()) {
                String customerDataLine = fileReader.nextLine();

                // to clean string of ""
                customerDataLine = customerDataLine.replace("\"", "");
                customerDataLine = customerDataLine.replace("[", "");
                customerDataLine = customerDataLine.replace("]", "");
                String[] resultSplit = customerDataLine.split(",");
                result.add(Arrays.toString(resultSplit));
                // System.out.println(Arrays.toString(rawCustomerData));
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<String> readFileCustomers() {
        ArrayList<String> result = new ArrayList<>();
        try {
            // Open Customers.txt read lines. then split the stored line string to an array at the comma
            File fileReadObject = new File("src\\Customers.txt");
            Scanner fileReader = new Scanner(fileReadObject);
            while (fileReader.hasNextLine()) {
                String customerDataLine = fileReader.nextLine();

                // to clean string of ""
                customerDataLine = customerDataLine.replace("\"", "");
                customerDataLine = customerDataLine.replace("[", "");
                customerDataLine = customerDataLine.replace("]", "");
                result.add(Arrays.toString(customerDataLine.split(",")));
                // System.out.println(Arrays.toString(rawCustomerData));
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return result;
    }
    // read file OrderNumber.txt and return the order number as an array list
    public ArrayList<String> readFileOrderNumber() {
        ArrayList<String> result = new ArrayList<>();
        try {
            // Open Customers.txt read lines. then split the stored line string to an array at the comma
            File fileReadObject = new File("src\\OrderNumbers.txt");
            Scanner fileReader = new Scanner(fileReadObject);
            while (fileReader.hasNextLine()) {
                String customerDataLine = fileReader.nextLine();

                // to clean string of ""
                customerDataLine = customerDataLine.replace("\"", "");
                customerDataLine = customerDataLine.replace("[", "");
                customerDataLine = customerDataLine.replace("]", "");
                result.add(Arrays.toString(customerDataLine.split(",")));
                // System.out.println(Arrays.toString(rawCustomerData));
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return result;
    }
}
