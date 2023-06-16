import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0; // 검은색 영역의 넓이
        int board[][] = new int[101][101];

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for(int i = 0; i < t; i++) {
            String[] strArr = br.readLine().split(" ");

            int n = Integer.parseInt(strArr[0]); // 가로
            int m = Integer.parseInt(strArr[1]); // 세로

            for(int j = m; j < m + 10; j++) {
                for(int k = n; k < n + 10; k++) {
                    if(board[j][k] == 0) {
                        result++;
                        board[j][k] = 1;
                    }
                }
            }

        }

        System.out.println(result);
    }
}