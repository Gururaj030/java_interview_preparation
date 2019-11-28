import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "3");
		
		List<Integer> filtered = numbers.stream().map(n -> Integer.valueOf(n))
						.filter(n -> n%2 == 0)
						.collect(Collectors.toList());
		
		Optional<Integer> max = filtered.stream().max((i, j) -> { return (i>j)?1:-1;});
		
		System.out.println(max.get());
		
//		Set<String> a = numbers.stream().filter(n -> n.equals("1")).collect(Collectors.toSet());
//		
//		System.out.println(numbers.stream().anyMatch(n -> n.equals("3")));
//		
//		System.out.println(numbers.stream().allMatch(n -> n.equals("3")));
//		
//		for(String n : numbers.stream().distinct().collect(Collectors.toList())) System.out.println(n);
//		
//		
//		System.out.println(numbers.stream().noneMatch(n -> n.equals("1")));
		


        List<String> houseGryffindor = Arrays.asList("Albus", "Harry", "Ron", "Hermione");
        List<String> houseHufflepuff = Arrays.asList("Bridget", "Cedric", "Nymphadora");
        List<String> houseRavenclaw = Arrays.asList("Luna", "Garrick", "Filius");
        List<String> houseSlytherin = Arrays.asList("Severus", "Tom", "Phineas");
 
        List<List<String>> hogwarts = new ArrayList<List<String>>(); 
        hogwarts.add(houseGryffindor);
        hogwarts.add(houseHufflepuff);
        hogwarts.add(houseRavenclaw);
        hogwarts.add(houseSlytherin);
 
        // Printing All Hogwarts Houses In Pre-Java8 World
        List<String> listOfAllHouses = new ArrayList<String>();
        for(List<String> house : hogwarts) {
            for(String hName : house) {
                listOfAllHouses.add(hName);
            }
        }

        
 
        System.out.println("<!---------------Hogwarts Houses---------------!>");
        System.out.println(listOfAllHouses);
 
        System.out.println();
 
        // Now let's Achieve This By Using 'flatMap()' Method In Java8 
        List<String> flatMapList = hogwarts.stream().flatMap(hList -> hList.stream()).collect(Collectors.toList()); 
        System.out.println("<!---------------Hogwarts Houses Using Java8---------------!>"); 
        System.out.println(flatMapList);   
        
        List listOfIntegers = Stream.of("1", "2", "3", "4").map(Integer::valueOf) .collect(Collectors.toList());
        
        List integers = Stream.of("1", "2", "3", "4").map(i -> Integer.valueOf(i)).collect(Collectors.toList());
        
        System.out.println(integers);   
	}
	

}
