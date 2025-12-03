package _7ControlFlows;

public class Switch {

    public static void main(String[] args) {
        int a = 10;
        switch (a) {
            case 10:
                System.out.println("Case 10");
                break;

            case 11:
                System.out.println("Case 11");
                break;

            default:
                System.out.println("No case matched please enter valid input");
        }


        switch (a) {
            case 10 -> {
                System.out.println("Case 10");
                System.out.println("Hey I am inside case 10");
            }
            case 11 -> System.out.println("Case 11");
            default -> System.out.println("No case matched please enter valid input");
        }

    }

}
