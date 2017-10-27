package algorithms.implementation;

import java.util.*;

public class SockMerchant {
    public static int sockMerchant(int[] ar) {
        Arrays.sort(ar);
        int[] temp = new int[ar.length + 1];
        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[i];
        }
        temp[ar.length] = ar[ar.length - 1] == 0 ? 1 : 99 % ar[ar.length - 1];
        int result = 0;
        int count = 1;
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] == temp[i + 1]) {
                count++;
            } else {
                result += count / 2;
                count = 1;
            }
        }
        return result;
    }

}
