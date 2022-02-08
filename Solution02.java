import java.util.Arrays;
import java.util.Comparator;

//객체의 정렬: 사용자 정의 객체
//Comparable: 2가지 기준으로 정렬
//데이터 객체의 static member로 둔다
public class Solution02{
	public String name;
	public int quantity;

	public Solution02(String name, int quantity){
		this.name = name;
		this.quantity = quantity;
	}

	public static Comparator<Solution02> nameComparator = new Comparator<Solution02>(){
		@Override
		public int compareTo(Solution02 o1, Solution02 o2){
			return o1.quantity - o2.quantity;
		}
	};

	public static void main(String[] args){
		Solution01 []  fruits = new Solution02[4];
		fruits[0] = new Solution02("pineapple", 70);
		fruits[1] = new Solution02("Apple", 100);
		fruits[2] = new Solution02("Orange", 80);
		fruits[3] = new Solution02("Banana", 90);
		Arrays.sort(fruits, Solution02.nameComparator);
		for(int i=0; i<fruits.length; i++){
			System.out.println(fruits[i].name + " " + fruits[i].quantity);
		}
	}
}