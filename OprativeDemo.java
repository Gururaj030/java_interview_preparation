import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OprativeDemo {

	public static void main(String[] args) {
		int [] numbers = new int[] {1, 2, 3, 3, 4};
		System.out.println(solution(numbers));
	}

    public static int solution(int[] A) {
    	boolean hasAnyNegative = IntStream.of(A).anyMatch(i -> i < 0);
    	int result = 0;
    	if (hasAnyNegative) {
    			result = 1;
    	} else {
	        List<Integer> sorted = IntStream.of(A).distinct().sorted().boxed().collect(Collectors.toList());
	        int max = IntStream.of(A).distinct().max().getAsInt();
	        
	        boolean flag = true;
	
	        for (int i = 1; i <= max; i++) {
	        	if (!sorted.contains(i)) {
	        		flag = false;
	        		result = i;
	        	} 
	        }
	
	        if (flag) result = max + 1;
    	} 
        return result;
    }
}
