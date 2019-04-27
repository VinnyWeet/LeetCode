package VincentGouws.ValidAnagram;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] args)
   {
      EasyIn keybord = new EasyIn();
      System.out.println("Please enter word 1");
      String word1 = keybord.readString();
      
      System.out.println("Please enter word 2");
      String word2 = keybord.readString();
      
      Solution calculate = new Solution();
      boolean output = calculate.isAnagram(word1,word2);
      
      System.out.println("The output is: " + output);
   }
}