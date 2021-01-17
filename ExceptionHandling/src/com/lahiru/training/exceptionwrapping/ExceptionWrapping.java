package com.lahiru.training.exceptionwrapping;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionWrapping {

    public static void main(String[] args) {

        ExceptionWrapping exceptionWrapping = new ExceptionWrapping();
        exceptionWrapping.readFile();

    }

    public void readFile(){
        try {
            new FileInputStream("C:/Users/awlsa/Desktop/Virtusa LP training/ExceptionHandling/src/ExceptionWrapping/TextFile.txt");
            System.out.println("file found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
