package VincentGouws.JewelsAndStones;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] args)
   {
      EasyIn input = new EasyIn();
      System.out.println("Please enter the jewels:");
      String jewels = input.readString();
      System.out.println("Please enter the stones");
      String stones = input.readString();          //input complete
      
      
      Solution output = new Solution();
      int answer = output.numJewelsInStones( jewels,stones );//fetches output
      
      System.out.println("There are " + answer +" jewels in those stones.");
   }
}