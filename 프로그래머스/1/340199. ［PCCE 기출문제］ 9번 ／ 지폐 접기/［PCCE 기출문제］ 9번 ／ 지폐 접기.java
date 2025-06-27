import java.util.*;

class Solution {
    int answer = 0;
    
    public int solution(int[] wallet, int[] bill) {
        
        checkSize(wallet, bill);
            
        return answer;
    }
    
    public void checkSize(int[] wallet, int[] bill) {
        if(wallet[0] >= bill[0] && wallet[1] >= bill[1] || wallet[0] >= bill[1] && wallet[1] >= bill[0]) {
            return;
        }
        
        if(bill[0] >= bill[1]) {
            bill[0] = bill[0] / 2;
        } else {
            bill[1] = bill[1] / 2;
        }
        
        answer++;
        
        checkSize(wallet, bill);
    }
}