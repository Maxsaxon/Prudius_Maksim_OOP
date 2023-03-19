public class Main {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog dog1 = new Dog("Fido", 5, "Labrador Retriever", true);
        // Create a clone of dog1
        Dog dog2 = dog1.clone();
        // Test the equals() method
        System.out.println("dog1.equals(dog2): " + dog1.equals(dog2));
        // Output the dogs' details
        System.out.println(dog1);
        System.out.println(dog2);
        // Test the bark() method
        dog1.bark();
        dog2.bark();
    }
}