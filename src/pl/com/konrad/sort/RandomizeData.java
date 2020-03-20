package pl.com.konrad.sort;

import java.util.Random;

public class RandomizeData {
    private int lowBound;
    private int highBound;

    private Random random = new Random();

    public RandomizeData(int lowBound, int highBound) {
        this.lowBound = lowBound;
        this.highBound = highBound;
    }
    public int[] randomize() {
        int length = highBound-lowBound;
        int[]randomize = new int[length];
        for (int i=0; i<length;i++) {
            randomize[i] = random.nextInt(highBound-lowBound+1) + lowBound;
        }
        return randomize;
    }
}
