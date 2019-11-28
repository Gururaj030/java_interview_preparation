package bst;

import java.util.ArrayList;
import java.util.List;

public class HackerRank {

	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4, 5 };
		int d = 2;
		
		rotLeft(a,d);
		
		System.out.println();
//		List<Integer> integers = new ArrayList<Integer>();
//		for(int i = 0; i <= a.length; i++) {
//			integers.add(a[i]);
//		}
//		
//		for(int i = 1; i <= d; i++) {
//			integers.add(integers.get(0));
//			integers.remove(0);
//		}
//		integers.toArray();
	}

    static int[] rotLeft(int[] a, int d) {
        List<Integer> integers = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++) {
            integers.add(a[i]);
        }
        
        for(int i = 1; i <= d; i++) {
            integers.add(integers.get(0));
            integers.remove(0);
        }

        int[] primitive = integers.stream()
				.mapToInt(Integer::intValue)
				.toArray();
        return primitive;
    }

}
