
public class StacksWithGenericsTest {

	public static void main(String[] args) {
		
		StackWithGenerics<String> s = new StackWithGenerics<String>();
		s.push("Hey");
		System.out.println("string = " + s.pop());
		
		StackWithGenerics<Integer> i = new StackWithGenerics<Integer>();
		i.push(100);
		System.out.println("int = " + i.pop());
		
		StackWithGenerics<Character> c = new StackWithGenerics<Character>();
		c.push('a');
		System.out.println("char = " + c.pop());

	}

}
