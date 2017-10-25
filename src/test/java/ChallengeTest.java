import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import algorithms.implementation.GradingStudents;
import algorithms.implementation.Kangaroo;
import algorithms.implementation.TwoSets;

public class ChallengeTest {
    @Test
    void gradingStudentTest() {
        GradingStudents gradingStudents = new GradingStudents();
        int[] grades = new int[4];
        grades[0] = 73;
        grades[1] = 67;
        grades[2] = 38;
        grades[3] = 33;
        int[] results = new int[grades.length];
        results[0] = 75;
        results[1] = 67;
        results[2] = 40;
        results[3] = 33;
        Assert.assertArrayEquals(results, gradingStudents.solve(grades));
    }

    @Test
    void kangarooTest() {
        Kangaroo kangaroo = new Kangaroo();
        assertEquals("YES", kangaroo.kangaroo(0, 3, 4, 2));
    }

    @Test
    void twoSetsTest() {
        TwoSets twoSets = new TwoSets();
        int[] a = {2, 4};
        int[] b = {16, 32, 96};
        assertEquals(3, twoSets.getTotalX(a,b));
    }
}
