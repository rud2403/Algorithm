import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		str = str.replace("lj", "a")
				.replace("c=", "a")
				.replace("c-", "a")
				.replace("dz=", "a")
				.replace("d-", "a")
				.replace("nj", "a")
				.replace("s=", "a")
				.replace("z=", "a");
		
		System.out.println(str.length());
		
		
		
	}
}
