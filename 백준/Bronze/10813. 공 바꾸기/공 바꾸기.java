import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 바구니 개수
        int[] numArr = new int[num]; // 바구니

        for(int i = 0; i < num; i++) {
            numArr[i] = i + 1;
        }

        int x = sc.nextInt();

        for(int i = 0; i < x; i++) {

            int y = sc.nextInt();
            int z = sc.nextInt();

            int temp = numArr[y - 1];
            numArr[y - 1] = numArr[z - 1];
            numArr[z - 1] = temp;
        }

        for (int i : numArr) {
            System.out.print(i + " ");
        }
    }
}
