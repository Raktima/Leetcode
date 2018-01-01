package OneBitAnd2BitCharacters;

public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        while (i<bits.length)
        {
            if(bits[i]==1 && i<bits.length-1)
                i+=bits[i]+1;
            else if(bits[i]==0 && i==bits.length-1)
                return true;
            else
                i++;
        }
        return false;
    }
}
