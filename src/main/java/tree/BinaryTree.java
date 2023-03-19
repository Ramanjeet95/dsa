package tree;

public class BinaryTree {
    BinaryTree() {

    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(1, null, null);
    }
/*
*   Tree
* 				1
		2				3
	4		5		6		7
8		9
*
* Preorder  1 2 4 8 9 5 3 6 7
* Inorder   8 4 9 2 5 1 6 3 7
* Postorder 8 9 4 5 2 6 7 3 1
* */
    public static BinaryTreeNode<Integer> sampleIntBinaryTree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> c1 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> c2 = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> c3 = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> c4 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> c5 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> c6 = new BinaryTreeNode<>(7);
        BinaryTreeNode<Integer> c7 = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> c8 = new BinaryTreeNode<>(9);

        root.setLeft(c1);
        root.setRight(c2);
        c1.setLeft(c3);
        c1.setRight(c4);
        c2.setLeft(c5);
        c2.setRight(c6);
        c3.setLeft(c7);
        c3.setRight(c8);
        return root;
    }
}
