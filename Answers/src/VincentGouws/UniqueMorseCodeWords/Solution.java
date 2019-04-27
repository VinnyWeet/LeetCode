package VincentGouws.UniqueMorseCodeWords;

public class Solution
{
   public int uniqueMorseRepresentations(String[] words) 
   {
      String morseCode[] = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
      StringBuffer code = new StringBuffer();       
      for(int count = 0;count < words.length;count++)//this loop will replace the words with morse code
      {
         for(int count2 = 0; count2 < words[count].length();count2++)
         {
            code = code.append(morseCode[(int)(words[count].charAt(count2)-97)]);
         }
         words[count] = code.toString();
         code = new StringBuffer();
      }
      int iNum = 0;
      String word = new String();
      for(int count = 0; count < words.length;count++)//this loop will count duplicates
      {
         if(!(words[count].equals("XXX")))//XXX is used to replace the duplicates already counted
         {
            word = words[count];
            iNum++;
            words[count] = "XXX";
            for(int count2 = 0; count2<words.length; count2++)
            {
               if(words[count2].equals(word))
               {
                  words[count2] = "XXX";
               }
            }
         }
      }
      return iNum;
   }
}