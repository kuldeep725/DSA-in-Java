import java.util.LinkedList;
import java.util.Queue;

public class BST <Key extends Comparable<Key>, Value>{
	
	Node root;
	private class Node {
		
		private Key key;
		private Value value;
		private Node left;
		private Node right;
		private int count;
		
		public  Node(Key key, Value value, int count) {
			this.key = key;
			this.value = value;
		}
		
	}
	
	public Value get(Key key) {
		return get(root, key);
	}
	
	private Value get(Node x, Key key) {
		if(x == null)	return null;
		int cmp = key.compareTo(x.key);
		Value val;
		if(cmp < 0) 			val = get(x.left, key);
		else if (cmp > 0)		val = get(x.right, key);
		else					return x.value;
		return val;
	}

	public void put(Key key, Value value) {
		root = put(root, key, value);
	}
	
	private Node put(Node x, Key key, Value value) {
		
		if(x == null)	return new Node(key, value, 1);
		int cmp = key.compareTo(x.key);
		if(cmp < 0) 			x.left = put(x.left, key, value);
		else if (cmp > 0)		x.right = put(x.right, key, value);
		else					x.value = value;
		x.count = 1 +  size(x.left)+size(x.right); 
		return x;
		
	}
	
	public void deleteMin() {
		root = deleteMin(root);
	}
	
	private Node deleteMin(Node x) {
		if(x.left == null)		return x.right;
		x.left = deleteMin(x.left);
		x.count = 1 +  size(x.left)+size(x.right); 
		return x;
	}
	
	public void delete(Key key) {
		root = delete(root, key);
	}

	private Node delete(Node x, Key key) {
		
		if(x == null)		return x;
		int cmp = key.compareTo(x.key);
		if(cmp < 0)			x.left   = delete(x.left, key);
		else if(cmp > 0)		x.right = delete(x.right, key);
		else {
			if(x.left == null)		return x.right;
			if(x.right == null)	return x.left;
			Node t = x;
			x = min(t.right);
			System.out.println("x.key = "+x.key);
			System.out.println("t.key = "+t.key);
			x.right = deleteMin(t.right);
			x.left = t.left;
		}
		x.count = 1 + size(x.left) + size(x.right);
		return x;
		
	}

	private Node min(Node x) {
		if(x.left == null)		return x;
		Node p = min(x.left);
		return p;
	}

	public int size() {
		return size(root);
	}
	
	public Iterable<Key> keys() {
		Queue<Key> q = new LinkedList<Key>();
		inorder(root, q);
		return q;
	}
	
	private void inorder(Node x, Queue<Key> q) {
		if(x == null)	return;
		inorder(x.left, q);
		q.add(x.key);
		inorder(x.right,q);
	}

	private int size(Node x) {
		if(x == null)	return 0;
		return x.count;
	}

}
