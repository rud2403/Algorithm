import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Map<String, Integer>> timeTable = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        int preEnd = 0;
        int result = 0;

        for (int i = 0; i < n; i++) { // 시간표 List에 값 저장 완료
            Map map = new HashMap<String, Integer>();

            String[] strArr = br.readLine().split(" ");

            int start = Integer.parseInt(strArr[0]);
            int end = Integer.parseInt(strArr[1]);

            map.put("start", start);
            map.put("end", end);

            timeTable.add(map);
        }

        Collections.sort(timeTable, new MapComparator());

        for (Map<String, Integer> stringIntegerMap : timeTable) {
            if (preEnd <= stringIntegerMap.get("start")) {
                result++;
                preEnd = stringIntegerMap.get("end");
            }
        }

        System.out.println(result);
    }

    public static class MapComparator implements Comparator<Map<String, Integer>> {
        @Override
        public int compare(Map<String, Integer> map1, Map<String, Integer> map2) {
            int start1 = map1.get("end");
            int start2 = map2.get("end");

            if (start1 != start2) {
                return Integer.compare(start1, start2); // 시작 시간으로 오름차순 정렬
            } else {
                int end1 = map1.get("start");
                int end2 = map2.get("start");
                return Integer.compare(end1, end2); // 시작 시간이 같으면 end 시간으로 오름차순 정렬
            }
        }
    }
}