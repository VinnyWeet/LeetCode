package VincentGouws.JewelsAndStones;

public class Solution
{
   public int numJewelsInStones(String J, String S) {
      int lengthJ = J.length(),lengthS = S.length(), out=0;
      char jewels;
      for (int count = 0;count != lengthJ;count++)
      {
         jewels = J.charAt(count);
         for(int count2 = 0;count2 != lengthS;count2++)
         {
            if(jewels == S.charAt(count2))
            {
               out++;
            }
         }
         
      }
      return out;       
   }
   public void JewelsInStones()
   {
   
   }
}