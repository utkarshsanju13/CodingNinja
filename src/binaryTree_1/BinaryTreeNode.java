package binaryTree_1;

public class BinaryTreeNode<T> {

	static final int COUNT = 5;

	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public static BinaryTreeNode<Integer> createNode() {

		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);

		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
		BinaryTreeNode<Integer> twoLeft = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(5);
		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(6);
		BinaryTreeNode<Integer> threeRight = new BinaryTreeNode<>(7);

		root.left = rootLeft;
		root.right = rootRight;

		rootLeft.left = twoLeft;
		rootLeft.right = twoRight;

		rootRight.left = threeLeft;
		rootRight.right = threeRight;

		return root;
	}

	public static BinaryTreeNode<Integer> createNodeForNodeWithoutSibling() {

		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);

		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
		BinaryTreeNode<Integer> twoLeft = new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(5);
		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(6);
//		BinaryTreeNode<Integer> threeRight = new BinaryTreeNode<>(7);

		root.left = rootLeft;
		root.right = rootRight;

		rootLeft.left = twoLeft;
//		rootLeft.right = twoRight;

		rootRight.left = threeLeft;
//		rootRight.right = threeRight;	

		return root;
	}

	public static BinaryTreeNode<Integer> createUnbalancedTree() {

		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);

		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
		BinaryTreeNode<Integer> twoLeft = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(5);
		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(6);
		BinaryTreeNode<Integer> threeRight = new BinaryTreeNode<>(7);
		BinaryTreeNode<Integer> fourLeft = new BinaryTreeNode<>(8);
		BinaryTreeNode<Integer> eightLeft = new BinaryTreeNode<>(9);

		root.left = rootLeft;
		root.right = rootRight;

		rootLeft.left = twoLeft;
		rootLeft.right = twoRight;

		rootRight.left = threeLeft;
		rootRight.right = threeRight;
		
		twoLeft.left = fourLeft;
		fourLeft.left = eightLeft;

		return root;
	}
	
	public static BinaryTreeNode<Integer> createBST() {

		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);

		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(3);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(10);
		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> threeRight = new BinaryTreeNode<>(6);
		BinaryTreeNode<Integer> sixLeft = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> sixRight = new BinaryTreeNode<>(7);
		BinaryTreeNode<Integer> tenRight = new BinaryTreeNode<>(14);
		BinaryTreeNode<Integer> fourteenLeft = new BinaryTreeNode<>(13);

		root.left = rootLeft;
		root.right = rootRight;

		root.left.left = threeLeft;
		root.left.right = threeRight;
		
		threeRight.left = sixLeft;
		threeRight.right = sixRight;
		
		root.right.right = tenRight;
		tenRight.left = fourteenLeft;
			
		return root;
	}

	// Print like this fashion
//	1: L2, R3
//	2: L4, R5
//	3: L6, R7
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data);
		}
		if (root.right != null) {
			System.out.print(", R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void print2DUtil(BinaryTreeNode<Integer> root, int space) {
		// Base case
		if (root == null)
			return;

		// Increase distance between levels
		space += COUNT;

		// Process right child first
		print2DUtil(root.right, space);

		// Print current node after space
		// count
		System.out.print("\n");
		for (int i = COUNT; i < space; i++)
			System.out.print(" ");
		System.out.print(root.data + "\n");

		// Process left child
		print2DUtil(root.left, space);
	}

	// Wrapper over print2DUtil()
	public static void print2D(BinaryTreeNode<Integer> root) {
		// Pass initial space count as 0
		print2DUtil(root, 0);
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = BinaryTreeNode.createNode();
		printTreeDetailed(root);
	}
}
