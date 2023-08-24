package arrays;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < nums.length; i++){
            num = ((num << 1) + nums[i]) % 5;
            if (num % 5 == 0){
                result.add(true);
            }else {
                result.add(false);
            }
        }

        return result;
    }
}
