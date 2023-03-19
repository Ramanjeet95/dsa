package tree.traversal.dfs;

import tree.BinaryTree;
import tree.BinaryTreeNode;

import java.util.Stack;

public class PreOrder {
    public static void main(String[] args) {
        iterableTraversal(BinaryTree.sampleIntBinaryTree());
        System.out.println();
        recursiveTraversal(BinaryTree.sampleIntBinaryTree());
    }

    public static <T> void iterableTraversal(BinaryTreeNode<T> root) {
        if (root == null) return;
        Stack<BinaryTreeNode<T>> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode<T> curr = stack.pop();
            System.out.print(curr.getData() + " ");
            if (curr.getRight() != null) stack.push(curr.getRight());
            if (curr.getLeft() != null) stack.push(curr.getLeft());
        }
    }

    public static <T> void recursiveTraversal(BinaryTreeNode<T> root) {
        if (root == null) return;
        System.out.print(root.getData() + " ");
        recursiveTraversal(root.getLeft());
        recursiveTraversal(root.getRight());
    }
}
