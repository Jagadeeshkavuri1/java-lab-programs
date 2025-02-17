public class throww {
    public static void main(String[] args) {
        int age = 11; // You can change this value to test different ages

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // Method to check age
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or older.");
        }
        System.out.println("You are eligible.");
    }
}
