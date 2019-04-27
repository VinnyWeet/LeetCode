package VincentGouws.NonDecreasingArray;//

public class Solution
{
   public boolean checkPossibility(int[] nums) 
   {
      boolean trueFalse = false;
      int oldNum , count2 = 0;
      if(nums.length == 1)
      {
         trueFalse = true;
      }
      else
      {
         for(int count = 0 ;count < nums.length;count++)
         {
            if(count == nums.length-1)
            {
               oldNum = nums[count];
               nums[count] = nums[count-1];
            }
            else
            {
               oldNum = nums[count];
               nums[count] = nums[count+1];
            }
            for(count2 = 0; count2 < nums.length-1; count2++)
            {
               if(!(nums[count2] <= nums[count2 + 1]))
               {
                  break;
               }
            }
            if(count2 == nums.length-1)
            {
               trueFalse = true;
            }
            nums[count] = oldNum;  
         }
      }
      return trueFalse;
   }
}
