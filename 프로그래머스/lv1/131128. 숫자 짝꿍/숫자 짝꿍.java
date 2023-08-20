import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String X, String Y) {
        ArrayList<String> list = new ArrayList();
        
        String answer = "";
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> xHm = new HashMap();
        HashMap<String, Integer> yHm = new HashMap();
        
        String[] XArr = X.split("");
        String[] YArr = Y.split("");
        
        for(int i = 0; i < XArr.length; i++) {
            xHm.put(XArr[i], xHm.getOrDefault(XArr[i], 0) + 1);
        }
        
        for(int i = 0; i < YArr.length; i++) {
            yHm.put(YArr[i], yHm.getOrDefault(YArr[i], 0) + 1);
        }
        
        for(String key : xHm.keySet()) {
            if(!yHm.containsKey(key)) {
                continue;
            }
            
            int count = Math.min(xHm.get(key), yHm.get(key));
            
            for(int i = 0; i < count; i++) {
                list.add(key);
            }            
        }
        
        answer = list.stream()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.joining());
        
        
        
        if(answer.equals("")) {
            answer = "-1";
        }
        
        if(answer.charAt(0) == '0') {
            answer = "0";
        }
        
        return answer;
    }
}