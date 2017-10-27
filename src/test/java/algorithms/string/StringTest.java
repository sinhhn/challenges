package algorithms.string;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {
    @Test
    void reducedString() {
        String s = "abba";
        assertEquals("Empty String", ReducedString.super_reduced_string(s));
    }

}
