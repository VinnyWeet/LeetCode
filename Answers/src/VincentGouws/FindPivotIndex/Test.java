package VincentGouws.FindPivotIndex;

public class Test
{
   public static void main(String [] args)
   {
      int[][] test = new int[][]{{1,7,3,6,5,6},
                                 {1,2,3},
                                 {1,2,3,-1,4},
                                 {5,5,10,3,3,3,1},
                                 {77,23,100,25,25,25,25},
                                 {-1,-1,-1,0,1,1}};
                                 
      Solution calculate = new Solution();
      int A,B,C,D,E,F;
      A = calculate.pivotIndex(test[0]);
      B = calculate.pivotIndex(test[1]);
      C = calculate.pivotIndex(test[2]);
      D = calculate.pivotIndex(test[3]);
      E = calculate.pivotIndex(test[4]);
      F = calculate.pivotIndex(test[5]);
      
      if(A != 3)
      {
         System.out.println("Error in A");
      }
      if(B != -1)
      {
         System.out.println("Error in B");
      }
      if(C != 2)
      {
         System.out.println("Error in C");
      }
      if(D != 2)
      {
         System.out.println("Error in D");
      }
      if(E != 2)
      {
         System.out.println("Error in E");
      }
      if(F != 0)
      {
         System.out.println("Error in F");
      }
      System.out.println("Test completed");
   }
}