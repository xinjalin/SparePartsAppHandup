import java.util.ArrayList;
import java.util.Scanner;

public class MenuOptions {
    private final Scanner input = new Scanner(System.in);
    ReadFile fileInMemory = new ReadFile();
    ArrayList<String> customerArrayList = fileInMemory.readFileCustomers();
    ArrayList<String> sparePartsArrayList = fileInMemory.readFileSpareParts();

    public void menu() {
        System.out.println("1. Add a customer");
        System.out.println("2. Add a spare part");
        System.out.println("3. Search for a customer");
        System.out.println("4. Search for a spare part");
        System.out.println("5. Exit");
    }

    public void addCustomer() {
        System.out.println("Enter customer name: ");
        String customerName = input.nextLine();
        System.out.println("Enter customer address: ");
        String customerAddress = input.nextLine();
        System.out.println("Enter customer phone number: ");
        String customerPhoneNumber = input.nextLine();
        System.out.println("Enter customer email: ");
        String customerEmail = input.nextLine();
        System.out.println("Enter customer password: ");
        String customerPassword = input.nextLine();

        String customer = customerName + "," + customerAddress + "," + customerPhoneNumber + "," + customerEmail + "," + customerPassword;

        customerArrayList.add(customer);
    }

    public void addSparePart() {
        System.out.println("Enter spare part name: ");
        String sparePartName = input.nextLine();
        System.out.println("Enter spare part price: ");
        String sparePartPrice = input.nextLine();
        System.out.println("Enter spare part quantity: ");
        String sparePartQuantity = input.nextLine();

        String sparePart = sparePartName + "," + sparePartPrice + "," + sparePartQuantity;

        sparePartsArrayList.add(sparePart);
    }

    public void searchCustomer() {
        System.out.println("Enter customer name: ");
        String customerName = input.nextLine();
        for (String customer : customerArrayList) {
            if (customer.contains(customerName)) {
                System.out.println(customer);
            }
        }
    }

    public void searchSparePart() {
        System.out.println("Enter spare part name: ");
        String sparePartName = input.nextLine();
        for (String sparePart : sparePartsArrayList) {
            if (sparePart.contains(sparePartName)) {
                System.out.println(sparePart);
            }
        }

    }
    public void display() {
        System.out.println("-- Actions --");
        System.out.println(
                """
                        Select an option:\s
                          1) Run
                          2) Jump
                          3) Page 2 this page loops\s
                          4) Exit
                        \s""");

        int selection = input.nextInt();
        input.nextLine();

        switch (selection) {
            case 1 -> this.run();
            case 2 -> this.jump();
            case 3 -> this.page2();
            case 4 -> this.exit();
            default -> System.out.println("Invalid selection.");
        }

    }
    public void display2() {
        display: while(true) {
            System.out.println("-- Secret Actions --");
            System.out.println(
                    """
                            Select an option:\s
                              1) Dive
                              2) High Jump
                              3) Back8
                            \s"""
            );
            int selection = input.nextInt();
            input.nextLine();

            switch (selection) {
                case 1:
                    this.run();
                    break;
                case 2:
                    this.jump();
                    break;
                case 3:
                    System.out.println("Returning...");
                    display();
                    break display;
                default:
                    System.out.println("Invalid action.");
                    break;
            }

        }

    }

    private void run() {
        System.out.println(customerArrayList);
        WriteFile.writeFileOrders(customerArrayList);

        System.out.println("Running...");
    }

    private void jump() {
        System.out.println("Jumping...");
    }

    private void page2() {
        display2();
    }
    private void exit() {
        System.out.println("Exiting...");
        System.exit(1);
    }

}
