import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        StringBuilder sb = new StringBuilder();
        List<String> strList = new ArrayList<String>();
        Arrays.sort(strArr);
        List<String> strList2 = Arrays.asList(strArr);
        
        for(String str : strArr) {
            if(strList.indexOf(str) == -1){
                strList.add(str);
            }
        }
        
        for(int i = 0; i < strList.size(); i++) {
            if(strList2.indexOf(strList.get(i)) == strList2.lastIndexOf(strList.get(i))) {
                sb.append(strList.get(i));
            }
        }
        
        return sb.toString();
    }
} 