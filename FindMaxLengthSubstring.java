
public class FindMaxLengthSubstring {

	public static void main(String[] args) {
		String string = "ABCDEFGHA";
		
		int max_count = 0;
		int sub_count = 0;
		String sub = null;
		
		for(int i=0; i<string.length()-1; i++) {
			StringBuffer subString = new StringBuffer();
			char c = string.charAt(i);
			for(int j=i+1; j<string.length(); j++) {
				if (string.charAt(j) == c) {
					break;
				}
				subString.append(string.charAt(j));
			}
			sub_count = subString.length();
			if (sub_count > max_count) {
				max_count = sub_count;
				sub = subString.toString();
			}
		}

		System.out.println(sub);
		System.out.println(max_count);
	}

}
