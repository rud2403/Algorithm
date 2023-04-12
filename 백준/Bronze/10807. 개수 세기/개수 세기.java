import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] numArr = new int[num];

        for(int i = 0; i < num; i++) {
            numArr[i] = sc.nextInt();
        }

        int tartget = sc.nextInt();

        long count = Arrays.stream(numArr)
                .filter(i -> i == tartget)
                .count();

        System.out.println(count);
    }
}
