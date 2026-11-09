# Test Cases – Perishable Food Warehouse Dispatch System

| Test Case | Input | Expected Result |
|---|---|---|
| Add Food | Valid food details | Food batch added successfully |
| Invalid Quantity | Quantity = 0 | Error message displayed |
| Expired Food | Past expiry date | Cannot add expired food |
| Display Inventory | Select option 2 | Available food batches displayed |
| Dispatch Food | Select option 3 | Earliest-expiry batch dispatched |
| Empty Inventory | Dispatch without adding food | No food batches available |
| Exit | Select option 4 | Program exits successfully |

## Sample Test

**Input:**
- Milk – Expiry Date: 2026-11-20
- Bread – Expiry Date: 2026-11-15

**Expected Output:**

Bread should be dispatched first because it has the earliest expiry date.

## Conclusion

The test cases verify that the system adds food batches, validates expiry dates, displays inventory, and dispatches food in the correct order.