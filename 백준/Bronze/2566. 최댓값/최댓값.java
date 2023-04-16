import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] numArr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numArr[i][j] = sc.nextInt();
            }
        }

        int x = 0;
        int y = 0;
        int z = numArr[0][0];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(numArr[i][j] > z) {
                    z = numArr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(z);
        System.out.print((x + 1) + " " + (y + 1));
    }
}