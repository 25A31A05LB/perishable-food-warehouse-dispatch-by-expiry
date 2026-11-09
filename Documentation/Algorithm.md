# Algorithm – Perishable Food Warehouse Dispatch System

## 1. Introduction
The project uses a Min-Heap data structure to manage perishable food batches based on their expiry dates.

## 2. Algorithm for Adding Food
1. Start the program.
2. Enter the batch ID.
3. Enter the food name.
4. Enter the quantity.
5. Enter the expiry date.
6. Check whether the quantity is greater than zero.
7. Check whether the expiry date is valid and not in the past.
8. Insert the food batch into the Min-Heap.
9. Display a success message.

## 3. Algorithm for Displaying Inventory
1. Check whether the Min-Heap is empty.
2. If it is empty, display "Inventory is empty".
3. Otherwise, display all available food batches.

## 4. Algorithm for Dispatching Food
1. Check whether the Min-Heap is empty.
2. If it is empty, display "No food batches available".
3. Otherwise, extract the root element from the Min-Heap.
4. The root element contains the earliest expiry date.
5. Check whether the batch is expired.
6. If it is not expired, dispatch the food batch.
7. Display the dispatched batch details.

## 5. Time Complexity
- Insertion: O(log n)
- Dispatch (extract minimum): O(log n)
- Checking the minimum element: O