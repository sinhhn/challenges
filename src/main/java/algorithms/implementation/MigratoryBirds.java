package algorithms.implementation;

import java.util.HashMap;
import java.util.Map;

public class MigratoryBirds {
    public static int migratoryBirds(int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        int result = 0;
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                int count = map.get(ar[i]);
                count = count + 1;
                map.replace(ar[i], count);
                if (max <= count) {
                    max = count;
                }
            } else {
                map.put(ar[i], 1);
            }
        }
        for (int i = 1; i <= 5; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == max) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}
