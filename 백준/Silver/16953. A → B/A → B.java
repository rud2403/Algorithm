import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int a;
    static int b;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = bf.readLine().split(" ");
        a = Integer.parseInt(strArr[0]);
        b = Integer.parseInt(strArr[1]);

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(a, 1)); // 시작 수, 연산 횟수

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            long value = current.getKey();
            int count = current.getValue();

            if(value == b) {
                System.out.println(count);
                return;
            }

            if(value * 2 <= b) queue.offer(new Pair(value * 2, count + 1));
            if(value * 10 + 1 <= b) queue.offer(new Pair(value * 10 + 1, count + 1));
        }

        System.out.println(-1);
    }
}

class Pair {
    long key;
    int value;

    public Pair(long key, int value) {
        this.key = key;
        this.value = value;
    }

    public long getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}
