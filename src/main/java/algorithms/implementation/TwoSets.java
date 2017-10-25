package algorithms.implementation;

import java.util.Arrays;

public class TwoSets {
    public static int getTotalX(int[] a, int[] b) {
        int result = 0;
        int min = Arrays.stream(b).min().getAsInt();
        // int multiply = Arrays.stream(a).reduce(1, (x, y) -> x * y);
        for (int i = 1; i <= min; i++) {
            boolean flag = true;
            for (int x : a) {
                if (i % x != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                boolean flag2 = true;
                for (int x : b) {
                    if (x % i != 0) {
                        flag2 = false;
                        break;
                    }
                }
                if (flag2) {
                    result += 1;
                }
            }
        }
        return result;
    }

//    private int gcd(int x, int y) {
//        return (y == 0) ? x : gcd(y, x % y);
//    }
//
//    private int gcd(int[] numbers) {
//        return Arrays.stream(numbers).reduce(0, (x, y) -> gcd(x, y));
//    }
//
//    private int lcm(int[] numbers) {
//        return Arrays.stream(numbers).reduce(1, (x, y) -> x * (y / gcd(x, y)));
//    }
}
