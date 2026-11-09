
import java.time.LocalDate;
import java.util.Scanner;

public class Warehouse {
    private MinHeap minHeap = new MinHeap();
    private Scanner scanner;

public Warehouse(Scanner scanner) {
    this.scanner = scanner;
}
    public void addFoodBatch() {
        System.out.print("Enter Batch ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Food Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        String date = scanner.next();

        LocalDate expiryDate = LocalDate.parse(date);

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        if (expiryDate.isBefore(LocalDate.now())) {
            System.out.println("Cannot add expired food.");
            return;
        }

        FoodBatch batch = new FoodBatch(id, name, quantity, expiryDate);
        minHeap.insert(batch);

        System.out.println("Food batch added successfully!");
    }

    public void displayInventory() {
        System.out.println("\n--- Warehouse Inventory ---");
        minHeap.display();
    }

    public void dispatchFood() {
        FoodBatch batch = minHeap.extractMin();

        if (batch == null) {
            System.out.println("No food batches available.");
            return;
        }

        if (batch.expiryDate.isBefore(LocalDate.now())) {
            System.out.println("Batch expired. Cannot dispatch.");
            return;
        }

        System.out.println("\nDispatched Food Batch:");
        System.out.println(batch);
    }
}
