import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String, Integer> hm = new HashMap();
        
        // HashMap 세팅
        for(int i = 0; i < keymap.length; i++) {
            String[] strArr = keymap[i].split("");
            for(int j = 0; j < strArr.length; j++) {
                if(!hm.containsKey(strArr[j])) {
                    hm.put(strArr[j], j + 1);
                } else {
                    hm.replace(strArr[j], Math.min(hm.get(strArr[j]), j + 1));
                }
            }
        }
        

        for(int i = 0; i < targets.length; i++) {
            String[] strArr2 = targets[i].split("");
            for(int j = 0; j < strArr2.length; j++) {
                if(hm.containsKey(strArr2[j])) {
                    answer[i] += hm.get(strArr2[j]);
                } else {
                    answer[i] = -1;
                    break;
                }
                
            }
        }
        
        
        
        return answer;
    }
}