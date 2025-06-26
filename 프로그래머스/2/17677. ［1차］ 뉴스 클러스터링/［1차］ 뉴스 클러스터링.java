import java.util.*;

/**
    
    2) 각 문자열 두자리씩 끊어서 배열로 생성
    3) 교집합, 합집합 구하기
    4) 교집합 / 합집합 * 65536 한 값에서 소수점 떼기
**/

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        // 1) 각 문자열 소문자로 치환하기
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // 2) 같은 문자열인경우 65536 치환
        if(str1.equals(str2)) return 65536;
        
        // 3) 문자열을 2자리씩 끊어서 저장할 배열 생성
        List<String> strList1 = extractValidPairs(str1);
        List<String> strList2 = extractValidPairs(str2);
        
        // 4) 교집합 수 구하기 / 합집합 수 구하기
        int intersectionCount = getIntersectionSize(strList1, strList2);
        int unionCount = strList1.size() + strList2.size() - intersectionCount;

        return (int)((double)intersectionCount / unionCount * 65536);
    }
    
    public List<String> extractValidPairs(String str) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < str.length() - 1; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i+1);
            
            if(Character.isLetter(first) && Character.isLetter(second)) {
                result.add("" + first + second);
            }    
        }
        
        return result;
    }
    
    public int getIntersectionSize(List<String> list1, List<String> list2) {
        int count = 0;
        List<String> copy = new ArrayList<>(list2);
        
        for(String str : list1) {
            if(copy.contains(str)) {
                count++;
                copy.remove(str);
            }
        }
        
        return count;
    }
}