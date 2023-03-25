import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0])
                    return Integer.compare(a[0], b[0]);
                else
                    return Integer.compare(a[1], b[1]);
            }
        });
        int width = dots[3][0] - dots[0][0];
        int height = dots[3][1] - dots[0][1];
        
        // 넓이 계산
        int area = width * height;
        return area;
    }
}