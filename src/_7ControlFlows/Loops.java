package _7ControlFlows;

import java.util.Arrays;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        //1. For loop
        for (int i = 0; i < 10; i++) {

        }

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        //2. Enhanced for loop
        for (int elements : list) {
            System.out.println(elements);
        }
        int i = 0;
        // 3. While
        while (i < 10) {

        }

        //4. do-while
        do {

        } while (i < 0);
    }
}
