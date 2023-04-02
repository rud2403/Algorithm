import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        // 각 학생의 평균 점수 계산
        double[] averages = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            int english = score[i][0];
            int math = score[i][1];
            double average = (english + math) / 2.0;
            averages[i] = average;
        }
        
        // 평균 점수가 높은 순서대로 정렬
        Integer[] sortedIndexes = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            sortedIndexes[i] = i;
        }
        Arrays.sort(sortedIndexes, (a, b) -> Double.compare(averages[b], averages[a]));
        
        // 각 학생의 등수 계산
        int[] ranks = new int[score.length];
        int rank = 1;
        for (int i = 0; i < score.length; i++) {
            if (i > 0 && averages[sortedIndexes[i]] != averages[sortedIndexes[i - 1]]) {
                rank = i + 1;
            }
            ranks[sortedIndexes[i]] = rank;
        }
        
        // 결과 배열에 등수 저장
        int[] result = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = ranks[i];
        }
        
        // 결과 반환
        return result;
    }
}