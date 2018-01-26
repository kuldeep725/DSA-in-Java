import java.util.Stack;

public class InfixExpressionUsingStack {
	
	Stack<Character> ops = new Stack<Character>();
	Stack<Double> vals = new Stack<Double>();
	
	public double evaluate (char[] exp) {
		
		int i = 0;
		
		while(i < exp.length) {
			if (exp[i] != '(') {
				
				if (exp[i] == ')') {
					double b = vals.pop();
					double a = vals.pop();
					char op = ops.pop();
					vals.push(calculate(a, b, op));
				}
				else if (exp[i] <= '9' && exp[i] >= '0') {
					 vals.push((double) exp[i]);
				}
				else {
					ops.push(exp[i]);
				}
			}
			i++;
		}
		
		return vals.pop();
	}

	private double calculate(double a, double b, char op) {
		
		switch (op) {
			case '+' :
				return a+b;
			case '-' :
				return a-b;
			case '/' :
				return a/b;
			case '*' :
				return a*b;
		}
		return Double.MAX_VALUE;
	}

}
