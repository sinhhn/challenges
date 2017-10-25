package algorithms.implementation;

public class BirthdayChocolate {
    public static int solve(int[] s, int d, int m) {
        int count = 0;
        if (s.length >= m) {
            for (int i = 0; i <= s.length - m; i++) {
                if (d == sum(s, i, m)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int sum(int[] s, int i, int m) {
        int sum = 0;
        for (int k = i; k <= i + m - 1; k++) {
            sum += s[k];
        }
        return sum;
    }
}
