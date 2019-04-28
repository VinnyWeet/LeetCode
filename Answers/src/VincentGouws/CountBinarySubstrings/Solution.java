package VincentGouws.CountBinarySubstrings;

public class Solution 
{
   int startOnes,endOnes,numOnes,iSubStrings;
   char[] binarySub;
   
   public int countBinarySubstrings(String input) 
   {   
      startOnes = 0;
      endOnes = 0;
      numOnes = 0;
      iSubStrings = 0;
      binarySub = input.toCharArray();
      
      for(int sPos = 0; sPos < binarySub.length ; sPos++)
      {
         for(startOnes = sPos; startOnes < binarySub.length; startOnes++)     //finds the first '1' and sets it to startOnes
         {
            if(binarySub[startOnes] == '1')
            {
               break;
            }
         }
         if(startOnes >= binarySub.length && binarySub[startOnes-1] == '0')                                    //just to break if last char is '0'
         {
            return iSubStrings;
         }
         
         for(endOnes = startOnes; endOnes < binarySub.length; endOnes++)      //finds the end of the '1's and sets is to endOnes
         {
            if(binarySub[endOnes] == '0')
            {
               break;
            }
         }
         numOnes = endOnes - startOnes;                                 //calculates the amount of consecutive '1's
         for(int countBack = startOnes-1; countBack >= 0 ; countBack--)
         {
            if(numOnes < (startOnes - countBack))                                           //safeguard to not exceed number of 0's to 1's ratio
            {
               break;
            }
            if(binarySub[countBack] == '1')
            {
               break;
            }
            iSubStrings++;
         }
         for(int countForward = endOnes; countForward < binarySub.length; countForward++)
         {
            if(countForward >= (endOnes + numOnes))                                           //safeguard to not exceed number of 0's to 1's ratio
            {
               break;
            }
            if(binarySub[countForward] == '1')
            {
               break;
            }
            iSubStrings++;
         }
         sPos = endOnes;
      }
      return iSubStrings;
   }
}