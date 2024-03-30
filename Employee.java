package Task.Task_10;

public class Employee {
        private int id;
        private String firstName;
        private String lastName;
        private int salary;
    
        // Constructor
        public Employee(int id, String firstName, String lastName, int salary) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }
    
        // Getter methods
        public int getID() {
            return id;
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public String getName() {
            return firstName + " " + lastName;
        }
    
        public int getSalary() {
            return salary;
        }
    
        // Setter method for salary
        public void setSalary(int salary) {
            this.salary = salary;
        }
    
        // Method to get annual salary
        public int getAnnualSalary() {
            return salary * 12;
        }
    
        // Method to raise salary by percentage
        public void raiseSalary(int percent) {
            double raise = salary * (percent / 100.0);
            salary += raise;
        }
    
        // toString method to represent Employee details
        public String toString() {
            return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
        }
    
        // Main method to test the Employee class
        public static void main(String[] args) {
            Employee emp = new Employee(1, "Moses", "S.J", 50000);
            System.out.println("Original Salary: " + emp.getSalary());
            emp.raiseSalary(10); // Raise salary by 10%
            System.out.println("New Salary after raise: " + emp.getSalary());
            System.out.println(emp);
        }
}
    
    

