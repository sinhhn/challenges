package algorithms.implementation;

public class Kangaroo {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        final String YES = "YES";
        final String NO = "NO";
        int s1 = x1;
        int s2 = x2;
        if (x1 == x2) {
            return YES;
        } else if (x1 < x2) {
            if (v1 <= v2) {
                return NO;
            } else {
                return ((x2 - x1) % (v1 - v2)) == 0 ? YES : NO;
            }
        } else {
            if (v1 >= v2) {
                return NO;
            } else {
                return ((x1 - x2) % (v2 - v1)) == 0 ? YES : NO;
            }
        }
    }
}
