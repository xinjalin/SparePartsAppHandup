import java.util.Scanner;

public class MenuOptions {
    private final Scanner input = new Scanner(System.in);
    public void display() {
        System.out.println("-- Actions --");
        System.out.println(
                """
                        Select an option:\s
                          1) Run
                          2) Jump
                          3) Page 2\s
                          4) Exit
                        \s""");

        int selection = input.nextInt();
        input.nextLine();
        // continues...
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
    }

    private void jump() {
    }

    private void page2() {
        display2();
    }
    private void exit() {
        System.out.println("Exiting...");
        System.exit(1);
    }

}
