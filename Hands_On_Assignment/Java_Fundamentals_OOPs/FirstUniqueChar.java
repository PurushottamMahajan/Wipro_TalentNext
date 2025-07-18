package tasksprograms;

import java.util.*;

public class FirstUniqueChar {
    public static char firstNonRepeated(String str) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Count frequencies
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Find first character with frequency 1
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // null char if no non-repeating character
    }

    public static void main(String[] args) {
        String input = "dabbccddef";
        char result = firstNonRepeated(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result); // Output: e
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

