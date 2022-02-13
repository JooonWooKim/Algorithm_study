//백준 10430번 문제

import java.util.Scanner;

class EqualsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A =	sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println((A%C * B%C)%C);	
	}
}
