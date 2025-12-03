package _8ExceptionHandling;

public class ExceptionHierarchy {
    public static void testRuntimeException() {
        int a = 10, b = 0;
        try {
            int div = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Exception has occured while division" + ex);
        } catch (Exception e) {
            System.out.println(e);
        }

        //This will give compiler error because all exceptions are handled in Exception catch
//        catch (ArithmeticException ex) {
//            System.out.println("Exception has occured while division" + ex);
//        }

    }

    public static void main(String[] args) {

    }
}
