import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int xDotCount = 0;
        int yDotCount = 0;

        int row = 0;
        int col = 0;

        String[][] map = new String[n][n];

        boolean xFlag = false;
        boolean yFlag = false;


        for(int i = 0; i < n; i ++) {
            String[] strArr = br.readLine().split("");
            for(int j = 0; j < n; j++) {
                map[i][j] = strArr[j];
            }
        }

        for(int i = 0; i < map.length; i++) {
            xDotCount = 0;
            xFlag = false;
            for(int j = 0; j < map[i].length; j++) {
                if(".".equals(map[i][j])) { // 문자가 .인 경우
                    xDotCount++;

                    if(xDotCount >= 2 && xFlag == false) {
                        row++;
                        xFlag = true;
                    }
                } else { // 문자가 X인 경우
                    xDotCount = 0;
                    xFlag = false;
                }
            }
        }

        for(int i = 0; i < map.length; i++) {
            yDotCount = 0;
            yFlag = false;
            for(int j = 0; j < map[i].length; j++) {
                if(".".equals(map[j][i])) { // 문자가 .인 경우
                    yDotCount++;

                    if(yDotCount >= 2 && yFlag == false) {
                        col++;
                        yFlag = true;
                    }
                } else { // 문자가 X인 경우
                    yDotCount = 0;
                    yFlag = false;
                }
            }
        }

        System.out.println(row + " " + col);
    }
}
