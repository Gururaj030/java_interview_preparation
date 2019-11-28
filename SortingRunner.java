
public class SortingRunner {

	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 3, 1};
		
		
		print(arr);
		
//		for(int i = 0; i < arr.length - 1; i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//			print(arr);
//		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index]) index = j;

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		
		print(arr);
	}
	
	static void print(int[] numbers) {
		for(int n: numbers) System.out.print(n + " ");
		System.out.println();
	}

}
