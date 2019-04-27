package VincentGouws.ComplementOfBaseTenInteger;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] args)
   {
      EasyIn getinput = new EasyIn();
      Solution getoutput = new Solution();
      System.out.println("Please enter the decimal you wish to compliment");
      int input = getinput.readInt();
      int output = getoutput.bitwiseComplement(input);
      System.out.println(output);
   }
}