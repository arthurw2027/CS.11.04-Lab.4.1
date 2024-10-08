public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        return count == 0;

        // 2. reverseInteger
        public static String reverseInteger(int n){
            int absN = Math.abs(n);
            String reversed = "";
            while (absN > 0) {
                int digit = absN % 10;
                reversed += digit;
                absN /= 10;
            }
            return reversed;
        }
    }

    // 3. encryptThis
            public static String encryptThis(String text) {
                String[] words = text.split(" ");
                StringBuilder encryptedText = new StringBuilder();

                for (String word : words) {
                    if (word.length() == 1) {
                        encryptedText.append((int) word.charAt(0)).append(word);
                    } else if (word.length() == 2) {
                        encryptedText.append((int) word.charAt(0)).append(word.charAt(1));
                    } else {
                        encryptedText.append((int) word.charAt(0));
                        encryptedText.append(word.substring(1, word.length() - 1));
                        encryptedText.append(word.charAt(1));
                        encryptedText.append(word.charAt(word.length() - 1));
                    }
                    encryptedText.append(" ");
                }

                return encryptedText.toString().trim();
            }

    // 4. decipherThis
    public static String decipherThis(String text) {
        String[] words = text.split(" ");
        StringBuilder decipheredText = new StringBuilder();

        for (String word : words) {
            int code = Integer.parseInt(word.substring(0, word.indexOf(word.replaceAll("\\d", ""))));
            char firstLetter = (char) code;
            String restOfWord = word.substring(word.indexOf(word.replaceAll("\\d", "")));

            if (restOfWord.length() == 1) {
                decipheredText.append(firstLetter).append(restOfWord);
            } else if (restOfWord.length() == 2) {
                decipheredText.append(firstLetter).append(restOfWord);
            } else {
                String middle = restOfWord.substring(0, restOfWord.length() - 2);
                String lastTwo = restOfWord.substring(restOfWord.length() - 2);
                decipheredText.append(firstLetter).append(lastTwo.charAt(1)).append(middle).append(lastTwo.charAt(0));
            }
            decipheredText.append(" ");
        }

        return decipheredText.toString().trim();
    }
}

}