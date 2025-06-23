import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int answer = 0;
    static int syAnswer = 0;
    static int cx = 0;
    static int cy = 0;
    static int[] nx = {-1, 1, 0, 0}; // 상하좌우
    static int[] ny = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine()); // 그리드 가로(세로) 수
        String[][] grid = new String[n][n];
        String[][] syGrid = new String[n][n];
        int[][] visited = new int[n][n]; // 0: 방문 X, 1: 방문 O
        int[][] syVisited = new int[n][n]; // 0: 방문 X, 1: 방문 O

        // grid 세팅
        for(int i = 0; i < grid.length; i++) {
            String[] color = bf.readLine().split("");
            for (int j = 0; j < color.length; j++) {
                grid[i][j] = color[j];
                if(color[j].equals("R")) {
                    syGrid[i][j] = "G";
                } else {
                    syGrid[i][j] = color[j];
                }
            }
        }

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(visited[i][j] == 0) {
                    answer++;
                    dfs(i, j, grid, visited, grid[i][j]);
                }
                if(syVisited[i][j] == 0) {
                    syAnswer++;
                    dfs(i, j, syGrid, syVisited, syGrid[i][j]);
                }
            }
        }

        System.out.println(answer + " " + syAnswer);

    }

    public static void dfs(int cx, int cy, String[][] grid, int[][] visited, String curColor) {
        if(visited[cx][cy] == 1) return; // 이미 방문했으면 벗어나기

        visited[cx][cy] = 1;

        for(int i = 0; i < 4; i++) {
            int x = cx + nx[i];
            int y = cy + ny[i];

            if(x >= 0 && y >= 0 && x < grid.length && y < grid.length && visited[x][y] != 1) { // 0보다 작지 않거나 && 맵의 크기보다 크지 않은 경우 && 방문하지 않은 곳인 경우
                if(curColor.equals(grid[x][y])) {  // 상하좌우가 같은 색인 경우
                    dfs(x, y, grid, visited, curColor);
                }
            }
        }
    }
}