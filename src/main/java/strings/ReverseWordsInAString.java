package strings;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String tmp;
        StringBuilder result = new StringBuilder();
        int n = words.length;

        for (int i = n - 1; i >= 0; i--) {
            if (!words[i].equals("")){
                result.append(words[i] + " ");
            }
        }

        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
