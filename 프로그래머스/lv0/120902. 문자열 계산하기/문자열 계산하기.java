class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "+";
        String[] strArr = my_string.split(" ");
        
        for(String str : strArr) {
            if(str.equals("+") || str.equals("-")) {
                temp = str;
            } else {
                if(temp.equals("+")){
                    answer += Integer.parseInt(str);
                } else {
                    answer -= Integer.parseInt(str);
                }
            }
        }
        
        
        
        return answer;
    }
}