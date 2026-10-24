package ru.german;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static <T> Map<T, Integer> countOfElement(T[] elements) {
        Map<T, Integer> result = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            if (result.containsKey(elements[i])) {
                result.put(elements[i], result.get(elements[i]) + 1);
            } else {
                result.put(elements[i], 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Integer[] testInt = {1,1,2,3,4,4,4};
        String[] testString = {"a", "b", "c", "a", "b", "b"};

        Map<Integer, Integer> resultInt = countOfElement(testInt);
        Map<String, Integer> resultString = countOfElement(testString);

        System.out.println(resultInt);
        System.out.println(resultString);
    }
}