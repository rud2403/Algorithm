import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String[] strArr = str.split("");
		StringBuilder sb = new StringBuilder();
		
		
		Arrays.sort(strArr, Collections.reverseOrder());
		
		for(int i=0; i < strArr.length; i++) {
			sb.append(strArr[i]);
		}
		
		
		System.out.println(sb);
	}
}
