class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for(int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        int curRow = 0;
        boolean goingDown = false;

        for(char c : s.toCharArray()) {
            rows[curRow].append(c);

            // 위 아래로 방향 바꾸기
            if(curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;

            curRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}