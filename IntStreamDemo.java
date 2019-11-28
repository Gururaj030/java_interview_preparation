import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {
		int[] numbers = {1, 5, 65, 2 , 9, 0, 9, 5};
		
		IntSummaryStatistics statistics = IntStream.of(numbers).summaryStatistics();
		
		System.out.println(statistics.getCount());
		
		IntStream.of(numbers).boxed().forEach(System.out::print);
		
		System.out.println(IntStream.of(numbers).average().getAsDouble());
		
		System.out.println(IntStream.of(numbers).noneMatch(i -> i != 0));
		
		IntStream.of(numbers).sorted().forEach(System.out::print);
		
		IntStream.of(numbers).forEach(i -> System.out.println(i));
		
		
		IntStream.of(numbers).skip(1).forEach(System.out::print);
		
		
		System.out.println();
		IntStream.of(numbers).distinct().forEach(System.out::print);
		System.out.println();
		System.out.println(IntStream.of(numbers).allMatch(i -> i%2 == 0));
		System.out.println(IntStream.of(numbers).anyMatch(i -> i%2 == 0));
		
		IntStream.of(numbers).filter(i -> i < 10).forEach(System.out::print);
		System.out.println();
		
		IntStream.of(numbers).map(i -> i*2).forEach(System.out::println);
		
		System.out.println(IntStream.of(numbers).findFirst().getAsInt());
		
//		IntStream.of(numbers).forEachOrdered(i -> System.out.print(i + " "));
		
		IntStream.range(1, 101).forEach(System.out::println);
		System.out.println("**********");
		IntStream.rangeClosed(1, 100).forEach(System.out::println);
	}
	
}
