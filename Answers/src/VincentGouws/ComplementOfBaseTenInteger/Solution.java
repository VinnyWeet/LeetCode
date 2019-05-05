package VincentGouws.ComplementOfBaseTenInteger;
import java.util.*;

public class Solution
{
   int sign = 0;
   public int bitwiseComplement(int N) 
   {
	  if(N < 0)
	  {
		sign = -1;
		N = N * sign;
	  }
	  else
	  {
		sign = 1;
	  }
	  
      StringBuffer binary = new StringBuffer(Integer.toBinaryString(N));            //turns input into binary form
      for(int count = 0; count < binary.length(); count++)     //switches 1's with 0's and 0's with 1's
      {
         if(binary.charAt(count) == '0')
         {
            binary.setCharAt(count,'1');
         }
         else
         {
            binary.setCharAt(count,'0');
         }
      }
      binary = binary.reverse();       //makes converting byte string a bit easier to int
      N = 0;
      for(int count = 0,multiplier = 1; count < binary.length(); count++, multiplier *= 2)    //converts compliment back to int
      {
         N = N + (((int)(binary.charAt(count))-48)*multiplier);      
      }
                                                                                    
      return N*sign;                                                                     
   }
}