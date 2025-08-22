class Solution {
    public int[] solution(int[] sequence, int k) {
        int left = 0, right = 0;
        int sum = sequence[0];
        int[] answer = {0, sequence.length - 1};

        while (true) {
            if (sum == k) {
                // 길이 더 짧은 수열로 갱신
                if (right - left < answer[1] - answer[0]) {
                    answer[0] = left;
                    answer[1] = right;
                }
            }

            if (sum >= k) { // 크거나 같으면 왼쪽 줄여봄
                sum -= sequence[left];
                left++;
            } else { // 작으면 오른쪽 늘려봄
                right++;
                if (right == sequence.length) break;
                sum += sequence[right];
            }
        }

        return answer;
    }
}
