import java.util.*;
public class OrderNumberGen {
    static ReadFile fileInMemory = new ReadFile();
    static ArrayList<String> orderNumberList = fileInMemory.readFileOrderNumber();
    public static int generateOrderNumber() {

        int test = randInt();

        while (orderNumberList.contains(String.valueOf(test))) {
            // System.out.println("Duplicate Detected");
            test = randInt();
        }
            // System.out.println("dose not contain");
            orderNumberList.add(String.valueOf(test));

            WriteFile.writeFileOrderNumbers(String.valueOf(test));

        return test;
    }
    private static int randInt() {
        Random rand = new Random();
        return rand.nextInt((99999 - 10000) + 1) + 10000;
    }
}




