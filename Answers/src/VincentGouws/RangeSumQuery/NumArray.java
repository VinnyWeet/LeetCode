package VincentGouws.RangeSumQuery;

public class NumArray 
{
   private int nums[];
   private int sum = 0;
    
   public NumArray(int[] nums) 
   {
      this.nums = nums;
   }
    
   public int sumRange(int i, int j) 
   {
      if(i < j)
      {
         for(int A=i ; A<j+1 ; A++)
         {
            sum = sum + nums[A];
         }
      }
      else if(i == j)
      {
         return nums[i];
      }
      else if(i > j)
      {
         for(int A=j ; A<i+1 ; A++)
         {
            sum = sum + nums[A];
         }
      }
      return sum;
   }
}