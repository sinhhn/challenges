package algorithms.implementation;

public class GradingStudents {
    public static int[] solve(int[] grades) {
        int[] result = new int[grades.length];
        int i = 0;
        for (int grade : grades) {
            result[i++] = grade < 38 ? grade : (grade / 5 + 1) * 5 - grade > 2 ? grade : grade / 5 * 5 + 5;
        }
        return result;
    }
}
