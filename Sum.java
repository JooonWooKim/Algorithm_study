//백준 8393번

import java.util.*;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
