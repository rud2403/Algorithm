import java.util.*;

class Solution {
    
    public static int findIndex(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;  
    }
    
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for(int i = 0; i <= discount.length - 10; i++) {
            int temp[] = new int[number.length];
            boolean check = true;
            for(int j = i; j < i + 10; j++) {
                for(int k = 0; k < want.length; k++) {
                    if(discount[j].equals(want[k])) {
                        temp[findIndex(want, want[k])]++;
                    }
                }
            }
            for(int k = 0; k < temp.length; k++) {
                if(temp[k] != number[k]) {
                    check = false;
                    break;
                }
            }
            
            if(check) {
                answer++;
            }
        }
        
        return answer;
    }
}