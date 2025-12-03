package _8ExceptionHandling;

public class Main {

    private static void throwException() throws Exception {
        throw new Exception();
    }

    public static void testRuntimeException() {
        int a = 10, b = 0;
        try {
            int div = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Exception has occured while division" + ex);
        }
    }

    public static void testCompileTimeException() throws Exception {
        Main.throwException();
    }

    public static void example() {
        try {
            Main.testCompileTimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Main.testRuntimeException();
    }
}
