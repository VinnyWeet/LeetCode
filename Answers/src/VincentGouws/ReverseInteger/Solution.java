package VincentGouws.ReverseInteger;

public class Solution 
{
    public int reverse(int x) 
    {
        StringBuffer intWord = new StringBuffer("" + x);
        String sBit = new String();
        
        if(intWord.charAt(0) == '-')
        {
            sBit = "-";
            intWord.delete(0,1);
        }
        
        intWord = intWord.reverse();
        sBit = sBit + intWord.toString();
        Long a = Long.parseLong(sBit);
        
        if((a > 2147483647) || (a < -2147483648))
        {
            x = 0;
        }
        else
        {
            x = Integer.parseInt(sBit);
        }
        
        return x;
    }
}