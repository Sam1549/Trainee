package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Trainee {
    public long[] solution(long[] array) {
        long[] result = new long[array.length];
        int index = 0;

        for (long num : array) {
            if (num > 0 && num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }
        long[] finalResult = Arrays.copyOf(result, index);
        // На вход дан массив чисел. Необходимо вернуть массив четных положительных чисел из входящего массива.

        return finalResult;
    }

    public int[] solution(int[] arrayOne, int[] arrayTwo, int[] arrayThree) {
        // На вход поданы три отсортированных по убыванию массиива. Необходимо вернуть один массив,
        // в котором числа из трех входных массивов отсортированы по возрастанию
        List<Integer> arrayList = new ArrayList<>();

        for (int num : arrayOne) {
            arrayList.add(num);
        }
        for (int num : arrayTwo) {
            arrayList.add(num);
        }
        for (int num : arrayThree) {
            arrayList.add(num);
        }


        int[] resultArray = arrayList.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(resultArray);


        return resultArray;
    }

}

