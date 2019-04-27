package VincentGouws.CountBinarySubstrings;

public class Solution 
{
   public int countBinarySubstrings(String s) 
   {
     // String sub = new String();
      int iNum1 = 0;
      int iSub = 0;
      int pos1 = 0;
      int pos2 = 0;
      //FFff:     
	 while(true)
      {
         
         iNum1 = 0;
         //FF:
         for(int B = pos1; B < s.length(); B++)
         {
            if(pos1+1 >= s.length())
            {
               return iSub;
            }
            //if(B > s.length())
            //{
            //   break;
            //}
            if(s.charAt(B) == '0')
            {
               if((B==pos1)||(s.charAt(B-1)=='0'))
               {
               pos1++;
             //  continue FFff;   //FF
               }
               pos2 = B-1;
               if(pos1 > pos2)
               {
                  pos2 = pos1;
               }
               break;
            }
            iNum1++;
         }
         
		 
		 if(pos2+1 == s.length())
         {
            return iSub;
         }
         
         for(int C = pos1; C >= iNum1;)
         {
            C--;
            if(C < 0||s.charAt(C) == '1')
            {
               break;
            }
            iSub++;
         }
         
         if(pos2+1 == s.length())
         {
            return iSub;
         }
         
         for(int C = pos2; C <= iNum1; )
         {
            C++;
            if(C == s.length()||s.charAt(C) == '1')
            {
               break;
            }
            iSub++;
         }
         pos1 = pos1+iNum1;
         if(iNum1 == 0)
         {
            pos1++;
         }
         if(pos1+1 == s.length())
         {
            return iSub;
         }
      }
      
   }
}