
import java.time.LocalDate;

public class FoodBatch {
    int id;
    String name;
    int quantity;
    LocalDate expiryDate;

    public FoodBatch(int id, String name, int quantity, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Food: " + name +
               ", Quantity: " + quantity +
               ", Expiry Date: " + expiryDate;
    }
}
