import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		// 테스트 케이스만큼 반복
		for(int i=0; i< num; i++) {
			int ck = 0;
			String str = sc.next();
			int intArr[] = new int[26];
			
			// 배열의 첫번째에 첫번째 문자 값 넣기
			intArr[str.charAt(0) - 'a'] = str.charAt(0);
			
			// 두번째 문자열부터 반복문 진행
			for(int j=1; j < str.length(); j++) {
				
				// 이전 문자와 같지 않다면 ( 새로운 문자가 나온다면 )
				if(str.charAt(j) != str.charAt(j-1)) {
					// 이미 해당 알파벳 인덱스에 값이 있다면 탈출
					if(intArr[str.charAt(j) - 'a'] == str.charAt(j)) {
						ck = 1;
						break;
					}
					// 인덱스에 값이 없다면 값 넣기
					intArr[str.charAt(j) - 'a'] = str.charAt(j);
					
				}
				
				
			}
			if(ck == 0) {
				sum += 1;
			}
		}
		
		System.out.println(sum);
	}
}
