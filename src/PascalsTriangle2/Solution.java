package PascalsTriangle2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> subList=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            subList.add(0,1);
            for(int j=1;j<subList.size()-1;j++)
                subList.set(j,subList.get(j)+subList.get(j+1));
        }
        return subList;
    }
}
