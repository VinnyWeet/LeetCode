package VincentGouws.LongestCommonPrefix;

public class Test
{
   public static void main(String [] args)
   {
      String[] test1 = new String[]{"flower","flow","flight"};//"fl"
      String[] test2 = new String[]{"flower","flow","flight","flower","flow","flight"};//"fl"
      String[] test3 = new String[]{"car","rat","car"};//""
      
      Solution calculate = new Solution();
      
      String a = calculate.longestCommonPrefix(test1);
      String b = calculate.longestCommonPrefix(test2);
      String c = calculate.longestCommonPrefix(test3);
   
      System.out.println(a + " Expected:fl\n" + b + " Expected:fl\n" + c + " Expected:\"\"\n");
   }
}