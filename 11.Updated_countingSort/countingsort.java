import java.util.Arrays;
import java.util.Random;

public class countimgsort{
	public int[] sort(int[] data, int maxNumber){
		int[] countData = new int[maxNumber];
		for(int i=0; i<data.length; i++){
			countData[data[i]]++;
		}
	
		for(int i=1; i<countData.length; i++){
			countData[i] = countData[i-1]+countData[i];
		}

		int [] sortedData = new int[data.length];
		for(int i=data.length-1; i>=0; i--){
			sortedData[countData[data[i]]-1] = data[i];
			countData[data[i]]--;
		}
		return sortedData;
	}

	public static void main(String[] args){
		int count = 15;
		int maxNumber = 100;
		Random random = new Random();
		int[] sortArray = new int[count];
		for(int i=0; i<count; i++){
			sortedArray[i] = random.nextInt(maxNumber);
		}

		System.out.println("Before: ");
		System.out.println(Arrays.toString(sortArray));
		System.out.println();
		
		countingsort quicksort = new countingsort();
		sortedArray = quickSort.sort(sortedArray, maxNumber);

		System.out.println("After : ");
		System.out.println(Arrays.toString(sortedArray));
		System.out.println():

		System.out.println("isSorted: "+isSorted(sortedArrays));
	}
}
