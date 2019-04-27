package VincentGouws.ToLowerCase;
import VincentGouws.Utils.*;

public class Test
{
   public static void main(String [] args)
   {
      EasyIn input = new EasyIn();
      System.out.println("Enter any string in upper and lower case and i will make it lower case for you!");
      String in = input.readString();
      
      Solution output = new Solution();
      
      String answer = output.toLowerCase(in);
      
      System.out.println(answer);
   }
}