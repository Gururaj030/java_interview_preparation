import java.util.HashMap;
import java.util.Map;

public class MapJava8Methods {

	public static void main(String[] args) {

		Map<String, String> statesAndCapitals = new HashMap<String, String>();

		statesAndCapitals = new HashMap<>();
		statesAndCapitals.put("Alaska", "Anchorage");
		statesAndCapitals.put("California", "Sacramento");
		statesAndCapitals.put("Colorado", "Denver");
		statesAndCapitals.put("Florida", "Tallahassee");
		statesAndCapitals.put("Nevada", "Las Vegas");
		statesAndCapitals.put("New Mexico", "Sante Fe");
		statesAndCapitals.put("Utah", "Salt Lake City");
		statesAndCapitals.put("Wyoming", "Cheyenne");
				
		// Method: getOrDefault()
		System.out.println(statesAndCapitals.getOrDefault("Alaska", "nothing"));
		
		// putIfAbsent() -> returns null if key doesn't exist
		System.out.println(statesAndCapitals.putIfAbsent("karnataka", "bangalore"));
		
		// putIfAbsent() -> returns bangalore if key already exist
		System.out.println(statesAndCapitals.putIfAbsent("karnataka", "banglore1"));
		
		// remove(key, value) -> reomve key values matching these - true if exists
		System.out.println(statesAndCapitals.remove("California", "Sacramento"));
		
		// remove(key, value) -> reomve key values matching these - false if doesn't exist
		System.out.println(statesAndCapitals.remove("California", "Sacramento"));
		
		// replace(key, value)
		System.out.println(statesAndCapitals.replace("Alaska", "guru"));
		
		System.out.println(statesAndCapitals.get("Alaska"));
		
		System.out.println(statesAndCapitals.replace("Nevada", "Las Vegas", "Carson City"));
		
		System.out.println(statesAndCapitals.get("Nevada"));
	}

}
