package Task.Task_10;

public class Tea_Prepare {
    // Method to prepare basic tea
    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves.");
    }

    // Method to add milk to tea
    public void addMilk() {
        System.out.println("Adding milk to tea.");
    }

    // Method to add sugar to tea
    public void addSugar() {
        System.out.println("Adding sugar to tea.");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a Tea object
        Tea_Prepare myTea = new Tea_Prepare();

        // Preparing basic tea
        System.out.println("Step 1:");
        myTea.prepareTea();
        System.out.println();

        // Adding milk
        System.out.println("Step 2:");
        myTea.addMilk();
        System.out.println();

        // Adding sugar
        System.out.println("Step 3:");
        myTea.addSugar();
    }
    
}
