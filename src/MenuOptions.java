import java.util.*;

public class MenuOptions {
    private final Scanner input = new Scanner(System.in);
    public ReadFile fileInMemory = new ReadFile();
    public ArrayList<String> customerArrayList = fileInMemory.readFileCustomers();
    public ArrayList<String> sparePartsArrayList = fileInMemory.readFileSpareParts();

    public ArrayList<Customer> customers = new ArrayList<>();
    public ArrayList<SparePartsObj> spareParts = new ArrayList<>();

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

        String selection = input.nextLine();

        switch (selection) {
            case "1" -> this.addCustomer();
            case "2" -> this.addSparePart();
            case "3" -> this.createOrder();
            case "4" -> this.exit();
            default -> {
                System.out.println("Invalid selection.");
                display();
            }
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
        System.out.println("Customer added");
        display();
    }
    private void addSparePart() {
        System.out.println("Enter spare part name: ");
        String sparePartName = input.nextLine();
        System.out.println("Is the part genuine true or false: ");
        String sparePartGenuine = input.nextLine();

        String sparePart = "[" + sparePartName + "," + sparePartGenuine + "]";

        sparePartsArrayList.add(sparePart);

        WriteFile.writeFileSpareParts(sparePart);
        System.out.println("Spare part added");
        display();
    }

    private void createOrder() {
        System.out.println("-- Actions --");
        System.out.println(
                """
                        Select an option:\s
                          1) Select a customer\s
                          2) Select a part\s
                          3) Save order - Only save once a customer and a spare parts has been selected\s
                          4) Back to main menu\s
                        \s""");

        String selection = input.nextLine();

        switch (selection) {
            case "1" -> this.selectCustomer();
            case "2" -> this.selectSparePart();
            case "3" -> this.saveOrder();
            case "4" -> this.display();
            default -> {
                System.out.println("Invalid selection.");
                createOrder();
            }
        }
    }

    private void selectSparePart() {
        // similar to select customer
        sparePartsArrayList.forEach(System.out::println);
        System.out.println("Enter the name of the spare part: ");
        String sparePartName = input.nextLine();
        String selectedSparePart;

        switch (sparePartName) {
            case "keyboard" -> {
                System.out.println("Keyboard selected");
                selectedSparePart = sparePartsArrayList.get(0);
                selectedSparePart = selectedSparePart.replace("[", "");
                selectedSparePart = selectedSparePart.replace("]", "");
                selectedSparePart = selectedSparePart.replace(" ", "");
                String[] selectedSparePartArray = selectedSparePart.split(",");

                SparePartsObj sparePartInMenu = new SparePartsObj(selectedSparePartArray[0], Boolean.valueOf(selectedSparePartArray[1]));
                spareParts.add(sparePartInMenu);
                createOrder();
            }
            case "mouse" -> {
                System.out.println("Mouse selected");
                selectedSparePart = sparePartsArrayList.get(1);
                selectedSparePart = selectedSparePart.replace("[", "");
                selectedSparePart = selectedSparePart.replace("]", "");
                selectedSparePart = selectedSparePart.replace(" ", "");
                String[] selectedSparePartArray = selectedSparePart.split(",");

                SparePartsObj sparePartInMenu = new SparePartsObj(selectedSparePartArray[0], Boolean.valueOf(selectedSparePartArray[1]));
                spareParts.add(sparePartInMenu);
                createOrder();
            }
            case "monitor" -> {
                System.out.println("Monitor selected");
                selectedSparePart = sparePartsArrayList.get(2);
                selectedSparePart = selectedSparePart.replace("[", "");
                selectedSparePart = selectedSparePart.replace("]", "");
                selectedSparePart = selectedSparePart.replace(" ", "");
                String[] selectedSparePartArray = selectedSparePart.split(",");

                SparePartsObj sparePartInMenu = new SparePartsObj(selectedSparePartArray[0], Boolean.valueOf(selectedSparePartArray[1]));
                spareParts.add(sparePartInMenu);
                createOrder();
            }
            case "headset" -> {
                System.out.println("Headset selected");
                selectedSparePart = sparePartsArrayList.get(3);
                selectedSparePart = selectedSparePart.replace("[", "");
                selectedSparePart = selectedSparePart.replace("]", "");
                selectedSparePart = selectedSparePart.replace(" ", "");
                String[] selectedSparePartArray = selectedSparePart.split(",");

                SparePartsObj sparePartInMenu = new SparePartsObj(selectedSparePartArray[0], Boolean.valueOf(selectedSparePartArray[1]));
                spareParts.add(sparePartInMenu);
                createOrder();
            }
            default -> {
                System.out.println("Invalid input");
                selectSparePart();
            }
        }
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
                customers.add(customerInMenu);
                createOrder();
            }
            case "2" -> {
                System.out.println("Customer 2 selected");
                selectedCustomer = customerArrayList.get(1);
                selectedCustomer = selectedCustomer.replace("[", "");
                selectedCustomer = selectedCustomer.replace("]", "");
                String[] selectedCustomerArray = selectedCustomer.split(",");

                Customer customerInMenu = new Customer(selectedCustomerArray[0], selectedCustomerArray[1], selectedCustomerArray[2]);
                customers.add(customerInMenu);
                createOrder();
            }
            case "3" -> {
                System.out.println("Customer 3 selected");
                selectedCustomer = customerArrayList.get(2);
                selectedCustomer = selectedCustomer.replace("[", "");
                selectedCustomer = selectedCustomer.replace("]", "");
                String[] selectedCustomerArray = selectedCustomer.split(",");

                Customer customerInMenu = new Customer(selectedCustomerArray[0], selectedCustomerArray[1], selectedCustomerArray[2]);
                customers.add(customerInMenu);
                createOrder();
            }
            case "4" -> {
                System.out.println("Customer 4 selected");
                selectedCustomer = customerArrayList.get(3);
                selectedCustomer = selectedCustomer.replace("[", "");
                selectedCustomer = selectedCustomer.replace("]", "");
                String[] selectedCustomerArray = selectedCustomer.split(",");

                Customer customerInMenu = new Customer(selectedCustomerArray[0], selectedCustomerArray[1], selectedCustomerArray[2]);
                customers.add(customerInMenu);
                createOrder();
            }
            default -> {
                System.out.println("Invalid selection please input 1 - 4 for your selection.");
                selectCustomer();
            }
        }

    }

    private void saveOrder() {
        System.out.println("Saving order...");

        int orderNumber = OrderNumberGen.generateOrderNumber();
        // System.out.println(orderNumber);

        String customerName = customers.get(0).name();
        String customerID = customers.get(0).id();
        String paymentType = customers.get(0).paymentType();

        // for (int i = 0; i < spareParts.size(); i++) {
        String sparePartName = spareParts.get(0).name();
        Boolean sparePartGenuine = spareParts.get(0).genuine();

        String allGenuine;

        // check if the order has genuine spare parts
        if (spareParts.get(0).genuine()) {
            allGenuine = "1";
        } else  {
            allGenuine = "0";

        }

        // create order object
        OrderObject orderObject = new OrderObject(orderNumber, customerName, customerID, paymentType, sparePartGenuine, allGenuine, sparePartName);

        // write to file
        WriteFile.writeFileOrders(orderObject.toString());
        System.out.println("Order saved");
        System.out.println("Returning to the Main Menu...");
        display();
    }

    private void exit() {
        System.out.println("Exiting...");
        System.exit(1);
    }

}
