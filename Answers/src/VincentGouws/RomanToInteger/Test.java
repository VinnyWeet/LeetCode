package VincentGouws.RomanToInteger;

public class Test
{
   public static void main(String [] args)
   {
      String[] tests = new String[]{"III",   //3
                                 "IV",    //4
                                 "IX",    //9
                                 "LVIII", //58
                                 "MCMXCIV"}; //1994
      int num = 0;
      Solution calculate = new Solution();
   
      int a = calculate.romanToInt(tests[0]);
      int b = calculate.romanToInt(tests[1]);
      int c = calculate.romanToInt(tests[2]);
      int d = calculate.romanToInt(tests[3]);
      int e = calculate.romanToInt(tests[4]);
   
      if(3 == a)
      {
         num++;
      }
      else
      {
         System.out.println(tests[0] + " Expected: " + 3 + " got " + a);
      }
      
      if(4 == b)
      {
         num++;
      }
      else
      {
         System.out.println(tests[1] + " Expected: " + 4 + " got " + b);
      }
      
      if(9 == c)
      {
         num++;
      }
      else
      {
         System.out.println(tests[2] + " Expected: " + 9 + " got " + c);
      }
      
      if(58 == d)
      {
         num++;
      }
      else
      {
         System.out.println(tests[3] + " Expected: " + 58 + " got " + d);
      }
      
      if(1994 == e)
      {
         num++;
      }
      else
      {
         System.out.println(tests[4] + " Expected: " + 1994 + " got " + e);
      }
      
      System.out.println("\n" + num + "/5 tests passed");
   }
}