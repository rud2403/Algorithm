import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] record) {
        ArrayList<String> arr = new ArrayList();
        HashMap<String, String> hm = new HashMap();
        
        // HashMap 값 세팅
        for(int i = 0; i < record.length; i++) {
            if("Enter".equals(record[i].split(" ")[0])) { // 입장일 때
                if(!hm.containsKey(record[i].split(" ")[1])) { // 처음 입장인 경우
                    hm.put(record[i].split(" ")[1], record[i].split(" ")[2]);
                } else { // 처음 입장이 아닌 경우
                    hm.replace(record[i].split(" ")[1], record[i].split(" ")[2]);
                }
            } else if ("Change".equals(record[i].split(" ")[0])) { // 닉네임 변경인 경우
                hm.replace(record[i].split(" ")[1], record[i].split(" ")[2]);
            }

        }
        
        for(int i = 0; i < record.length; i++) {
            if("Enter".equals(record[i].split(" ")[0])) {
                arr.add(hm.get(record[i].split(" ")[1]) + "님이 들어왔습니다.");
            }
            
            if("Leave".equals(record[i].split(" ")[0])) {
                arr.add(hm.get(record[i].split(" ")[1]) + "님이 나갔습니다.");
            }
        }
        
        return arr;
    }
}