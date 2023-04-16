import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<num; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int j=0; j<list.size(); j++) {
			sb.append(list.get(j)+"\n");
		}
		
		System.out.println(sb);
	}
}