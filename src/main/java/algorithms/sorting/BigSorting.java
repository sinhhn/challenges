package algorithms.sorting;

public class BigSorting {

    public static String[] bigSort(String[] arr) {
        bigSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void bigSort(String[] strings, int left, int right) {
        int index = partition(strings, left, right);
        if (left < index - 1)
            bigSort(strings, left, index - 1);
        if (index < right)
            bigSort(strings, index, right);
    }

    static int partition(String[] strings, int left, int right) {
        int i = left, j = right;
        String tmp = "";
        String pivot = strings[(left + right) / 2];

        while (i <= j) {
            while (compare(strings[i], pivot) == -1)
                i++;
            while (compare(strings[j], pivot) == 1)
                j--;
            if (i <= j) {
                tmp = strings[i];
                strings[i] = strings[j];
                strings[j] = tmp;
                i++;
                j--;
            }
        }

        return i;
    }


    private static int compare(String s1, String s2) {
        s1 = removeZero(s1);
        s2 = removeZero(s2);
        if (s1.length() > s2.length()) {
            return 1;
        } else if (s2.length() > s1.length()) {
            return -1;
        } else {
            char[] temp1 = s1.toCharArray();
            char[] temp2 = s2.toCharArray();
            for (int i = 0; i < s1.length(); i++) {
                if (temp1[i] < temp2[i]) {
                    return -1;
                } else if (temp1[i] == temp2[i]) {
                    continue;
                } else {
                    return 1;
                }
            }
            return 0;
        }

    }

    private static String removeZero(String s) {
        while (s.startsWith("0")) {
            s = s.substring(1, s.length() - 1);
        }
        return s;
    }
}
