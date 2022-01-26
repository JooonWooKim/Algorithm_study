public static int gcd(int m, int n){
	if(m<n){
		int tmp = m;
		m=n;
		n=tmp;		//swap m and n
	}
	if(m%n==0)	
		return n;
	else
		return gcd(n, m%n);	
}

// m이 n보다 크거나 같은 두 양의 정수 m과 n에 대해서 m이 n의 배수이면 gcd(m,n) = n이고,
// 그렇지 않으면 gcd(m,n) = gcd(n, m%n)이다.
