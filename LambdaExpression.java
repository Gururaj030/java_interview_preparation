interface A {
	void show(int i);
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		// Ananymous class implementation
		A a1 = new A() {
				public void show(int i) {
					System.out.println("hello");
				}
			};
		
		a1.show(1);
		
		// Since interface A has only one method we can refactor as below using lambda expressions
		A a2 = (i) -> System.out.println("hello " + i);
		
		a2.show(10);
		
		// Since show method take only one parameter so can be refactor as below using lambda expressions
		A a3 = i -> System.out.println("hello " + i);

		a3.show(10);
	}

}
