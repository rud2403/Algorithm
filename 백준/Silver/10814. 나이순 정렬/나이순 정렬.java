import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String[][] strArr = new String[num][2];

        for (int i = 0; i < num; i++) {
            strArr[i][0] = sc.next(); // 나이
            strArr[i][1] = sc.next(); // 이름
        }

        Arrays.sort(strArr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < num; i++) {
            System.out.println(strArr[i][0] + " " + strArr[i][1]);
        }
    }
}
