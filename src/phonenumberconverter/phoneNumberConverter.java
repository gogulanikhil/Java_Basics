package phonenumberconverter;

import java.util.HashMap;
import java.util.Scanner;

public class phoneNumberConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        HashMap<String, String> wordToDigitMap = new HashMap<>();
        wordToDigitMap.put("zero", "0");
        wordToDigitMap.put("one", "1");
        wordToDigitMap.put("two", "2");
        wordToDigitMap.put("three", "3");
        wordToDigitMap.put("four", "4");
        wordToDigitMap.put("five", "5");
        wordToDigitMap.put("six", "6");
        wordToDigitMap.put("seven", "7");
        wordToDigitMap.put("eight", "8");
        wordToDigitMap.put("nine", "9");

        int i = 0;
        while (i < words.length) {
            if (words[i].equals("double")) {
                result.append(wordToDigitMap.get(words[i + 1])).append(wordToDigitMap.get(words[i + 1]));
                i++;
            } else if (words[i].equals("triple")) {
                result.append(wordToDigitMap.get(words[i + 1])).append(wordToDigitMap.get(words[i + 1])).append(wordToDigitMap.get(words[i + 1]));
                i++;
            } else {
                result.append(wordToDigitMap.get(words[i]));
            }
            i++;
        }

        System.out.println(result.toString());
    }
}
