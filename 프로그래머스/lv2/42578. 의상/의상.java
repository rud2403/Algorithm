import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        String type = "";
        
        int mul = 1;
        int sum = 0;
        
        for(int i = 0; i < clothes.length; i++) {
            if(hm.containsKey(clothes[i][1])) { // key 값이 존재한다면
                hm.get(clothes[i][1]).add(clothes[i][0]);
            } else { // key 값이 존재하지 않는다면
                ArrayList<String> list = new ArrayList<>();
                list.add(clothes[i][0]);
                hm.put(clothes[i][1], list);
            }
                
        }

        for (Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) {
            String key = entry.getKey();
            ArrayList<String> values = entry.getValue();
            
            if(hm.size() > 1) {
                mul *= hm.get(key).size();    
            } else {
                mul = 0;
            }
            
            
            System.out.println("hm.get(key).size(): " + hm.get(key).size());
            answer *= hm.get(key).size() + 1;
            for(int i = 0; i < values.size(); i++) {
                System.out.println("Key: " + key + ", Value: " + values.get(i));
                sum ++;
            }
            
        }
        
        //System.out.println("mul : " + mul);
        //System.out.println("sum : " + sum);
        return answer - 1;
    }
}