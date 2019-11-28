import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

	@Override
	public int compareTo(User o) {
		return this.name.compareTo(o.name);
	}
}

public class StreamDemo {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("C", 30),
                new User("D", 40),
                new User("A", 10),
                new User("B", 20),
                new User("E", 50));
        
        List<User> sortedList = users.stream()
			.sorted((o1, o2) -> o1.getAge() - o2.getAge())
			.collect(Collectors.toList());
		
        sortedList.forEach(System.out::println);
        
        System.out.println("**********************");
        List<User> sortedListAsc = users.stream()
			.sorted(Comparator.comparingInt(User::getAge))
			.collect(Collectors.toList());
 
        sortedListAsc.forEach(System.out::println);
        
        System.out.println("**********************");
        List<User> sortedListDesc = users.stream()
			.sorted(Comparator.comparingInt(User::getAge).reversed())
			.collect(Collectors.toList());

        sortedListDesc.forEach(System.out::println);
        
        System.out.println("**********************");
        List<User> sortedListNameAsc = users.stream()
			.sorted(Comparator.comparing(User::getName))
			.collect(Collectors.toList());

        sortedListNameAsc.forEach(System.out::println);
        
        System.out.println("**********************");
        List<User> sortedListNameDesc = users.stream()
			.sorted(Comparator.comparing(User::getName).reversed())
			.collect(Collectors.toList());

        sortedListNameDesc.forEach(System.out::println);
        
        System.out.println("**********************");
        users.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        
        String s = "GURU";
       
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        s.chars().forEach(c -> map.compute((char) c, (key, value) -> value == null? 1 : value + 1));
         
        System.out.println(map);
        
        String s1 = "RAMUUARM";
        
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        
        s1.chars().forEach(c -> map1.merge((char) c, 1 , (key, value) -> value + 1));
         
        System.out.println(map1);
        
        
        map1.replaceAll((key, value) -> (int)Math.pow(value, value*2));
        
        System.out.println(map1);
    }
}