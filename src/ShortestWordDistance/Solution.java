package ShortestWordDistance;

public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int i1=-1, i2=-1, minDistance=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals(word1))
                i1=i;
            else if(words[i].equals(word2))
                i2=i;
            if(i1!=-1 && i2!=-1)
            {
                minDistance=Math.min(minDistance,Math.abs(i1-i2));
            }
        }
        return minDistance;
    }
}