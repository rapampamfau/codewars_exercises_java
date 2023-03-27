package org.example.excercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DuplicateEncoderTestSuite {

    @Test
    void testDuplicate() {
        //When&Then
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
        assertEquals(")))()()()))()()(", DuplicateEncoder.encode("SomeRandomString"));
        assertEquals("))((", DuplicateEncoder.encode(")) @"));
    }
}
