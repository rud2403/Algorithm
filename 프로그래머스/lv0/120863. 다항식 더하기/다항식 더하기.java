class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] strArr = polynomial.split(" ");
        int xNum = 0;
        int num = 0;
        
        for(String str : strArr) {
            if(!str.equals("+")){
                if(str.contains("x")) {
                    if(str.length() > 1) {
                        xNum += Integer.parseInt(str.replace("x", ""));
                    } else {
                        xNum++;
                    }
                } else {
                    num += Integer.parseInt(str);
                }
            }
        }
        
        if(xNum == 0) {
            answer = Integer.toString(num);
        } else if (num == 0 && xNum == 1) {
            answer = "x";
        } else if (num == 0) {
            answer = Integer.toString(xNum) + "x";
        }  else if (num != 0 && xNum == 1){
            answer = "x" + " + " + Integer.toString(num);
        } else {
            answer = Integer.toString(xNum) + "x" + " + " + Integer.toString(num);
        }
        
        return answer;
    }
}