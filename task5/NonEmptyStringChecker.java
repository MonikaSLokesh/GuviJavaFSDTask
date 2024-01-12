package com.task5;

import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStringChecker {
    public List<String> getNonEmptyStrings(List<String> inputList) {
        return inputList.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        NonEmptyStringChecker stringChecker = new NonEmptyStringChecker();

        // Example usage:
        List<String> originalList = List.of("abc", "", "bc", "efg", "abcd");
        List<String> nonEmptyStrings = stringChecker.getNonEmptyStrings(originalList);

        // Print the result
        System.out.println("Original List: " + originalList);
        System.out.println("List with Non-Empty Strings: " + nonEmptyStrings);
    }
}
