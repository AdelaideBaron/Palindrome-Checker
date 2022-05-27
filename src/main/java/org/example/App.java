package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static boolean myPalindromeCheck(String inputWord){
        if (inputWord != null & inputWord != "") {
            String inputWordLower = inputWord.toLowerCase(); //to ensure we work with lower case
            int lengthOfWord = inputWordLower.length();
            ArrayList<Character> lettersInInputWord = new ArrayList<Character>();
            ArrayList<Character> lettersFromInputReversed = new ArrayList<Character>();

            //list all characters of the string
            for (int i = 0; i < lengthOfWord; i++) {
                char charAtPosition = inputWordLower.charAt(i);
                //System.out.println(charAtPosition); //used for testing earlier
                lettersInInputWord.add(charAtPosition);
            }
            //reverse the order
            for (int i = lengthOfWord - 1; i >= 0; i--) {
                char charAtPositionWorkingBackwards = lettersInInputWord.get(i);
                lettersFromInputReversed.add(charAtPositionWorkingBackwards);
            }

            String reversedWord = "";

            for (Character letter : lettersFromInputReversed) {
                reversedWord += letter;
            }

            return reversedWord.equals(inputWordLower);

            // boolean isThisAPalindrome = reversedWord.equals(inputWordLower);
            //return isThisAPalindrome;
            // System.out.println(isThisAPalindrome);


        } else return false;

         /* The below have been commented out, as I am struggling to run tests with them in

        System.out.println("-------");
        System.out.println("Word input: " + inputWordLower);
        System.out.println("Reversed: " + reversedWord);
         */
    }

    public static void main( String[] args ){
        /* The below have been commented out, as I am struggling to run tests with them in
        System.out.println("Please input a word: ");

        Scanner myObj = new Scanner(System.in);
        String wordToCheck = myObj.nextLine();
        */
        String wordToCheck = "Racecar";
        myPalindromeCheck(wordToCheck);
    }

}
