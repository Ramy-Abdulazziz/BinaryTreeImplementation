package p3;

import java.util.LinkedList;
import java.util.Queue;

public class Tree<T> implements TreeInterface<T> {

    TreeNode<T> root;
    Queue<TreeNode> elements = new LinkedList<>();
    int numNodes;

    public Tree() {

        this.root = null;
        numNodes = 0;
    }

    public Tree(TreeNode<T> node) {

        this.root = node;
        numNodes = 1;
    }


    public Tree(T... elems) {

        for (T e : elems) {

            insertElementBFS(e);
            numNodes++;
        }

    }

    public void insertElementBFS(T element) {

        TreeNode<T> node = new TreeNode<T>(element);

        if (root == null) root = node;
        else if (elements.peek().left == null) {

            elements.peek().left = node;
        } else {

            elements.peek().right = node;
            elements.remove();
        }

        elements.add(node);
    }


    @Override
    public String preOrder() {

        StringBuilder string = new StringBuilder();
       return TreeRecursiveHelper.preOrderRecursive(root,string);
    }



    @Override
    public String postOrder() {

        StringBuilder string = new StringBuilder();

        return TreeRecursiveHelper.postOrderRecursive(root, string);

    }



    @Override
    public String inOrder() {

        StringBuilder string = new StringBuilder();

        return TreeRecursiveHelper.inOrderRecursive(root, string);

    }

    @Override
    public int numNodes() {

        return numNodes;
    }

    @Override
    public int depth(TreeNode<T> node) {
        if (node == null) return -1;
        if (numNodes() == 1) return 0;

        //find height of left
        int left = depth(node.left);

        //find height of right
        int right = depth(node.right);

        //return larger
        return 1 + Math.max(left, right);
    }


}
