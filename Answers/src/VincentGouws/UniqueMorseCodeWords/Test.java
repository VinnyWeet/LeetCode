package VincentGouws.UniqueMorseCodeWords;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] arga)
   {
      EasyIn keybord = new EasyIn();
      System.out.println("How many words?");
      int wordNum = keybord.readInt();
      String input[] = new String[wordNum];
      for(int count = 0;count < wordNum;count++)
      {
         System.out.println("Please enter word number "+ (count+1));
         input[count] = keybord.readString();
      }
      Solution output = new Solution();
      int answer = output.uniqueMorseRepresentations(input);
      
      System.out.println(answer);
   }
}