import java.util.ArrayList;
import java.util.List;

public class OperativeRTest {

	public static void main(String[] args) {
//		int[] a = {1, 2 , 3 , 4};
		
		int[] a = {3 , 4, 5, 3, 7};
		System.out.println(get(a));
	}
	
	public static int get(int[] a) {
		int result = 0;
		boolean flag = true;
		
		List<Integer> numbers = new ArrayList<Integer>();
			
		for (int i = 0; i < a.length ; i++) {
			System.out.println(numbers);
			if (numbers.contains(a[i])) {
				result = i;
				flag = false;
			} else {
				numbers.add(a[i]);
			}
		}
		
		if (flag) {
			for (int i = 1; i < a.length - 1 ; i++) {
				int leftDiff = a[i] - a[i-1];
				int rightDiff = a[i+1] - a[i];
				
				if (leftDiff == rightDiff) {
					flag = true;
				}
			}
			
			if (flag) { 
				result = -1;
			}
		}
		return result; 
	}
	

}
