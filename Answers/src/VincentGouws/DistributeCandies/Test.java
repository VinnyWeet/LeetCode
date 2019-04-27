package VincentGouws.DistributeCandies;

public class Test
{
   public static void main(String [] args)
   {
      int[][] intTestArr = new int[][]{{1,1,1,1,1,1,2,2,2,2,2,3,3},{1,1,2,3}};
      
      Solution calculate = new Solution();
      System.out.println(calculate.distributeCandies(intTestArr[0]));
      System.out.println(calculate.distributeCandies(intTestArr[1]));
      
      
   }
}