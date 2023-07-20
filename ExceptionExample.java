public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Example of NullPointerException
            String text = null;
            int length = text.length(); // This line will throw a NullPointerException

            // Example of ArrayIndexOutOfBoundsException
            int[] numbers = { 1, 2, 3 };
            int value = numbers[3]; // This line will throw an ArrayIndexOutOfBoundsException

            // Example of RuntimeException
            int result = 10 / 0; // This line will throw an ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
        System.out.println("rest of code");
    }
}
