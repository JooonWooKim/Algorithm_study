public class BinarySearch{
	//index가 있는 경우 x값의 인덱스 반환, 그 외 -1 반환
	int binarySearch(int arr[], int l, int r, int x)
	{
		if(r >= 1)
		{
			int mid = 1 + (r-1)/2;
	
			//중간에 값이 있는 경우
			if(arr[mid] == x)
			return mid;
	
			//요소가 중간보다 작으면 왼쪽 서브 트리에만 존재 할 수 있다.
			if(arr[mid] > x)
			return binarySearch(arr, 1, mid-1, x);
	
			//그렇지 않은 경우 오른쪽 서브 트리에 존재할 수 있다.
			return binarySearch(arr, mid+1, r, x);
		}
		//배열에 구성 요소가 없으면 -1값 리턴
		return -1;
	}

	//Driver method to test above
	public static void main(String[] args)
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = {2, 3, 4, 10, 40};
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n-1, x);
		if(result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index" + result);
	}
}
