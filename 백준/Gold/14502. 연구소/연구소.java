import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int[][] map;
    static int[][] virusMap;
    static int x,y;
    static int maxSafeArea = 0;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};
    static List<int[]> virusXy = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String size = bf.readLine();

        // 맵 입력
        x = Integer.parseInt(size.split(" ")[0]); // 세로 크기
        y = Integer.parseInt(size.split(" ")[1]); // 가로 크기

        map = new int[x][y];

        // 맵 세팅
        for(int i = 0; i < x; i++) {
            String[] strArray = bf.readLine().split(" ");
            for (int j = 0; j < strArray.length; j++) {
                map[i][j] = Integer.parseInt(strArray[j]);
                if(map[i][j] == 2) {
                    virusXy.add(new int[]{i, j}); // 바이러스 좌표 저장 (바이러스 퍼트리기 시 사용)
                }
            }
        }
        // 벽 3개 세우기
        buildWall(0);

        System.out.println(maxSafeArea);

    }

    public static void buildWall(int depth) {
        if(depth == 3) {
            virusMap = new int[x][y];
            copyMap(); // virusMap 복사
            for(int[] virus : virusXy) {
                spreadVirus(virus[0], virus[1]);
            }
            int safe = getSafeArea(virusMap);
            maxSafeArea = Math.max(maxSafeArea, safe);
            return;
        }

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                if(map[i][j] == 0) {
                    map[i][j] = 1;
                    buildWall(depth + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    public static void spreadVirus(int curX, int curY) {
        int nX, nY;
        // 상하좌우로 돌면서 0이면 2로 감염
        for(int i = 0; i < 4; i++) {
            nX = curX + dx[i];
            nY = curY + dy[i];

            if(nX >= 0 && nY >= 0 && nX < virusMap.length && nY < virusMap[0].length) { // 맵 내부인 경우만 동작
                if(virusMap[nX][nY] == 0) { // 0인 경우
                    virusMap[nX][nY] = 2;
                    spreadVirus(nX, nY);
                }
            }
        }
    }

    public static int getSafeArea(int[][] virusMap) {
        int safe = 0;
        for(int i = 0; i < virusMap.length; i++) {
            for(int j = 0; j < virusMap[0].length; j++) {
                if(virusMap[i][j] == 0) safe++;
            }
        }
        return safe;
    }

    public static void copyMap() {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[0].length; j++) {
                virusMap[i][j] = map[i][j];
            }
        }
    }
}