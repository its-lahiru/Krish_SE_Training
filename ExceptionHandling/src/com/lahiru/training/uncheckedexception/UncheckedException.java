package com.lahiru.training.uncheckedexception;

public class UncheckedException {

//    NullPointerException
//    ArrayIndexOutOfBoundsException
//    ArithmeticException
//    IllegalArgumentException
//    NumberFormatException

    public static void main(String[] args) {

        UncheckedException uncheckedException = new UncheckedException();
        uncheckedException.divideOperation();

    }

    public void divideOperation(){

        try {
            System.out.println("Performing division operation..");
            int number1 = 4;
            int number2 = 2;
            int result = number1 / number2;
        } catch (ArithmeticException e){
            System.out.println("There is and arithmetic error in the logic. Inside Catch block..");
        }


    }

}