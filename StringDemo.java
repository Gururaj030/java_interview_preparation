import java.util.ArrayList;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "guru";
		String s2 = "guru";
		
		List<Character> characters = new ArrayList<Character>();
		
		s1.chars().forEach(i -> characters.add((char) i));
		
		boolean flag = false;
		
		for ( int i = 0; i < s2.length() -1; i++) {
			if (characters.contains(s2.charAt(i))) {
				flag = true;
				break;
			}
		}
		
		if (flag) {
			System.out.println("matching");
		} 
		else {
			System.out.println("Not matching");
		}
	
	}

}
