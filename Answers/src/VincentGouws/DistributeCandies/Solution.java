package VincentGouws.DistributeCandies;
import java.util.*;

public class Solution 
{
    public int distributeCandies(int[] candies) 
    {
        int max =  (int)(candies.length/2);
        Arrays.sort(candies);
        int iNum = 1;
        for(int count = 0; count < candies.length-1;count++)
        {
            if(candies[count] != candies[count+1])
            {
               iNum++;
            }
        }
        if(iNum > max)
        {
            return max;
        }
        else
        {
            return iNum;
        }
        
    }
}