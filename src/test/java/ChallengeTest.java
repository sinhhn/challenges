import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import algorithms.implementation.GradingStudents;
import algorithms.implementation.Kangaroo;
import algorithms.implementation.TwoSets;
import algorithms.implementation.BreakingRecords;

public class ChallengeTest {
    @Test
    void gradingStudentTest() {
        int[] grades = {73, 67, 38, 33};
        int[] results = {75, 67, 40, 33};
        Assert.assertArrayEquals(results, GradingStudents.solve(grades));
    }

    @Test
    void kangarooTest() {
        assertEquals("YES", Kangaroo.kangaroo(0, 3, 4, 2));
    }

    @Test
    void twoSetsTest() {
        int[] a = {2, 4};
        int[] b = {16, 32, 96};
        assertEquals(3, TwoSets.getTotalX(a, b));
    }

    @Test
    void breakingRecordsTest() {
        // 10 5 20 20 4 5 2 25 1
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] results = {2, 4};
        Assert.assertArrayEquals(results, BreakingRecords.getRecord(scores));
    }
}
