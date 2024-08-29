package PizzaBill;

public class Pizza {
    
    private static final int VEG_PIZZA_PRICE = 300;
    private static final int NON_VEG_PIZZA_PRICE = 400;
    private static final int EXTRA_CHEESE_PRICE = 100;
    private static final int EXTRA_TOPPINGS_PRICE = 150;
    private static final int BAG_PACK_PRICE = 20;
    
    private boolean veg;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedTakeAway = false;

    // Constructor to set pizza type and base price
    public Pizza(boolean veg) {
        this.veg = veg;
    }

    // Methods to add extra cheese, toppings, or take away
    public void addExtraCheese() {
        isExtraCheeseAdded = true;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
    }

    public void takeAway() {
        isOptedTakeAway = true;
    }

    // Method to calculate the current price
    private int calculateTotalPrice() {
        int totalPrice = veg ? VEG_PIZZA_PRICE : NON_VEG_PIZZA_PRICE;
        
        if (isExtraCheeseAdded) {
            totalPrice += EXTRA_CHEESE_PRICE;
        }
        
        if (isExtraToppingsAdded) {
            totalPrice += EXTRA_TOPPINGS_PRICE;
        }
        
        if (isOptedTakeAway) {
            totalPrice += BAG_PACK_PRICE;
        }
        
        return totalPrice;
    }

    // Method to print the bill
    public void printBill() {
        StringBuilder bill = new StringBuilder();
        int basePrice = veg ? VEG_PIZZA_PRICE : NON_VEG_PIZZA_PRICE;
        
        bill.append("Base Pizza Price: ").append(basePrice).append("\n");

        if (isExtraCheeseAdded) {
            bill.append("Extra Cheese Added: ").append(EXTRA_CHEESE_PRICE).append("\n");
        }

        if (isExtraToppingsAdded) {
            bill.append("Extra Toppings Added: ").append(EXTRA_TOPPINGS_PRICE).append("\n");
        }

        if (isOptedTakeAway) {
            bill.append("Take Away: ").append(BAG_PACK_PRICE).append("\n");
        }

        bill.append("Total Bill: ").append(calculateTotalPrice()).append("\n");
        System.out.println(bill.toString());
    }

}
