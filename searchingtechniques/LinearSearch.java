package com.lahiru.training.javabasics.datastructures.searchingtechniques;

public class LinearSearch {

    static int linearSearch(int[] array, int key){
        for(int i=0; i<array.length; i++){
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {12,24,35,55,14};
        int searchValue = 14;

        System.out.println(searchValue + ", is fount at index " + linearSearch(numbers, 12));

    }

}
