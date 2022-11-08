import java.util.*;

class Solution {
    public ArrayList solution(int n, int[] numlist) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i : numlist){
            if(i % n == 0){
                list.add(i);
            }
        }
        
        return list;
    }
}