import java.util.*;

public class Foodorderingsystem {
    private List<String> menu = new ArrayList<>();  // Stores menu items
    private Map<Integer, List<String>> orders = new HashMap<>();  // Order ID → List of items
    private Queue<Integer> pendingOrders = new LinkedList<>();  // Stores pending order IDs
    private Stack<Integer> deliveredOrders = new Stack<>();  // Stores completed order IDs
    private Set<String> categories = new HashSet<>();  // Stores unique food categories
    private int orderIdCounter = 1;  // Order ID generator

    // Add a new food item to the menu
    public void addFoodItem(String item, String category) {
        menu.add(item);
        categories.add(category);
        System.out.println("Added: " + item + " (" + category + ")");
    }

    // Display the menu
    public void showMenu() {
        if (menu.isEmpty()) {
            System.out.println("Menu is empty!");
            return;
        }
        System.out.println("\n📜 MENU:");
        for (String item : menu) {
            System.out.println("- " + item);
        }
    }

    // Place an order
    public void placeOrder(List<String> items) {
        orders.put(orderIdCounter, items);
        pendingOrders.add(orderIdCounter);
        System.out.println("✅ Order #" + orderIdCounter + " placed: " + items);
        orderIdCounter++;
    }

    // Deliver an order
    public void deliverOrder() {
        if (pendingOrders.isEmpty()) {
            System.out.println("No pending orders!");
            return;
        }
        int orderId = pendingOrders.poll();
        deliveredOrders.push(orderId);
        System.out.println("🚚 Order #" + orderId + " delivered!");
    }

    // Show pending deliveries
    public void showPendingDeliveries() {
        if (pendingOrders.isEmpty()) {
            System.out.println("No pending deliveries!");
            return;
        }
        System.out.println("\n📦 PENDING DELIVERIES:");
        for (int orderId : pendingOrders) {
            System.out.println("- Order #" + orderId + ": " + orders.get(orderId));
        }
    }

    // Show delivered orders
    public void showDeliveredOrders() {
        if (deliveredOrders.isEmpty()) {
            System.out.println("No delivered orders!");
            return;
        }
        System.out.println("\n✅ DELIVERED ORDERS:");
        for (int orderId : deliveredOrders) {
            System.out.println("- Order #" + orderId + ": " + orders.get(orderId));
        }
    }

    // Show all food categories
    public void showFoodCategories() {
        if (categories.isEmpty()) {
            System.out.println("No food categories available!");
            return;
        }
        System.out.println("\n🍽 FOOD CATEGORIES:");
        for (String category : categories) {
            System.out.println("- " + category);
        }
    }

   
    public static void main(String[] args) {
        FoodOrderingSystem system = new FoodOrderingSystem();

        // Adding food items
        system.addFoodItem("Margherita Pizza", "Pizza");
        system.addFoodItem("Chocolate Cake", "Dessert");
        system.addFoodItem("Coca Cola", "Drinks");

        // Showing menu
        system.showMenu();

        // Placing orders
        system.placeOrder(Arrays.asList("Margherita Pizza", "Coca Cola"));
        system.placeOrder(Arrays.asList("Chocolate Cake"));

        // Showing pending deliveries
        system.showPendingDeliveries();

        // Delivering an order
        system.deliverOrder();
        
        // Showing pending & delivered orders
        system.showPendingDeliveries();
        system.showDeliveredOrders();

        // Displaying food categories
        system.showFoodCategories();
    }
}
