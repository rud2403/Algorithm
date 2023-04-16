import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String[] strArr = new String[num];
		
		
		for(int i=0; i<num; i++) {
			strArr[i] = sc.next();
		}
		
		Arrays.sort(strArr, new Comparator<String>() {
			
			public int compare(String a, String b) {
				if (a.length() == b.length()) {
					return a.compareTo(b);
				} else {
					return a.length()-b.length();
				}
			}
		});
		
			System.out.println(strArr[0]);
		
		for (int i = 1; i < num; i++) {
			// 중복되지 않는 단어만 출력
			if (!strArr[i].equals(strArr[i - 1])) {
				System.out.println(strArr[i]);
			}
		}
		
	}
}