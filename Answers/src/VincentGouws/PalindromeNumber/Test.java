package VincentGouws.PalindromeNumber;

public class Test
{
   public static void main(String [] args)
   {
      int[] test = new int[]{232,323,223,222,12321};
      
      Solution calculate = new Solution();
      
      boolean A,B,C,D,E;
      A = calculate.isPalindrome(test[0]);
      B = calculate.isPalindrome(test[1]);
      C = calculate.isPalindrome(test[2]);
      D = calculate.isPalindrome(test[3]);
      E = calculate.isPalindrome(test[4]);
      
      int iNum = 0;
      
      if(A)
      {
         iNum++;
      }
      
      if(B)
      {
         iNum++;
      }
      
      if(!C)
      {
         iNum++;
      }
      
      if(D)
      {
         iNum++;
      }
      
      if(E)
      {
         iNum++;
      }
      
      System.out.println(iNum + "/5 correct");
   }
}