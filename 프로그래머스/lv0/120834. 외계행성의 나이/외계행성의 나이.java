class Solution {
    public String solution(int age) {
        String answer = "";
        String tmpStr = Integer.toString(age);
        String[] strArr = tmpStr.split("");
        int a = 0;
        
        StringBuilder sb = new StringBuilder();
        for(String str : strArr) {
            char calpa = (char)(Integer.parseInt(str) + 97);
            System.out.println(calpa);
            sb.append(calpa);
        }
        
        return sb.toString();
    }
}