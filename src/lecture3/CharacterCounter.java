package lecture3;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        String text = "The plantain planter planted plantain in a plantain plantation when the plantain planters where still planting plantain in the plantain plantation.";

        // Remove spaces and convert the text to lowercase for case-insensitive counting
        text = text.replaceAll("\\s", "").toLowerCase();

        // Create a map to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the characters in the text
        for (char c : text.toCharArray()) {
            // Ignore non-alphabetic characters (if needed)
            if (Character.isLetter(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the characters with their counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
            }
        }
    }
}

