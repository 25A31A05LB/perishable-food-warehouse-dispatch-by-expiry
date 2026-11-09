
import java.util.ArrayList;

public class MinHeap {
    private ArrayList<FoodBatch> heap = new ArrayList<>();

    public void insert(FoodBatch batch) {
        heap.add(batch);
        int index = heap.size() - 1;

        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap.get(parent).expiryDate
                    .compareTo(heap.get(index).expiryDate) <= 0) {
                break;
            }

            swap(parent, index);
            index = parent;
        }
    }

    public FoodBatch extractMin() {
        if (heap.isEmpty()) {
            return null;
        }

        FoodBatch min = heap.get(0);
        FoodBatch last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapify(0);
        }

        return min;
    }

    private void heapify(int index) {
        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heap.size() &&
                heap.get(left).expiryDate
                .isBefore(heap.get(smallest).expiryDate)) {
            smallest = left;
        }

        if (right < heap.size() &&
                heap.get(right).expiryDate
                .isBefore(heap.get(smallest).expiryDate)) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        FoodBatch temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void display() {
        if (heap.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (FoodBatch batch : heap) {
            System.out.println(batch);
        }
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
