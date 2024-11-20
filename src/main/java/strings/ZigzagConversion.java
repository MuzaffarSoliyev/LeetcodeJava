package strings;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows >= s.length() || s.length() == 1 || numRows == 1){
            return s;
        }
        String[] rows = new String[numRows];
        int curRow = 0, direction = 1;
        for (int i = 0; i < s.length(); i++) {
            if (rows[curRow] == null) {
                rows[curRow] = "";
            }
            rows[curRow] += s.charAt(i);
            if (curRow == 0) {
                direction = 1;
            } else if (curRow == numRows - 1) {
                direction = -1;
            }
            curRow += direction;
        }
        return String.join("", rows);
    }
}
