
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
Warehouse warehouse = new Warehouse(scanner);
        int choice;

        do {
            System.out.println("\n===== PERISHABLE FOOD WAREHOUSE DISPATCH SYSTEM =====");
            System.out.println("1. Add Food Batch");
            System.out.println("2. Display Inventory");
            System.out.println("3. Dispatch Food");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    warehouse.addFoodBatch();
                    break;

                case 2:
                    warehouse.displayInventory();
                    break;

                case 3:
                    warehouse.dispatchFood();
                    break;

                case 4:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
