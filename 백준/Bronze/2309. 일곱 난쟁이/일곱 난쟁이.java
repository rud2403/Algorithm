import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList();
        int sum = 0;
        int minus = 0;
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            numList.add(num);
            sum += num;
        }

        Collections.sort(numList);
        minus = sum - 100;
        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (numList.get(i) + numList.get(j) == minus) {
                    Integer num1 = numList.get(i);
                    Integer num2 = numList.get(j);

                    numList.remove(numList.indexOf(num1));
                    numList.remove(numList.indexOf(num2));

                    break outer;
                }
            }
        }

        for (Integer integer : numList) {
            System.out.println(integer);
        }
    }
}
