import java.util.*;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        ArrayList<Integer> arr = new ArrayList<>();
        int day = 1;
        int temp = 0;
        
        for(int i = 0; i < progresses.length; i++) {
            
            // day 계산
            while(progresses[i] + (day * speeds[i]) < 100) {
                if(i != 0 && temp != 0) {
                    arr.add(temp);
                    temp = 0;
                }
                day++;
            }
            
            temp++;
        }
        
        arr.add(temp);
        
        return arr;
    }
}