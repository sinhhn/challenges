package algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;

public class BreakingRecords {
    public static int[] getRecord(int[] s) {
        int breakingDownTimes = 0;
        int breakingUpTimes = 0;
        int maxCurrent = s[0];
        int minCurrent = s[0];
        for (int i = 1; i < s.length; i++) {
            if (maxCurrent < s[i]) {
                breakingUpTimes++;
                maxCurrent = s[i];
            }
            if (minCurrent > s[i]) {
                breakingDownTimes++;
                minCurrent = s[i];
            }

        }
        return new int[]{
                breakingUpTimes, breakingDownTimes
        };
    }

}
