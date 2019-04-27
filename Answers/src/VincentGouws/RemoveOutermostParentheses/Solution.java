package VincentGouws.RemoveOutermostParentheses;

class Solution
{
   public String removeOuterParentheses(String S) 
   {
      char[] letter = S.toCharArray();
      int I = 0, del = 0;
      StringBuffer Sbuf = new StringBuffer(S.length());
      for(int count = 0; count < S.length(); count++)
      {
         if(letter[count] == '(')
         {
            I++;
         }
         if(letter[count] == ')')
         {
            I--;
         }
         if(I == 0)
         {
            letter[del] = 'X';
            letter[count] = 'X';
            del = count+1;
         }
      }
      for(int count = 0; count < letter.length; count++)
      {
         if(!(letter[count] == 'X'))
            Sbuf = Sbuf.append(letter[count]);
      }
      S = Sbuf.toString();
      return S;
   }
}