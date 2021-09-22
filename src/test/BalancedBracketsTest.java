package test;

import org.junit.Before;
import org.junit.Test;
import main.*;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    //1
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //2
    @Test
    public void NoCloseBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    //3
    @Test
    public void NoOpenBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    //4
    @Test (expected=IllegalArgumentException.class)
    public void nonSquareBracketsReturnException(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("{},()"));
    }
    //5
    @Test
    public void bracketsWithWordsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LC101]"));
    }
    //6
    @Test
   public void returnTypeBoolean(){
        boolean testType=BalancedBrackets.hasBalancedBrackets("LC101 [Studio]");
        assertEquals(true,testType);
   }
   //7
   @Test
   public void notNull(){
        assertNotNull(BalancedBrackets.hasBalancedBrackets("LC101 [Studio]"));
   }
   //8
   @Test
    public void doubleBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[UnitTesting]]"));
   }
   //9
   @Test
    public void TripleBrackets(){
       assertTrue(BalancedBrackets.hasBalancedBrackets("[[[UnitTesting]]]"));
   }
   //10
   @Test
    public void longStingWithCorrectBrackets(){
       assertTrue(BalancedBrackets.hasBalancedBrackets("[We are learning on Chapter6 " +
               "[unitTesting]. LongSring[],Long[] ]"));
   }
  //11
   @Test(expected=IllegalArgumentException.class)
    public void emptyString(){
       assertTrue(BalancedBrackets.hasBalancedBrackets(""));
   }
   //12
@Test
    public void bracketsInRightOrder(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
}



}
