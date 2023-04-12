import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int f = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		
		if(f == s && s == t) {
			System.out.println(10000 + t*1000);
		} else if(f == s && s != t) {
			System.out.println(1000 + f*100);
		} else if(f == t && s != t) {
			System.out.println(1000 + f*100);
		} else if(s == t && s != f) {
			System.out.println(1000 + s*100);
		} else {
			if(f > s && f > t) {
				System.out.println(f*100);
			} else if (s > f && s > t) {
				System.out.println(s*100);
			} else if (t > f && t > s){
				System.out.println(t*100);
			}
		}
			
	}

}