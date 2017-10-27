package algorithms.string;


public class ReducedString {
    public static String super_reduced_string(String s) {
        String result = myReplace(s);
        if (result == s) {
            return result;
        } else if ("".equals(result)) {
            return "Empty String";
        } else {
            return super_reduced_string(result);
        }
    }

    private static String myReplace(String s) {
        String temp = s;
        for (char c = 'a'; c <= 'z'; c++) {
            temp = temp.replaceAll(c + "" + c, "");
        }
        return temp;
    }
}
