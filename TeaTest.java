package Task.Task_10;

// Parent class Tea
class Tea {
    // Method to prepare tea
    public void prepareTea() {
        // Default preparation
        System.out.println("Boil water");
        System.out.println("Steep the tea");
        System.out.println("Pour into cup");
    }
}

// Subclass BlackTea
class BlackTea extends Tea {
    // Overriding prepareTea method for Black Tea
    @Override
    public void prepareTea() {
        System.out.println("Boil water");
        System.out.println("Steep black tea leaves");
        System.out.println("Add milk and sugar");
        System.out.println("Pour into cup");
    }
}

// Subclass GreenTea
class GreenTea extends Tea {
    // Overriding prepareTea method for Green Tea
    @Override
    public void prepareTea() {
        System.out.println("Boil water");
        System.out.println("Steep green tea leaves");
        System.out.println("Add honey or lemon");
        System.out.println("Pour into cup");
    }
}

// Subclass HerbalTea
class HerbalTea extends Tea {
    // Overriding prepareTea method for Herbal Tea
    @Override
    public void prepareTea() {
        System.out.println("Boil water");
        System.out.println("Steep herbal tea mix");
        System.out.println("Add herbs like peppermint or chamomile");
        System.out.println("Pour into cup");
    }
}

// Main class to test
public class TeaTest {
    public static void main(String[] args) {
        // Prepare Black Tea
        System.out.println("Preparing Black Tea:");
        BlackTea blackTea = new BlackTea();
        blackTea.prepareTea();

        System.out.println(); // Empty line for clarity

        // Prepare Green Tea
        System.out.println("Preparing Green Tea:");
        GreenTea greenTea = new GreenTea();
        greenTea.prepareTea();

        System.out.println(); // Empty line for clarity

        // Prepare Herbal Tea
        System.out.println("Preparing Herbal Tea:");
        HerbalTea herbalTea = new HerbalTea();
        herbalTea.prepareTea();
    }
}
