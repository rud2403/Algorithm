import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        Arrays.sort(score);
        for(int i = 0 + (score.length % m); i < score.length; i += m) {
            String str = String.valueOf(score[i]);
            
            if(hm.containsKey(str)) { // 키 값이 포함되어 있으면
                int n = hm.get(str);
                hm.put(str, n + 1);
            } else { // 키 값이 포함되어 있지 않으면
                hm.put(str, 1);
            }
        }
        
        for (String key : hm.keySet()) {
            Integer value = hm.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
            answer += Integer.parseInt(key) * value * m;
        }
        
        return answer;
    }
}