package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Trainee trainee = new Trainee();
        long[] test1 = {1L,0L, -3L, 14L, -100L, 6L};
        long[] result = trainee.solution(test1);
        System.out.println(Arrays.toString(result));

        int[] arrayOne = {45, 31, 24, 22, 20, 17, 14, 13, 12, 10};
        int[] arrayTwo = {31, 18, 15, 12, 10, 8, 6, 4, 2, 1};
        int[] arrayThree = {51, 30, 10, 9, 8, 7, 6, 5, 2, 1};
        int[] test2 = trainee.solution(arrayOne,arrayTwo,arrayThree);
        System.out.println(Arrays.toString(test2));

    }
}