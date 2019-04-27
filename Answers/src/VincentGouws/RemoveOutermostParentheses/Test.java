package VincentGouws.RemoveOutermostParentheses;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] args)
   {
      EasyIn keybord = new EasyIn();
      System.out.println("Please enter input");
      String input = keybord.readString();
      
      Solution output = new Solution();
      System.out.println(output.removeOuterParentheses(input)); 
   }
}