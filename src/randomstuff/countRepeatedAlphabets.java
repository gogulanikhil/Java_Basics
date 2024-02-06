package randomstuff;

import java.util.LinkedHashMap;
import java.util.Map;

class ToCountWords {
	public static void totalCountedWords() {
		String word = "malayalam";
		Map<Character, Integer> wordsToBeCounted = new LinkedHashMap<>();
 		for (int i = 0; i < word.length(); i++) {
			char collectedWords = word.charAt(i);
			wordsToBeCounted.put(collectedWords, wordsToBeCounted.getOrDefault(collectedWords, 0) + 1);
		}

		for (Character words : wordsToBeCounted.keySet()) {
			System.out.println(words + ": " + wordsToBeCounted.get(words));
		}
	}
}

public class countRepeatedAlphabets {
	public static void main(String[] args) {
		System.out.println("Number of occurrences of each character:");
		ToCountWords.totalCountedWords();
	}
}
