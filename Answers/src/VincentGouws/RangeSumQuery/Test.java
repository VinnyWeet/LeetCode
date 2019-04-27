package VincentGouws.RangeSumQuery;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] args)
   {
      EasyIn keybord = new EasyIn();
      int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
      System.out.print("Array:\t");
      
      for(int count = 0; count<nums.length ;count++)
      {
         System.out.print(nums[count] + "\t\t");
      }
      
      System.out.print("\nIndex:\t");
      for(int count = 0; count<nums.length; count++)
      {
         System.out.print(count + "\t\t");
      }
      
      int i = 0,j = 0;//will be used as input variables
      
      do
      {
      System.out.print("\n\nEnter start of sum index:\t");
      i = keybord.readInt();
      System.out.print("Enter end of sum index:  \t");
      j = keybord.readInt();
      }while((i==j)||(i<0)||(i>nums.length)||(j<0)||(j>nums.length));
      
      NumArray obj = new NumArray(nums);
      int param_1 = obj.sumRange(i,j);
      
      System.out.println("The answer is: " + param_1);
   }
}