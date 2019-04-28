package VincentGouws.CountBinarySubstrings;

public class Test
{
   public static void main(String [] args)
   {
      String[] substrings = new String[]{"10",
                                         "101",
                                         "010",
                                         "00110011",
                                         "10101",
                                         "0000000000000000000",
                                         "00100",
                                         "01"};
                                         
      Solution calculate = new Solution();
      
      int A = calculate.countBinarySubstrings(substrings[0]);
      int B = calculate.countBinarySubstrings(substrings[1]);
      int C = calculate.countBinarySubstrings(substrings[2]);
      int D = calculate.countBinarySubstrings(substrings[3]);
      int E = calculate.countBinarySubstrings(substrings[4]);
      int F = calculate.countBinarySubstrings(substrings[5]);
      int G = calculate.countBinarySubstrings(substrings[6]);
      int H = calculate.countBinarySubstrings(substrings[7]);
      
      int results = 0;
      if(A == 1)
      {
         results++;
      }
      
      if(B == 2)
      {
         results++;
      }
      
      if(C == 2)
      {
         results++;
      }
      
      if(D == 6)
      {
         results++;
      }
      
      if(E == 4)
      {
         results++;
      }
      
      if(F == 0)
      {
         results++;
      }
      
      if(G == 2)
      {
         results++;
      }
      if(H == 1)
      {
         results++;
      }
      
      System.out.println(results + "/8 passed!");
   }
}