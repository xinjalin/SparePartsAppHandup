import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteFile {
    public static void writeFileOrders(ArrayList<String> orders) {
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
}
