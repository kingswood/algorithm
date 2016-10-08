package tree;

import java.util.ArrayDeque;

public class CreateTreeFromString {

	public static void createTree(Node node, ArrayDeque<Character> deque) {

		if (deque.isEmpty()) {
			return;
		}
		char c = (char)deque.poll();
		if (c != '#') {
			node.value = String.valueOf(c);
		} else {
			node = null;
		}

		if (null != node) {
			Node leftNode = new Node();
			node.left = leftNode;
			createTree(leftNode, deque);
			
			Node rightNode = new Node();
			node.right = rightNode;
			createTree(rightNode, deque);
		}

	}

	public static void preOrderTraversal(Node node) {
		
		
		if(null == node.value){
			System.out.print("#");
		}else{
			System.out.print(node.value);
		}
		

		if (null != node.left) {
			preOrderTraversal(node.left);
		}

		if (null != node.right) {
			preOrderTraversal(node.right);
		}

	}

	public static void main(String[] args) {

		String str = "AB#D##C##";

		char[] c = str.toCharArray();

		ArrayDeque<Character> deque = new ArrayDeque<Character>();
		for (int i = 0; i < c.length; i++) {
			deque.add(c[i]);
		}

		Node root = new Node();

		createTree(root, deque);
		
		preOrderTraversal(root);

	}

}
