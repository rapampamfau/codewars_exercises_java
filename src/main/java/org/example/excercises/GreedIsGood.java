package org.example.excercises;

public class GreedIsGood {

    private static int oneCounter = 0;
    private static int twoCounter = 0;
    private static int threeCounter = 0;
    private static int fourCounter = 0;
    private static int fiveCounter = 0;
    private static int sixCounter = 0;

    private static int[] counters = {oneCounter, twoCounter, threeCounter, fourCounter, fiveCounter, sixCounter};

    public static int greedy(int[] dice) {
        int score = 0;
        for (int i = 0; i < dice.length; i++) {
            int num = dice[i];
            switch (num) {
                case 1:
                    counters[0]++;
                    break;
                case 2:
                    counters[1]++;
                    break;
                case 3:
                    counters[2]++;
                    break;
                case 4:
                    counters[3]++;
                    break;
                case 5:
                    counters[4]++;
                    break;
                case 6:
                    counters[5]++;
                    break;
            }
        }

        score += sumThrees(counters);
        return score;
    }

    public static int sumThrees(int[] counters) {
        int result = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > 2) {
                switch (i) {
                    case 0:
                        result += 1000;
                        counters[0] -= 3;
                        break;
                    case 1:
                        result += 200;
                        counters[1] -= 3;
                        break;
                    case 2:
                        result += 300;
                        counters[2] -= 3;
                        break;
                    case 3:
                        result += 400;
                        counters[3] -= 3;
                        break;
                    case 4:
                        result += 500;
                        counters[4] -= 3;
                        break;
                    case 5:
                        result += 600;
                        counters[5] -= 3;
                        break;
                }
            }
        }
        result += counters[0] * 100;
        result += counters[4] * 50;
        return result;
    }
}
