package Task.Task_10;

public class Circle {
        // Data member
        private double radius;
    
        // No-argument constructor
        public Circle() {
            // Default radius set to 1
            this.radius = 1;
        }
    
        // Constructor with one argument
        public Circle(double radius) {
            // Initialize radius with the provided value
            this.radius = radius;
        }
    
        // Method to calculate circumference
        public double calculateCircumference() {
            return 2 * Math.PI * radius;
        }
    
        // Main method for testing
        public static void main(String[] args) {
            // Creating Circle objects with different constructors
            Circle circle1 = new Circle(); // No-argument constructor
            Circle circle2 = new Circle(5); // Constructor with one argument
    
            // Displaying circumference of circles
            System.out.println("Circumference of Circle 1 with radius " + circle1.radius + ": " + circle1.calculateCircumference());
            System.out.println("Circumference of Circle 2 with radius " + circle2.radius + ": " + circle2.calculateCircumference());
        }
    
    
    
}
