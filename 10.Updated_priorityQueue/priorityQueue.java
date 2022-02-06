import java.util.PriorityQueue;
import sort.Element;

public class priorityqueue {
	int[] element(int[] data) {
		PriorityQueue<org.w3c.dom.Element> q = new priorityqueue<Element>();
	
		for(int i=0; i<data.length; i++) {
			q.add(new Element(data[i]));
		}
		int size = q.size();
		for(int i=0; i<size; i++) {
			data[i] = q.poll().getNum();
		}
		return data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {4, 54, 2, 8, 63, 7, 55, 56};
		
		//우선 순위 큐 전
		System.out.println("# 우선순위 큐 전");
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]+" ");
		}
		System.out.println();
		//우선 순위 큐 후
		priorityqueue test = new priorityqueue();
		test.element(data);
		
		System.out.println("# 우선순위 큐 후");
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]+" ");
		}
	}
}

public class Element implements Comparable<Element>{
	private int num;	//정렬의 기준이 될 값
	
	public Element(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	@Override	//Compare 인터페이스의 compareTo메소드 구현
	public int compareTo(Element o) {	//오름차순
		return num-o.num;
	}
}
