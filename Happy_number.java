// https://leetcode.com/problems/happy-number/
import java.util.*;
class Solution {
    public boolean isHappy(int n) {
     
      int value;
      int counter=6;
      int index;
     


      while(counter)
      {
          value=0;
          while(num)
          {
             index=num%10;
             value=value+index*index;
             num=num%10;
          }
          if(value==1)
          {
              return true;
          }
          num=value;
          counter--;
      }
      return false;
    }
      public static void main(String[] args) {
        int number=19;
        isHappy(number);
      }
   
}