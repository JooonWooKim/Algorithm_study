public class Code02{
	public static void main(String[] args)
	{
		int n=4;
	}
	public static void func(int n){
	if (n <= 0)
		return;
	else{
		System.out.println("Hello...");
		func(n-1);
		}
	}
}
//Code01와는 다르게 baseCode에 의해, 
// 무한루프에 빠지지 않게된다.
