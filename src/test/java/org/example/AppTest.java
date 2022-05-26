package org.example;

//import static org.junit.Assert.assertTrue;

//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Practising TDD - so earlier tests will now fail, but they passed during development
 */
public class AppTest 
{
   // @Test
   // @DisplayName("1. Check that I can obtain the length of an input word")
   // void checkThatICanObtainTheLengthOfAWord(){
   //     Assertions.assertEquals(4, App.myPalindromeCheck("dogs"));
   //  }

    @Test
    @DisplayName("Check that I can extract all of the letters of the input word to an Array")
    void checkThatICanExtractLettersOfAWordToArray(){
        Assertions.assertEquals([d, o, g], App.myPalindromeCheck("dog"));
    }

    @Test
    @DisplayName("Check that I can extract all of the letters of the input word to a lower case Array")
    void checkThatICanExtractLettersOfAWordToLowerCaseArray(){
        Assertions.assertEquals([d, o, g], App.myPalindromeCheck("dog"));
    }

}
