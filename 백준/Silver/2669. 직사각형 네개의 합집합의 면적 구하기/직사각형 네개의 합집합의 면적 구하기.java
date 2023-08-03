import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] map = new int[100][100];

        int result = 0;

        for(int i = 0; i < 4; i++) {
            String[] strArr = br.readLine().split(" ");
            int x1 = Integer.parseInt(strArr[0]);
            int y1 = Integer.parseInt(strArr[1]);
            int x2 = Integer.parseInt(strArr[2]);
            int y2 = Integer.parseInt(strArr[3]);

            for(int x = x1; x < x2; x++) {
                for(int y = y1; y < y2; y++) {
                    map[x][y] = 1;
                }
            }
        }

        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(map[i][j] == 1) {
                    result++;
                }
            }
        }

        System.out.println(result);

    }
}