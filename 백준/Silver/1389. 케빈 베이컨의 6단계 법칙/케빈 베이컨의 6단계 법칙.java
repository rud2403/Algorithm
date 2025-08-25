import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken()); // 유저의 수
        int m = Integer.parseInt(st.nextToken()); // 친구 관계의 수
        List<Integer>[] friends = new ArrayList[n + 1];
        int minSum = Integer.MAX_VALUE;
        int answerUser = -1;

        for (int i = 1; i <= n; i++) {
            friends[i] = new ArrayList<>();
        }

        // 친구 세팅
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());

            int friendA = Integer.parseInt(st.nextToken());
            int friendB = Integer.parseInt(st.nextToken());

            friends[friendA].add(friendB);
            friends[friendB].add(friendA);
        }

        for(int i = 1; i <= n; i++) {
            boolean[] checked = new boolean[n + 1];
            int sum = bfs(new FriendWithDepth(i, 0), n, friends, checked);

            if(sum < minSum) {
                minSum = sum;
                answerUser = i;
            }
        }

        System.out.println(answerUser);


    }

    public static int bfs(FriendWithDepth fwd, int n, List<Integer>[] friends, boolean[] checked) {
        Deque<FriendWithDepth> dq = new ArrayDeque<>();
        dq.offerLast(fwd);

        int[] count = new int[n + 1];
        int sum = 0;

        while(!dq.isEmpty()) {
            FriendWithDepth cFwd = dq.pollFirst();
            int friend = cFwd.friend;
            int depth = cFwd.depth;

            if(checked[friend]) continue;

            checked[friend] = true;
            count[friend] = depth;

            for(int next : friends[friend]) {
                if(!checked[next]) dq.offerLast(new FriendWithDepth(next, depth + 1));
            }
        }

        for (int j : count) {
            sum += j;
        }

        return sum;
    }
}

class FriendWithDepth {
    int friend;
    int depth;
    FriendWithDepth(int friend, int depth) {
        this.friend = friend;
        this.depth = depth;
    }
}

/*
    1: 3, 4
    2: 3
    3: 1, 2, 4
    4: 1, 5, 3
    5: 4
*/
