package VincentGouws.RomanToInteger;

class Solution 
{
    public int romanToInt(String s) 
    {
        int decimal = 0;
        char[] roman = s.toCharArray();
        for(int index = 0; index<roman.length;index++)
        {
            if(roman[index] == 'I')
            {
               if((index+1 < roman.length) && (roman[index+1] == 'V'))
               {
                  index++;
                  decimal += 4;
                  continue;
               }
               if((index+1 < roman.length) && (roman[index+1] == 'X'))
               {
                  index++;
                  decimal += 9;
                  continue;
               }
            }
            if(roman[index] == 'X')
            {
               if((index+1 < roman.length) && (roman[index+1] == 'L'))
               {
                  index++;
                  decimal += 40;
                  continue;
               }
               if((index+1 < roman.length) && (roman[index+1] == 'C'))
               {
                  index++;
                  decimal += 90;
                  continue;
               }
            }
            if(roman[index] == 'C')
            {
               if((index+1 < roman.length) && (roman[index+1] == 'D'))
               {
                  index++;
                  decimal += 400;
                  continue;
               }
               if((index+1 < roman.length) && (roman[index+1] == 'M'))
               {
                  index++;
                  decimal += 900;
                  continue;
               }
            }
            if(roman[index] == 'I')
            {
               decimal += 1;
            }
            if(roman[index] == 'V')
            {
               decimal += 5;
            }
            if(roman[index] == 'X')
            {
               decimal += 10;
            }
            if(roman[index] == 'L')
            {
               decimal += 50;
            }
            if(roman[index] == 'C')
            {
               decimal += 100;
            }
            if(roman[index] == 'D')
            {
               decimal += 500;
            }
            if(roman[index] == 'M')
            {
               decimal += 1000;
            }
        }
        return decimal;
    }
}

//I             1
//IV            4
//V             5
//IX            9
//X             10
//XL            40
//L             50
//XC            90
//C             100
//CD            400
//D             500
//CM            900
//M             1000