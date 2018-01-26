import java.util.Scanner;
import java.util.Stack;
//( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )
public class InfixExpressionUsingStackTest {

	public static void main(String[] args) {
		
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		Scanner scan = new Scanner (System.in);
		
		while (scan.hasNext()) {
			
			String s = scan.next();
			if (s.equals("("));
			else if (s.equals("+"))
				ops.push(s);
			else if (s.equals("*"))
				ops.push(s);
			else if (s.equals(")")){
				String op = ops.pop();
				if(op.equals("+")) vals.push(vals.pop() + vals.pop());
				else if (op.equals("*")) vals.push(vals.pop() * vals.pop());
			}
			else vals.push(Double.parseDouble(s));
			
		}
		
		System.out.println(vals.pop());
		scan.close();

	}

}
