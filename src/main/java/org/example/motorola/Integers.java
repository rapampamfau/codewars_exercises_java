package org.example.motorola;

import java.util.Random;

public class Integers {
    public int solution(int N) {
        Random r = new Random();
        int num = r.nextInt(1000000000);
        if (num < N || num % 10 != 0) {
            num = solution(N);
        }
        return num;
    }
}
