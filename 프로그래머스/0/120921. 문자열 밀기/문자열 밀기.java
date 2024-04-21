import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        ArrayList<Character> listA = new ArrayList<>();
        ArrayList<Character> listB = new ArrayList<>();
        
        // 배열 세팅
        for(int i = 0; i < A.length(); i++) {
            listA.add(A.charAt(i));
            listB.add(B.charAt(i));
        }
        
        if(listA.equals(listB)) {
            return answer;
        } else {
            for(int i = 0; i < A.length(); i++) {
                // listA의 문자열 오른 쪽 밀기
                char temp = listA.remove(listA.size() - 1);
                listA.add(0, temp);
                
                if(listA.equals(listB)) {
                    return i + 1;
                }
            }    
        }
        
        return -1;
    }
}