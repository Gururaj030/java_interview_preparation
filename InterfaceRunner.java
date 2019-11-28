import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

interface Phone {
	void call();
	default void message() {
		System.out.println("phone message");
	}
}

interface Phone_2 {
	void call();
	default void message() {
		System.out.println("phone-2 message");
	}
}


class AndrodPhone implements Phone{
	public void call() {
		System.out.println("Android calling");
	}
}

public class InterfaceRunner {

	public static void main(String[] args) {
		Phone phone = new AndrodPhone();
		phone.call();
		phone.message();
		
		
		String str = "zz2aa";
		
		List<Character> list = new ArrayList<Character>();
		
		List<String> a = new ArrayList<String>();
		a.add("http://google.com");
		a.add("http://fb.com");
		a.add("http://gmail.com");
		a.add("http://wefwef.com");
		
		Collections.sort(a);
		
		System.out.println(a.toString());
		
		
		
//		for(int i=0; i< str.length(); i++) {
//			list.add(str.charAt(i));
//		}
//		
//		Map<Character, Integer> map = new TreeMap<Character, Integer>();
//		for ( Character c : list) {
//			if (Character.isLetter(c)) {
//				if (map.get(c) != null) {
//					map.put(c, map.get(c) + 1);
//				} else {
//					map.put(c, 1);
//				}
//			}
//		}
//		
//		System.out.println(map.keySet().toArray()[0]);
	}

}
