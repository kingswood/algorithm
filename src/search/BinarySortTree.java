package search;

public class BinarySortTree {
	
	
	public static boolean search(Node node, int value){
		
		if(null == node){
			return false;
		}
		
		if(node.getValue() == value){
			return true;
		}
		
		if(value < node.getValue()){
			return search(node.getLeft(), value);
		}else{
			return search(node.getRight(), value);
		}
		
	}
	
	public static Node insert(Node node, int value){
		
		if(null == node){
			return new Node(value);
		}
		
		if(node.getValue() > value){
			node.setLeft(insert(node.getLeft(), value)); 
		}else{
			node.setRight(insert(node.getRight(), value));
		}
		
		return node;
	}
	
	public static void traverseTree(Node node){
		
		if(null == node){
			return;
		}
		
		traverseTree(node.getLeft());
		
		System.out.println(node.getValue());
		
		traverseTree(node.getRight());
		
	}
	
	public static Node initialTree(){
		
		Node node62 = new Node(62);
		Node node58 = new Node(58);
		Node node88 = new Node(88);
		Node node47 = new Node(47);
		Node node73 = new Node(73);
		Node node99 = new Node(99);
		Node node35 = new Node(35);
		Node node51 = new Node(51);
		Node node93 = new Node(93);
		Node node37 = new Node(37);
		
		node62.setLeft(node58);
		node62.setRight(node88);
		
		node58.setLeft(node47);
		
		node88.setLeft(node73);
		node88.setRight(node99);
		
		node47.setLeft(node35);
		node47.setRight(node51);
		
		node99.setLeft(node93);
		
		node35.setRight(node37);
		
		
		return node62; //root node
		
	}
	
	public static Node initialTreeByInsert(){
		int[] a = {62,58,88,47,73,99,35,51,93,37};
		
		Node root = new Node(a[0]);
		
		for(int i = 1; i<a.length;i++){
			insert(root, a[i]);
		}
		
		return root;
	}
	
	public static void main(String[] args){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		
		Node root = initialTree();
		
		//Node root = initialTreeByInsert();
		
		System.out.println(search(root, 0));
		
		traverseTree(root);
		
	}
	
}
