package VincentGouws.ReverseInteger;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] args)
   {
      EasyIn keybord = new EasyIn();
      System.out.println("Please enter the integer with a sign if needed:");
      int input = keybord.readInt();
      
      Solution calculate = new Solution();
      int output = calculate.reverse(input);
      
      System.out.println("\nThe answer is : " + output);
   }
}