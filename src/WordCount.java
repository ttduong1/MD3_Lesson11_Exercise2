import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert all characters to lowercase to avoid counting the same word multiple times
        input = input.toLowerCase();

        // Remove all non-word characters (e.g. punctuation) and split the string into words
        String[] words = input.replaceAll("[^\\w\\s]", "").split("\\s+");

        // Create a TreeMap to store the words and their counts
        TreeMap<String, Integer> wordCount = new TreeMap<>();

        // Loop through each word in the array and add it to the TreeMap
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Print the TreeMap
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}