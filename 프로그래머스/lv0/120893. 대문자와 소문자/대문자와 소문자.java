class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] chArr = my_string.toCharArray();
        
        for(char ch : chArr) {
            if(Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }
        
        return sb.toString();
    }
}