// Euclid method: 좀더 단순한 버전

public static int gcd02(int p, int q){
	if(q==0)
		return p;
	else
		return gcd(q, p%q);
}