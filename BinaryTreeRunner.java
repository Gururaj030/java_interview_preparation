package bst;

class Node {
	int value;
	Node left;
	Node right;
}

class BTree {
	public Node insert(Node node, int value) {		
		if (node == null) {
			return createNode(value);
		} 
		
		if (value < node.value) {
			node.left = insert(node.left, value);
		} else if (value > node.value) {
			node.right = insert(node.right, value);
		}
		
		return node;
	}

	private Node createNode(int value) {
		Node node = new Node();
		node.value = value;
		node.left = null;
		node.right = null;
		return node;
	}
	
}

public class BinaryTreeRunner {

	public static void main(String[] args) {
		Node root = null;
		
		BTree bTree = new BTree();
		
		int numbers[] = { 8, 3, 6, 10, 4, 7, 1, 14, 13};
		for(int n : numbers) {
			root = bTree.insert(root, n);
		}
		
		root.toString();
	}

}
