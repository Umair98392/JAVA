public class StackTraceExample {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            // Get the stack trace elements
            StackTraceElement[] stackTrace = e.getStackTrace();
            
            // Print the stack trace elements
            for (StackTraceElement element : stackTrace) {
                System.out.println(element.getClassName() + 
                                   "." + element.getMethodName() + 
                                   "(" + element.getFileName() + ":" + 
                                   element.getLineNumber() + ")");
            }
        }
    }

    public static void divideByZero() {
        int result = 10 / 0;
    }
}
