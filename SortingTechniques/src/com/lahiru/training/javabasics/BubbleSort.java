package com.lahiru.training.javabasics;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < arr.length; j++){
                if(arr[j] < arr[j-1]){
                    //swap elements
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));

        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        System.out.println(Arrays.toString(arr));

    }
}
