package VincentGouws.RectangleOverlap;

public class Test
{
   public static void main(String [] args)
   {                            //x,y,x,y
      int[][] test = new int[][]{{0,0,2,2},
                                {1,1,3,3}, //true
                                {0,0,1,1},
                                {1,0,2,1}, //false
                                {1,1,3,3},
                                {0,0,2,2}, //true   
                                {0,2,2,0},
                                {1,3,3,1}, //false
                                {0,0,1,1},
                                {2,2,3,3}};//false   
                                      
      Solution calculate = new Solution();
      int num = 0;
      if(calculate.isRectangleOverlap(test[0],test[1]))
      {
         num++;
      }
      if(!(calculate.isRectangleOverlap(test[2],test[3])))
      {
         num++;
      }
      if(calculate.isRectangleOverlap(test[4],test[5]))
      {
         num++;
      }
      if(!(calculate.isRectangleOverlap(test[6],test[7])))
      {
         num++;
      }
      if(!(calculate.isRectangleOverlap(test[8],test[9])))
      {
         num++;
      }
      
      System.out.println(num + "/5 tests passed");
   }
}