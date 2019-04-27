package VincentGouws.SingleNumber;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] args)
   {
      EasyIn keybord = new EasyIn();
      
      System.out.println("How many values in array");
      int iNum = keybord.readInt();
      
      int input[] = new int[iNum];
      for(int count = 0; count < iNum; count++)
      {
         System.out.println("Please enter number " + (count + 1));
         input[count] = keybord.readInt();      
      }
      
      Solution calculate = new Solution();
      int output = calculate.singleNumber(input);
      
      System.out.println("The single number is: " + output);
   }
}