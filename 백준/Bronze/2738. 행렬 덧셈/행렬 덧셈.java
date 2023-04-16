import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] numArr1 = new int[x][y];
        int[][] numArr2 = new int[x][y];
        int[][] answerArr = new int[x][y];

        extracted(sc, x, y, numArr1);
        extracted(sc, x, y, numArr2);

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(numArr1[i][j] + numArr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void extracted(Scanner sc, int x, int y, int[][] numArr2) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                numArr2[i][j] = sc.nextInt();
            }
        }
    }
}