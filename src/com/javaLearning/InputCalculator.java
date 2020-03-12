package com.javaLearning;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args){
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;
        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int a = scanner.nextInt();
                sum = sum + a;
                count++;
            }
            else
                break;
            scanner.nextLine();
        }
        avg = Math.round((double)sum/count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}