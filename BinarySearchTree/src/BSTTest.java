
public class BSTTest {
	
	 public static void main(String[] args) {
		
		 BST<String, Integer> test = new BST<String, Integer>();
		 test.put("S", 8);
		 test.put("E", 6);
		 test.put("X", 1);
		 test.put("A", 2);
		 test.put("R", 3);
		 test.put("C", 1);
		 test.put("H", 2);
		 test.put("M",1);
		 test.put("B", 0);
		 test.put("Z", 11);
		 System.out.println("Key : Value");
		 for(String key : test.keys()) {
			 System.out.println(key + "      "+test.get(key));
		 }
		 test.delete("E");
		 for(String key : test.keys()) {
			 System.out.println(key + "      "+test.get(key));
		 }
	}

}
