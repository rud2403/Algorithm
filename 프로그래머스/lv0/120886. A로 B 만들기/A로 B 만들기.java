import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0; 
        
        String[] aArr = after.split("");
        String[] bArr = before.split("");
        
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        
        for(int i = 0; i < aArr.length; i++) {
            if(!aArr[i].equals(bArr[i])) {
                return 0;
            }
        }
        
        return 1;
    }
}