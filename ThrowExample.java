public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;

        try {
            // Check if age is valid
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }

    // Method to check age
    public static void checkAge(int age) {
        if (age < 18) {
            // Throw an IllegalArgumentException if age is less than 18
            throw new IllegalArgumentException();
        }
        System.out.println("Age is valid");
    }
}
