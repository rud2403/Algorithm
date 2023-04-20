import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] spot = new int[100];
        int result = 0;

        for (int i = 0; i < 100; i++) {
            spot[i] = 0;
        }

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int client = sc.nextInt();
            if(spot[client - 1] == 0) {
                spot[client - 1] = 1;
            } else {
                result++;
            }
        }

        System.out.println(result);
    }
}
