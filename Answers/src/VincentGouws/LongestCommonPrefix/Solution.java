package VincentGouws.LongestCommonPrefix;

class Solution 
{
   public String longestCommonPrefix(String[] strs) 
   {
      if (strs.length == 0)      //will return "" if no strings are inputed
      { 
         return "";
      }
         
      String prefix = strs[0];      //prefix is set to first string of the array inputted
      
      for (int i = 1; i < strs.length; i++)    
      {
         while (strs[i].indexOf(prefix) != 0) 
         {
            prefix = prefix.substring(0, prefix.length() - 1);
            
            if (prefix.isEmpty())      //will return "" if no prefix is found
            { 
               return "";
            }
         }  
      }      
      return prefix;    //finally returns common prefix if one if found
   }
}