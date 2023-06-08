import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int getSolution(int startRow, int startCol, String[] board) {
        String[] orgBoard = {"WBWBWBWB", "BWBWBWBW"};
        int whiteSol = 0;
        for(int i = 0; i < 8; i++) {
            int row = startRow + i;
            for(int j = 0; j < 8; j++) {
                int col = startCol + j;
                if(board[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
                    whiteSol++;
                }
            }
        }

        return Math.min(whiteSol, 64 - whiteSol);
    }
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        int n = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);

        String[] board = new String[n];

        // 체스판 세팅
        for(int i = 0; i < n; i++) {
            board[i] = br.readLine();
        }

        // 체스판 자르기
        int sol = Integer.MAX_VALUE;
        for(int i = 0; i <= n - 8; i++) {
            for(int j = 0; j <= m - 8; j++) {
                // 현 체스판의 최소 비용 구하기
                int curSol = getSolution(i, j, board);
                if(sol > curSol) {
                    sol = curSol;
                }
            }
        }
        System.out.println(sol);
        br.close();
    }
}