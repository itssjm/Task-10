package Task.Task_10;

class Tea {
    void prepareTea() {
        System.out.println("Preparing Tea");
    }
}

class BlackTea extends Tea {
    @Override
    void prepareTea() {
        System.out.println("Preparing Black Tea");
    }
}

class GreenTea extends Tea {
    @Override
    void prepareTea() {
        System.out.println("Preparing Green Tea");
    }
}

public class Main {
    public static void main(String[] args) {
        Tea[] teaArray = new Tea[3];
        teaArray[0] = new Tea();       // Creating a Tea instance
        teaArray[1] = new BlackTea();  // Creating a BlackTea instance
        teaArray[2] = new GreenTea();  // Creating a GreenTea instance

        for (Tea tea : teaArray) {
            tea.prepareTea();
        }
    }
}