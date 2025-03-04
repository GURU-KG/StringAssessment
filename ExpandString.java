public class ExpandString {
    public static void main(String[] args) {
        String input = "a3b4c5";
        System.out.println("Output: " + expandString(input));
    }

    public static String expandString(String str) {
        StringBuilder result = new StringBuilder();
        int repeatCount = 0;
        char prevChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                repeatCount = ch - '0';
            } else {
                if (prevChar != '\0' && repeatCount > 0) {
                    result.append(String.valueOf(prevChar).repeat(repeatCount));
                }
                prevChar = ch;
                repeatCount = 1;
            }
        }

        if (prevChar != '\0' && repeatCount > 0) {
            result.append(String.valueOf(prevChar).repeat(repeatCount));
        }

        return result.toString();
    }
}
