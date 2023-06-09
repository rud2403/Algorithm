import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> intArr = new LinkedList<>();

        int n = Integer.parseInt(br.readLine()); // 카드의 수

        for(int i = 1; i <= n; i++) {
            intArr.add(i);
        }

        while(intArr.size() > 1) {
            intArr.remove();

            int first = intArr.poll();
            intArr.add(first);
        }

        System.out.println(intArr.peek());
    }
}