package com.lahiru.training.reversenumber;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversedNumber {

    public static void main(String[] args) {

        int pow = 0;
        int reversedNumber = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = scanner.nextInt();

        while(number > 0){
            pow++;
            int remainder = number % 10;
            arrayList.add(remainder);
            number = number / 10;
        }

/*
        for (int x=0; x<arrayList.size(); x++) {
            System.out.println(arrayList.get(x));
        }
*/

        for (int x=0; x<arrayList.size(); x++) {
            reversedNumber = (int) (reversedNumber + arrayList.get(x) * Math.pow(10, pow-1));
            pow--;
        }

        System.out.println("Reversed number: " + reversedNumber);


    }


}
