public class Main {
    public static void main(String[] args) {
        System.out.println("=== Animal Examples ===");
        Animal dog = new Dog();
        dog.makeSound();
        dog.eat();
        
        System.out.println("\n=== Vehicle Examples ===");
        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}
