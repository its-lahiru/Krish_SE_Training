package com.lahiru.training.assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

import static javafx.scene.input.KeyCode.Z;

public class WordValueGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scanner.nextLine();

        char[] characters = word.toCharArray();

        for (int i=0; i<characters.length; i++){

            if (Character.isLetter(characters[i])){

                int totalValue = 0;
                int characterValue;

                switch (characters[i]){
                    case 'a':
                        characterValue = 1;
                        totalValue += characterValue;
                        break;
                    case 'b':
                        characterValue = 2;
                        totalValue += characterValue;
                        break;
                    case 'c':
                        characterValue = 3;
                        totalValue += characterValue;
                        break;
                    case 'd':
                        characterValue = 4;
                        totalValue += characterValue;
                        break;
                    case 'e':
                        characterValue = 5;
                        totalValue += characterValue;
                        break;
                    case 'f':
                        characterValue = 6;
                        totalValue += characterValue;
                        break;
                    case 'g':
                        characterValue = 7;
                        totalValue += characterValue;
                        break;
                    case 'h':
                        characterValue = 8;
                        totalValue += characterValue;
                        break;
                    case 'i':
                        characterValue = 9;
                        totalValue += characterValue;
                        break;
                    case 'j':
                        characterValue = 10;
                        totalValue += characterValue;
                        break;
                    case 'k':
                        characterValue = 11;
                        totalValue += characterValue;
                        break;
                    case 'l':
                        characterValue = 12;
                        totalValue += characterValue;
                        break;
                    case 'm':
                        characterValue = 13;
                        totalValue += characterValue;
                        break;
                    case 'n':
                        characterValue = 14;
                        totalValue += characterValue;
                        break;
                    case 'o':
                        characterValue = 15;
                        totalValue += characterValue;
                        break;
                    case 'p':
                        characterValue = 16;
                        totalValue += characterValue;
                        break;
                    case 'q':
                        characterValue = 17;
                        totalValue += characterValue;
                        break;
                    case 'r':
                        characterValue = 18;
                        totalValue += characterValue;
                        break;
                    case 's':
                        characterValue = 19;
                        totalValue += characterValue;
                        break;
                    case 't':
                        characterValue = 20;
                        totalValue += characterValue;
                        break;
                    case 'u':
                        characterValue = 21;
                        totalValue += characterValue;
                        break;
                    case 'v':
                        characterValue = 22;
                        totalValue += characterValue;
                        break;
                    case 'w':
                        characterValue = 23;
                        totalValue += characterValue;
                        break;
                    case 'x':
                        characterValue = 24;
                        totalValue += characterValue;
                        break;
                    case 'y':
                        characterValue = 25;
                        totalValue += characterValue;
                        break;
                    case 'z':
                        characterValue = 26;
                        totalValue += characterValue;
                        break;
                }

            }

        }

    }

}
