package org.example.ex1_reverse_number;

/*
    Reverse a number using while Loop.
    The program will prompt user to input the number, and then it will reverse the same number using while loop.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        // Scanner - citire
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Solution 1: "+ getReverseNumberM1(number));
        System.out.println("Solution 2: "+ getReverseNumberM2(number));
        System.out.println("Solution 3: "+ getReverseNumberM3(number));

    }

    private static int getReverseNumberM3(int number) {
        int reversedNumber = 0;
        String reversedStr = "";
        String numberStr = Integer.toString(number);

        int index = numberStr.length() - 1; //GENUL ACESTA DE METODE ESTE UTILIZAT PENTRU CONVERSIA TIPULUI DE DATE INTRE WRAPPERE

        while(index >= 0 ){
            reversedStr = reversedStr + numberStr.charAt(index);
            index--;
        }

        reversedNumber = Integer.parseInt(reversedStr);
        return reversedNumber;
    }

    private static int getReverseNumberM2(int number) {
        List<Integer> numberDigits = new ArrayList<>();
        int reversedNumber = 0;

        for (int i = 0; number > 0; i++) {
            numberDigits.add(number%10);
            number/=10;
        }

        System.out.println("NUmber Digits: "+numberDigits);

        for (Integer it : numberDigits) {
            reversedNumber = reversedNumber*10 + it;
        }

        return reversedNumber;
    }

    private static int getReverseNumberM1(int number) {
        int reverseNumber = 0;

        while(number>0){
            int rest = number %10;
            number = number /10;
            reverseNumber = reverseNumber*10 + rest;
        }

        return 0;
    }
}
