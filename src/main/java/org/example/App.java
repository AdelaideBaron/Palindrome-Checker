package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App
{
    static void myPalindromeCheck(String inputWord){
        String inputWordLower = inputWord.toLowerCase(); //to ensure we work with lower case
        int lengthOfWord = inputWordLower.length();
        ArrayList<Character> lettersInInputWord = new ArrayList<Character>();
        ArrayList<Character> lettersFromInputReversed = new ArrayList<Character>();

        //list all characters of the string
        for(int i = 0; i < lengthOfWord; i++) {
            char charAtPosition = inputWordLower.charAt(i);
           //System.out.println(charAtPosition); //used for testing earlier
            lettersInInputWord.add(charAtPosition);
        }
        //reverse the order
        for(int i = lengthOfWord - 1; i >= 0; i--){
            char charAtPositionWorkingBackwards = lettersInInputWord.get(i);
            lettersFromInputReversed.add(charAtPositionWorkingBackwards);
        }

        String reversedWord = "";

        for(Character letter : lettersFromInputReversed){
            reversedWord+= letter;
        }

        boolean isThisAPalindrome = reversedWord.equals(inputWordLower);

        if(isThisAPalindrome == true){
           System.out.println("This is a palindrome");
        } else if(isThisAPalindrome == false){
           System.out.println("This is not a palindrome");
        }
        System.out.println("-------");
        System.out.println("Word input: " + inputWordLower);
        System.out.println("Reversed: " + reversedWord);
    }

    public static void main( String[] args ){
        System.out.println("Please input a word: ");

        Scanner myObj = new Scanner(System.in);
        String wordToCheck = myObj.nextLine();
        myPalindromeCheck(wordToCheck);
    }

}
