package VincentGouws.DivideTwoIntegers;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] args)
   {
      EasyIn keybord = new EasyIn();
      System.out.println("Please enter first number");
      int in1 = keybord.readInt();
      System.out.println("Please enter second number");
      int in2 = keybord.readInt();
      
      Solution output = new Solution();
      
      System.out.println(output.divide(in1,in2));
   }
}