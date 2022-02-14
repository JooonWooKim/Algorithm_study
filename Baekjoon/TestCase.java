//백준 10950번

import java.util.*;

public class TestCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	//테스트 케이스 갯수
		int arr[] = new int[T];
		
		for(int i=0; i<=T-1; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			arr[i] = A+B;
		}
		sc.close();
		
		for(int K:arr) {
			System.out.println(K);
		}
	}
}
