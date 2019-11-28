import java.util.HashMap;

class BNode {
	int value;
	Node left;
	Node right;
}

class BTree {
	BNode root;
	
	public BNode insertNode(int value) {
		BNode bNode = createNode(value);
		
		if (root == null) {
			root = bNode;
		} else {
			
		}
		return null;
	}



	private BNode createNode(int value) {
		BNode bNode = new BNode();
		bNode.value = value;
		bNode.left = null;
		bNode.right = null;
		return bNode;
	}
	
}

public class BinaryTreeRunner {

	public static void main(String[] args) {
		BTree bTree = new BTree();
		BNode root = bTree.insertNode(10);
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
	}

}
