package strings;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int num, mod = 0;
        StringBuilder result = new StringBuilder();
        String temp;
        if (num1.length() < num2.length()) {
            temp = "0".repeat(num2.length() - num1.length());
            num1 = temp + num1;
        } else if (num2.length() < num1.length()) {
            temp = "0".repeat(num1.length() - num2.length());
            num2 = temp + num2;
        }

        for (int i = num1.length() - 1; i >= 0; i--) {
            num = mod + Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i));
            result.append(num % 10);
            mod = num / 10;
        }

        if (mod != 0) {
            result.append(mod);
        }

        return result.reverse().toString();
    }
}
