import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        int[] intArr = new int[array.length];
        
        int idx = 0;
        
        for(int i = 0; i < array.length; i++) {
            intArr[i] = Math.abs(array[i] - n);
            System.out.println(Math.abs(array[i] - n));
        }
        
        int min = intArr[0];
        
        for(int i = 0; i < intArr.length ; i++) {
            if(intArr[i] == min) {
                continue;
            }
            if(intArr[i] < min) {
                min = intArr[i];
                idx = i;
            }
        }
            
        return array[idx];
    }
}