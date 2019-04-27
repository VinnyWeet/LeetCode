package VincentGouws.TwoSum;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] args)
   {
      EasyIn keybord = new EasyIn();
      System.out.println("How many numbers?");
      int iNum = keybord.readInt();
      
      int[] input = new int[iNum];     
      for(int count = 0; count < iNum;count++)
      {
         System.out.print("\nPlease enter number " + (count+1) + ": ");
         input[count] = keybord.readInt();
      }
      System.out.println("\nWhat is the desired sum?");
      int desired = keybord.readInt();
      
      Solution calculate = new Solution();
      int output[] = calculate.twoSum(input,desired);
      
      System.out.println("\nIndex: " + output[0] + "+" + output[1] + " = " + desired);    
   }
}