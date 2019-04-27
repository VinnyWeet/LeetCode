package VincentGouws.ValidAnagram;
import java.util.*;

public class Solution 
{
   private char[] word1,word2;
   
   public boolean isAnagram(String s, String t) 
   {
      s = s.toLowerCase();
      t = t.toLowerCase();
      if(s.length() != t.length())
      {
         return false;
      }
      else if(s.equals(t))
      {
         return true;
      }
      else
      { 
         return search(s,t,s.length());
      }
   }
    
   public boolean search(String a,String b,int length)
   {
      word1 = a.toCharArray();
      word2 = b.toCharArray();
      
      Arrays.sort(word1);
      Arrays.sort(word2);
      
      a = Arrays.toString(word1);
      b = Arrays.toString(word2);

      if(a.equals(b))
      {
         return true;
      }
      else
      {
      return false;
      }  
   }  
}