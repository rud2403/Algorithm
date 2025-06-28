import java.util.*;
/**
 1. 알파벳 A ~ Z까지 리스트에 저장
 2. 2중 반복문 돌면서 msg단어 중 사전에 없는 조합이 나올 때 까지 조회
 3. 사전에 있는 조합중 가장 긴 조합의 인덱스를 출력하고 다음 문자까지 
**/
class Solution {
    Map<String, Integer> dict = new HashMap<>();
    public List<Integer> solution(String msg) {
        String[] msgArray = msg.split("");
        List<Integer> answer = new ArrayList<>();
        setAlph(); // A to Z 알파벳 사전 세팅
        
        // System.out.println(dict.get("Z"));
        for(int i = 0; i < msgArray.length; i++) {
            StringBuilder check = new StringBuilder();
            int j = i;
            while(j < msgArray.length) {
                check.append(msgArray[j]);
                if(!dict.containsKey(check.toString())) {
                    dict.put(check.toString(), dict.size() + 1);
                    check.deleteCharAt(check.length() - 1);
                    answer.add(dict.get(check.toString()));
                    break;
                }
                j++;
            }
            
            if(j == msgArray.length) {
                answer.add(dict.get(check.toString()));
            }
            
            i = j - 1;
            
        }
        
        // System.out.println(dict.get("A"));
        return answer;
    }
    
    public void setAlph() {
        for(int i = 65; i <= 90; i++) {        
            char ch = (char) i;
            String str = Character.toString(ch);
            dict.put(str, i - 64);
        }
    }
}