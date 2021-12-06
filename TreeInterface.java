package p3;

public interface TreeInterface<T> {

    String preOrder();

    String postOrder();

    String inOrder();

    int numNodes();

    int depth(TreeNode<T> root);
}
