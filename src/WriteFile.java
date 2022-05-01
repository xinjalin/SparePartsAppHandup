import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    public static void writeFileOrders(String orders) {
    // Write to file Orders.txt but do not replace lines that already exist in the file
        try{
            FileWriter stream = new FileWriter("src\\Orders.txt",true);
            BufferedWriter out = new BufferedWriter(stream);
            out.write(orders+"\n");
            out.close();
        }catch (IOException e){
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }
    }

    public static void writeFileCustomers(String customerArrayList) {
    // Write to file Customers.txt but do not replace lines that already exist in the file
        try{
            FileWriter stream = new FileWriter("src\\Customers.txt",true);
            BufferedWriter out = new BufferedWriter(stream);
            out.write(customerArrayList+"\n");
            out.close();
        }catch (IOException e){
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }
    }
    // write generated numbers to file OrderNumbers.txt but do not replace lines that already exist in the file
    public static void writeFileOrderNumbers(String orderNumbers) {
        try{
            FileWriter stream = new FileWriter("src\\OrderNumbers.txt",true);
            PrintWriter out = new PrintWriter(stream);
            out.write(orderNumbers+"\n");
            out.close();
        }catch (IOException e){
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }
    }
    // write new spare parts to file SpareParts.txt but do not replace lines that already exist in the file
    public static void writeFileSpareParts(String sparePart) {
        try{
            FileWriter stream = new FileWriter("src\\SpareParts.txt",true);
            PrintWriter out = new PrintWriter(stream);
            out.write(sparePart+"\n");
            out.close();
        }catch (IOException e){
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }
    }
}
