package ReshapeTheMatrix;

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int newMatrix[][]=new int[r][c];
        int tempArray[]=new int[nums.length*nums[0].length];
        int count=0;
        if(r*c!=nums.length*nums[0].length)
            return nums;
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                for (int j=0;j<nums[0].length;j++)
                {
                    tempArray[count++]=nums[i][j];
                }
            }
            count=0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    newMatrix[i][j]=tempArray[count++];
                }
            }
        }
        return newMatrix;

    }
}
