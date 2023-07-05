import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[][] map = new int[n][m];

        for(int i = 0; i < n; i++) {

            String row = br.readLine();
            String[] strArr = row.split("");

            for(int j = 0; j < m; j++) {

                map[i][j] = Integer.parseInt(strArr[j]);

            }
        } // 테이블 세팅 완료

        int len = Math.min(n, m);

        while(len > 1) {
            for(int i = 0; i <= n-len; i++) {
                for(int j =0; j <= m-len; j++) {
                    int num = map[i][j];

                    if(num==map[i][j+len-1] && num == map[i+len-1][j] && num == map[i+len-1][j+len-1]) {
                        System.out.println(len*len);
                        return;
                    }
                }
            }
            len--;
        }

        System.out.println(len*len);

    }
}
