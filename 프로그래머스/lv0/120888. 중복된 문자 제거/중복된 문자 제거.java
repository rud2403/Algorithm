import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        
        String[] strArr = my_string.split("");
        
        for(String str : strArr) {
            lhs.add(str);
        }
        
        for(String value : lhs) {
            sb.append(value);
        }
        
        return sb.toString();
    }
}