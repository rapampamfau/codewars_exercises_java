package org.example.motorola;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerTests {

    @Test
    void testIntegers() {
        //Given
        Random r = new Random();
        Integers i = new Integers();
        //When
        int N = r.nextInt(1000000000);
        int result = i.solution(N);
        //Then
        assertTrue(result > N);
    }
}
