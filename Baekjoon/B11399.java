import java.util.Arrays;
import java.util.Scanner;

public class B11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("N을 입력하세요.");
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		//정렬
		Arrays.sort(arr);
		
		
		int prev = 0;	//이전까지의 대기시간 누적합
		int sum = 0;	//사람별 대기시간 총합
		
		for(int i = 0; i<N; i++) {
			sum += prev + arr[i];
			//이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
			
			prev += arr[i];
			//이전까지의 누적합에 현재 걸리는 시간을 더해준다.
		}
		System.out.println(sum);
		
	}
}
