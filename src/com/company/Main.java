package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] numbers = {60.6, -4.7, 72.6, 22.4, 81.8, 55.0, -7.7, 96.6, -28.3, 8.8, 45.4, -6.3, -9.8, 54.8, 10.8};
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < 0){continue;}
            System.out.println(numbers[i]);}
        for (double element : numbers){}
        int quantity = 0;
        double totalSum = 0;
        boolean check = false;
        for (double number : numbers){
            if (number < 0){
                check = true;
            }
            if (number > 0 && check){
                totalSum = number + totalSum;
                quantity++;
            }
        }
        double average = totalSum / quantity;

        System.out.println("Среднее арифметическое число положительных чисел в массиве = " + average);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[i-1]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[i-1];
                    numbers[i-1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}