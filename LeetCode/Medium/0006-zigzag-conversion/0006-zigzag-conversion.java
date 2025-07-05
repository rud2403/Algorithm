class Solution {
    public String convert(String s, int numRows) {
        String[][] strArr =  new String[1001][numRows];
        int x = 0;
        int y = 0;
        boolean check = true;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            // System.out.println("x: " + x + " y: " + y);
            // System.out.println("----------------------------");
            strArr[x][y] = String.valueOf(s.charAt(i));
            if((x == numRows-1 || x == 0) && i > 0) check = !check;
            if(check) {
                x += 1;
            } else {
                y += 1;
                x -= 1;
            }
        }

        for(int i = 0; i < 1001; i++) {
            for(int j = 0; j < 1001; j++) {
                if(strArr[i][j] != null) {
                    sb.append(strArr[i][j]);
                }
            }
        }

        return sb.toString();
    }
}