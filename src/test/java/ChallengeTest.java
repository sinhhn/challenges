import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import algorithms.implementation.GradingStudents;
import algorithms.implementation.AppleOrange;
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
    void appleOrangeTest() {
        AppleOrange appleOrange = new AppleOrange(1,2,3,4);
    }
}
