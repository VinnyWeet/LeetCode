package VincentGouws.NonDecreasingArray;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] args)
   {
      EasyIn input = new EasyIn();
      System.out.println("Please enter how many numbers the array should consist of");
      int length = input.readInt();
      int[] iArr = new int[length];
      for(int count = 0 ;count != length;count++)
      {
         do
         {
            System.out.println("Please enter a number between 1 and 9 inclusive, for array location: "+ count +"/" + (length-1));
            iArr[count] = input.readInt();
         }while(iArr[count] > 9 || iArr[count] < 1);
      }
   
      Solution getoutput = new Solution();
      boolean output = getoutput.checkPossibility(iArr);
      System.out.println(output);
      
   }
}