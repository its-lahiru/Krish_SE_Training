package com.lahiru.training.checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException  {

//    SQLException
//    IOException
//    ClassNotFoundException
//    InvocationTargetException

    public static void main(String[] args) {

        CheckedException checkedException = new CheckedException();
        checkedException.checkedException();

    }

    public void checkedException() {
        try {
            new FileInputStream("C:/Users/awlsa/Desktop/Virtusa LP training/ExceptionHandling/src/CheckedException/TextFile1.txt");
            System.out.println("File found");
        } catch (FileNotFoundException e){
            System.out.println("file is not found");
            System.err.println(e);
        }

    }
}
