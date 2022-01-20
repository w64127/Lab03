package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Exercise1();
        Exercise2();
        Exercise3();
        Exercise5();
        Exercise6();
    }

    //Exercise1
    private static void  Exercise1() {
        Random random = new Random();
        int[] numbers = random.ints(10, -10, 11).toArray();

        System.out.print("Values in array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ((i < numbers.length - 1) ? ", " : "\n"));
        }

        System.out.println("Max element: " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("Min element: " + Arrays.stream(numbers).min().getAsInt());

        int avg = Arrays.stream(numbers).sum() / numbers.length;
        System.out.println("Average of elements: " + avg);

        int lower_number = 0;

        for (int number : numbers) {
            if (number < avg) {
                lower_number++;
            }
        }

        System.out.println("How much elements are lower than average: " + lower_number);
        System.out.print("Reverse array: ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ((i > 0) ? ", " : ""));
        }
    }

    //Exercise2
    private static void Exercise2() {
        Random random = new Random();

        int[][] values = {
                random.ints(5, -5, 6).toArray(),
                random.ints(5, -5, 6).toArray(),
                random.ints(5, -5, 6).toArray(),
                random.ints(5, -5, 6).toArray(),
        };

        for (int i = 0; i < values.length; i++) {
            System.out.println("Value under index" + i + ", min value: " + Arrays.stream(values[i]).min().getAsInt() + ", max value: " + Arrays.stream(values[i]).max().getAsInt());
        }
    }

    //Exercise3
    private static void Exercise3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");

        int val = scanner.nextInt();
        int value = val;
        val = Math.abs(val);

        StringBuilder stringBuilder = new StringBuilder(32);
        while (val > 0) {
            stringBuilder.append(val % 2);
            val >>= 1;
        }

        System.out.println(value + " is " + ((value < 0) ? "1." : "") +stringBuilder.reverse() + " in binary");
    }

    //Exercise5
    private static void Exercise5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");

        String value = scanner.nextLine();
        long number = value.chars().filter(x -> x == value.charAt(value.length() - 1)).count();

        System.out.println("Letter " + value.charAt(value.length() - 1) + " has been repeated " + number);
    }

    //Exercise6
    private static void Exercise6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");

        String value = scanner.nextLine();

        int counter = 0;
        for (char ch : value.toCharArray()){
            if (Character.isDigit(ch)) {
                counter+= (ch - '0');
            }
        }

        System.out.println("Sum is " + counter);
    }
}
