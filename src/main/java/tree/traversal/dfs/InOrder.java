package tree.traversal.dfs;

import tree.BinaryTree;
import tree.BinaryTreeNode;

import java.util.Stack;

public class InOrder {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTree.sampleIntBinaryTree();
        inOrder(root);
    }

    public static void  inOrder(BinaryTreeNode<Integer> root) {


        if (root == null) return;
        Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
        BinaryTreeNode<Integer> currentNode = root;
        boolean isDone = false;
        while (!isDone) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            } else {

                if (stack.isEmpty()) {
                    isDone = true;
                } else {
                    currentNode = stack.pop();
                    System.out.print(currentNode.getData() + " ");
                    currentNode = currentNode.getRight();

                }
            }
        }

    }
}
