package _10CollectionsInJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {
        Map<Employee, String> map = new LinkedHashMap<>();
        map.put(new Employee(1, "ABC"), "Kartik");
        map.put(new Employee(2, "ABC"), "Kartik");
        map.put(new Employee(3, "ABC"), "Kartik");
        map.put(new Employee(4, "ABC"), "Kartik");
    }
}
