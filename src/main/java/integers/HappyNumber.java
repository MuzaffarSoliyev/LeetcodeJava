package integers;

import java.util.HashMap;
import java.util.Map;

public class HappyNumber {
    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int res;
        while (!map.containsKey(n)) {
            res = sumNumbers(n);
            map.put(n, res);
            n = res;
        }
        return n == 1;
    }

    private int sumNumbers(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
