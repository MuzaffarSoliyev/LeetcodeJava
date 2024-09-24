package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> sortedMinutes = sortTimes(timePoints);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < sortedMinutes.size() - 1; i++) {
            minDiff = Math.min(minDiff, sortedMinutes.get(i + 1) - sortedMinutes.get(i));
        }
        return Math.min(minDiff, 24 * 60 - sortedMinutes.get(sortedMinutes.size() - 1) + sortedMinutes.get(0));
    }

    private List<Integer> sortTimes(List<String> timePoints) {
        List<Integer> result = new ArrayList<>();
        for (String timePoint : timePoints) {
            String[] split = timePoint.split(":");
            result.add(Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]));
        }
        Collections.sort(result);
        return result;
    }
}
