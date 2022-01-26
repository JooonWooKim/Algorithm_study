public class Code01{
	public static void main(String[] args)
	func();
}

public static void func(){
	System.out.println("Hello...");
	func();
	}
}
//baseCode가 없기때문에, 
// Hello 무한출력(무한루프에 빠지게 되는 코드)