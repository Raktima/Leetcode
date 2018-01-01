package PlusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
        int index=digits.length-1;
        int carry=1;
        while (index>=0 && carry>0)
        {
            digits[index]=(digits[index]+carry)%10;
            carry=digits[index]==0?1:0;
            index--;
        }
        if(carry==1)
        {
         digits=new int[digits.length+1];
         digits[0]=1;
        }
        return digits;
    }
}
