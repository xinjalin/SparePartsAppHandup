import java.util.*;

public class MenuOptions {
    private final Scanner input = new Scanner(System.in);
    ReadFile fileInMemory = new ReadFile();
    ArrayList<String> customerArrayList = fileInMemory.readFileCustomers();
    ArrayList<String> sparePartsArrayList = fileInMemory.readFileSpareParts();

    public void display() {
        System.out.println("-- Actions --");
        System.out.println(
                """
                        Select an option:\s
                          1) Add a new customer\s
                          2) Add a new spare part\s
                          3) Create an order\s
                          4) Exit - close program\s
                        \s""");

        int selection = input.nextInt();
        input.nextLine();

        switch (selection) {
            case 1 -> this.addCustomer();
            case 2 -> this.addSparePart();
            case 3 -> this.createOrder();
            case 4 -> this.exit();
            default -> System.out.println("Invalid selection.");
        }

    }

    private void addCustomer() {
        System.out.println("Enter customer ID: ");
        String customerID = input.nextLine();
        System.out.println("Enter customer name: ");
        String customerName = input.nextLine();
        System.out.println("Enter customer payment type cash or card: ");
        String customerPaymentType = input.nextLine();

        String customer = "[" + customerID + "," + customerName + "," + customerPaymentType + "]";
        // convert to string first id name payment type

        customerArrayList.add(customer);

        WriteFile.writeFileCustomers(customer);
    }
    private void addSparePart() {
        System.out.println("Enter spare part name: ");
        String sparePartName = input.nextLine();
        System.out.println("Is the part genuine T or F: ");
        String sparePartGenuine = input.nextLine();

        String sparePart = "[" + sparePartName + "," + sparePartGenuine + "]";

        sparePartsArrayList.add(sparePart);

        WriteFile.writeFileSpareParts(sparePart);
    }

    private void createOrder() {
        System.out.println("-- Actions --");
        System.out.println(
                """
                        Select an option:\s
                          1) Select a customer\s
                          2) Select a part\s
                          3) Save order\s
                          4) Back to main menu\s
                        \s""");

        int selection = input.nextInt();
        input.nextLine();

        switch (selection) {
            case 1 -> this.selectCustomer();
            case 2 -> this.selectSparePart();
            case 3 -> this.saveOrder();
            case 4 -> this.display();
            default -> System.out.println("Invalid selection.");
        }
    }

    private void selectSparePart() {

    }

    private void selectCustomer() {
        customerArrayList.forEach(System.out::println);
        System.out.println("Enter customer ID: ");
        String customerID = input.nextLine();
        String selectedCustomer;

        switch (customerID) {
            case "1" -> {
                System.out.println("Customer 1 selected");
                selectedCustomer = customerArrayList.get(0);
                selectedCustomer = selectedCustomer.replace("[", "");
                selectedCustomer = selectedCustomer.replace("]", "");
                String[] selectedCustomerArray = selectedCustomer.split(",");

                Customer customerInMenu = new Customer(selectedCustomerArray[0], selectedCustomerArray[1], selectedCustomerArray[2]);
                System.out.println(customerInMenu.id());
                System.out.println(customerInMenu.name());
                System.out.println(customerInMenu.paymentType());
            }
            case "2" -> {
                System.out.println("Customer 2 selected");
                selectedCustomer = customerArrayList.get(1);
                selectedCustomer = selectedCustomer.replace("[", "");
                selectedCustomer = selectedCustomer.replace("]", "");
                String[] selectedCustomerArray = selectedCustomer.split(",");

                Customer customerInMenu = new Customer(selectedCustomerArray[0], selectedCustomerArray[1], selectedCustomerArray[2]);
                System.out.println(customerInMenu.id());
                System.out.println(customerInMenu.name());
                System.out.println(customerInMenu.paymentType());
            }
            case "3" -> {
                System.out.println("Customer 3 selected");
                selectedCustomer = customerArrayList.get(2);
                selectedCustomer = selectedCustomer.replace("[", "");
                selectedCustomer = selectedCustomer.replace("]", "");
                String[] selectedCustomerArray = selectedCustomer.split(",");

                Customer customerInMenu = new Customer(selectedCustomerArray[0], selectedCustomerArray[1], selectedCustomerArray[2]);
                System.out.println(customerInMenu.id());
                System.out.println(customerInMenu.name());
                System.out.println(customerInMenu.paymentType());
            }
            case "4" -> {
                System.out.println("Customer 4 selected");
                selectedCustomer = customerArrayList.get(3);
                selectedCustomer = selectedCustomer.replace("[", "");
                selectedCustomer = selectedCustomer.replace("]", "");
                String[] selectedCustomerArray = selectedCustomer.split(",");

                Customer customerInMenu = new Customer(selectedCustomerArray[0], selectedCustomerArray[1], selectedCustomerArray[2]);
                System.out.println(customerInMenu.id());
                System.out.println(customerInMenu.name());
                System.out.println(customerInMenu.paymentType());
            }
            default -> System.out.println("Invalid selection please input 1 - 4 for your selection.");
        }

    }

    private void saveOrder() {

        int orderNumber = OrderNumberGen.generateOrderNumber();
        System.out.println(orderNumber);


    }

    private void exit() {
        System.out.println("Exiting...");
        System.exit(1);
    }

}
