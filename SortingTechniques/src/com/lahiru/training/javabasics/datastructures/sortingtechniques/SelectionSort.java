package com.lahiru.training.javabasics.datastructures.sortingtechniques;

public class SelectionSort {

    static void selectionSort(int[] arr){

        for (int i=0; i < arr.length; i++){

            int index = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j; // searching for lower index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

    }

    public static void main(String[] args) {

        int[] numbers = {9, 14, 3, 2, 43, 11, 58, 22};

        System.out.println("Before sorting");
        for (int number : numbers){
            System.out.print(number + " ");
        }

        System.out.println();
        selectionSort(numbers);
        System.out.println("After sort");
        for (int number : numbers){
            System.out.print(number + " ");
        }

    }

}
