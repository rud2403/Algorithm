class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        for(String str : dic) {
            int sum = 0;
            for(String str2 : spell) {
                if(!str.contains(str2)) {
                    sum += 2;
                } else {
                    sum += 1;
                }
            }
            
            if(sum == spell.length){
                return 1;
            }
        }
        
        return 2;
    }
}