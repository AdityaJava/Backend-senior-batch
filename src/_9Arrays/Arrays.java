package _9Arrays;

/**
 * s = {
 * name:'abc',
 * age: 67
 * }
 * s['name']
 *
 */
// Arrays are object in Java
public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] a = {1, 2, 3};

        String s = "ABC";

        for (int i = 0; i < a.length; i++) {
            a[i] = 9 * i;
        }
    }
}
