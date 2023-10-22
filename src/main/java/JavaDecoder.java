import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaDecoder {
    public static String decodeMessage(String message) {
        String[] words = message.split(" ");
        StringBuilder decodedMessage = new StringBuilder();

        for (String word : words) {
            if (Character.isDigit(word.charAt(0))) {
                decodedMessage.append(decodeVowels(word));
            } else {
                decodedMessage.append(decodeConsonants(word));
            }

            decodedMessage.append(" ");
        }

        // Видаліть останній пробіл
        if (decodedMessage.length() > 0) {
            decodedMessage.deleteCharAt(decodedMessage.length() - 1);
        }

        return decodedMessage.toString();
    }


    private static String decodeWord(String word) {
        if (word.matches("^[aeiou\\d]+$")) {
            return decodeVowels(word);
        } else {
            return decodeConsonants(word);
        }
    }

    private static String decodeVowels(String word) {
        StringBuilder decodedWord = new StringBuilder();
        for (char c : word.toCharArray()) {
            switch (c) {
                case '1':
                    decodedWord.append('a');
                    break;
                case '2':
                    decodedWord.append('e');
                    break;
                case '3':
                    decodedWord.append('i');
                    break;
                case '4':
                    decodedWord.append('o');
                    break;
                case '5':
                    decodedWord.append('u');
                    break;
                default:
                    decodedWord.append(c);
            }
        }
        return decodedWord.toString();
    }

    private static String decodeConsonants(String word) {
        StringBuilder decodedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (Character.isLetter(currentChar)) {
                char decodedChar = (char) (currentChar - 1);
                decodedWord.append(decodedChar);
            } else {
                decodedWord.append(currentChar);
            }
        }
        return decodedWord.toString();
    }

}
