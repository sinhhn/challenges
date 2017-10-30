package algorithms.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReducedStringTest {

    @Test
    void reducedStringTest1() {
        String s = "abba";
        assertEquals("Empty String", ReducedString.super_reduced_string(s));
    }

    @Test
    void reducedStringTest2() {
        String s = "aaaaabbbac";
        assertEquals("abac", ReducedString.super_reduced_string(s));
    }

    @Test
    void reducedStringTest3() {
        String s = "aaaaaaaaaaaaaaaaaaaaa";
        assertEquals("a", ReducedString.super_reduced_string(s));

    }
}
