// 0부터 n까지의 합을 구하는 함수(result=10)

public class Code03{
	public static void main(String[] args){
        //func함수의 missin은 0부터 n까지의 합을 구하는 것이다.
		int result = func(4);	
		System.out.println(result);
	}
	public static int func(int n){
		if(n == 0)
			return 0;
            //n=0이라면 합은 0이다.
		else
			return n + func(n-1);
            //n이 0보다 크다면 0에서 n까지의 합은 0에서 n-1까지의 합에 n을 더한 것이다.
	}
}