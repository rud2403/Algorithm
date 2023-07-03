import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> strList = new LinkedList<>();
        String str = br.readLine();
        for (char c : str.toCharArray()) {
            strList.add(c);
        }

        ListIterator<Character> iterator = strList.listIterator(strList.size());
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String pressKey = br.readLine();

            if ("L".equals(pressKey)) {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                }
            } else if ("D".equals(pressKey)) {
                if (iterator.hasNext()) {
                    iterator.next();
                }
            } else if ("B".equals(pressKey)) {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                    iterator.remove();
                }
            } else {
                String key = pressKey.split(" ")[1];
                iterator.add(key.charAt(0));
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : strList) {
            result.append(c);
        }

        System.out.println(result.toString());
    }
}