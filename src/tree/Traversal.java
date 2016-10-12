package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;



public class Traversal {
	
	
	public static void preOrderTraversal(Node node){
		
		System.out.print(node.value);
		
		if(null != node.left){
			preOrderTraversal(node.left);
		}
		
		if(null != node.right){
			preOrderTraversal(node.right);
		}
		
	}
	
	public static void inOrderTraversal(Node node){
		if(null != node.left){
			inOrderTraversal(node.left);
		}
		System.out.print(node.value);
		
		if(null != node.right){
			inOrderTraversal(node.right);
		}
	}
	
	public static void postOrderTraversal(Node node){
		if(null != node.left){
			postOrderTraversal(node.left);
		}
		if(null != node.right){
			postOrderTraversal(node.right);
		}
		System.out.print(node.value);
	}
	
	public static void layerOrderTraversal(Node node){
		List<Node> list = new ArrayList<>();
		list.add(node);
		
		while(!list.isEmpty()){
			
			List<Node> temp = new ArrayList<>();
			
			for(Node n: list){
				System.out.print(n.value);
				if(null != n.left){
					temp.add(n.left);
				}
				if(null != n.right){
					temp.add(n.right);
				}
			}
			
			list = temp;			
		}
	}
	
	public static void layerOrderTraversalWithQueue(Node node){
		ArrayDeque<Node> deque = new ArrayDeque<>();
		
		deque.add(node);
		
		while(!deque.isEmpty()){
			Node n = deque.poll();
			System.out.print(n.value);
			if(null!= n.left){
				deque.add(n.left);
			}
			if(null!= n.right){
				deque.add(n.right);
			}
		}
	}
	
	
	public static void main(String[] args){
		
		Node root = initialTree();
		System.out.println();
		
		preOrderTraversal(root);
		
		System.out.println();
		
		postOrderTraversal(root);
		
		System.out.println(); 
		
		inOrderTraversal(root);
		
		System.out.println();
		
		layerOrderTraversal(root);
		
		System.out.println();
		
		layerOrderTraversalWithQueue(root);
		
	}
	
	
	public static Node initialTree(){
		
		Node a = new Node("A");
		Node c = new Node("C");
		Node e = new Node("E");
		Node p = new Node("P");
		Node d = new Node("D");
		Node f = new Node("F");
		Node w = new Node("W");
		Node n = new Node("N");
		Node q = new Node("Q");
		Node s = new Node("S");
		Node v = new Node("V");
		Node h = new Node("H");
		Node r = new Node("R");
		Node x = new Node("X");
		Node z = new Node("Z");
		
		a.left = c;
		a.right = e;
		c.left = p;
		c.right = d;
		e.left = f;
		e.right = w;
		p.left = n;
		d.left = q;
		d.right = s;
		f.right = v;
		w.right = h;
		n.right = r;
		h.left = x;
		h.right = z;
		
		return a;
	}

	
}
