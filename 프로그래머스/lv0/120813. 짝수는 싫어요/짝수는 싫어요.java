import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        
        ArrayList intList = new ArrayList();
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                intList.add(i);
            }
        }
        
        System.out.println(intList.toString());
        
        return intList;
    }
}