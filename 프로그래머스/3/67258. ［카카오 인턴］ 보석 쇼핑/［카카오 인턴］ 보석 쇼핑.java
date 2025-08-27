import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];
        Set<String> total = new HashSet<>(Arrays.asList(gems));
        int left = 0;
        int right = 0;
        int bestLeft = 0;
        int bestRight = gems.length - 1;
        int totalKinds = total.size();
        
        Map<String, Integer> counter = new HashMap<>();
        
        while(right < gems.length) {
            counter.put(gems[right], counter.getOrDefault(gems[right], 0) + 1);
            
            while(counter.size() == totalKinds) {
                if((right - left) < (bestRight - bestLeft)) {
                    bestLeft = left;
                    bestRight = right;
                }
                
                counter.put(gems[left], counter.get(gems[left]) - 1);
                if(counter.get(gems[left]) == 0) {
                    counter.remove(gems[left]);
                }
                
                left++;
            }
                
            right++;
            
            // count의 수가 total과 같아지면 수가 같아 지지 않을 때 까지 left +1;
        }
        
        answer[0] = bestLeft + 1;
        answer[1] = bestRight + 1;
        
        return answer;
    }
}