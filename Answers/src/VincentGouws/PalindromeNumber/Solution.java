package VincentGouws.PalindromeNumber;
import java.util.*;

class Solution 
{
   public boolean isPalindrome(int x) 
   {  
      StringBuffer y = new StringBuffer(x + "");
      y = y.reverse();
      return x == Integer.parseInt(y.toString());   
   }
}