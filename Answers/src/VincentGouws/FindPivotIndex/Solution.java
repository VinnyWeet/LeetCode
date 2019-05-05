package VincentGouws.FindPivotIndex;

public class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int output = -1;   //set to -1 incase no sums are the same
        
        int sum1 = 0, sum2 = 0;
        
        for(int index = 0;index < nums.length;index++)//will set the arrays index
        {
            sum1 = 0;
            sum2 = 0;                        //initializes sums
            for(int sumLeft = 0; sumLeft < index; sumLeft++)             //Loop to count first sum
            {
               sum1 += nums[sumLeft];
            }
            for(int sumRight = index+1; sumRight < nums.length; sumRight++)             //Loop to count second sum
            {
               sum2 += nums[sumRight];
            }
            if(sum1 != sum2)     //if the sums are not the same the loop must continue
            {
               continue;
            }
            return index;    //returns output is the sums are the same
        }
        return output;
    }
}