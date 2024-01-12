package com.task5;

import java.util.List;
import java.util.stream.Collectors;

public class UppercaseConverter {
    public List<String> convertToUppercase(List<String> inputList) {
        return inputList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        UppercaseConverter converter = new UppercaseConverter();

        // Example usage:
        List<String> originalList = List.of("aBc", "d", "ef");
        List<String> uppercaseList = converter.convertToUppercase(originalList);

        // Print the result
        System.out.println("Original List: " + originalList);
        System.out.println("Uppercase List: " + uppercaseList);
    }
}
