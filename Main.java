public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 16);
        
        System.out.println("=== Person 1 ===");
        person1.displayDetails();
        person1.checkAdult();
        
        System.out.println("\n=== Person 2 ===");
        person2.displayDetails();
        person2.checkAdult();
        
        System.out.println("\n=== Testing Getters/Setters ===");
        person1.setName("Alice Smith");
        person1.setAge(26);
        
        System.out.println("Updated Name: " + person1.getName());
        System.out.println("Updated Age: " + person1.getAge());
        person1.checkAdult();
    }
}