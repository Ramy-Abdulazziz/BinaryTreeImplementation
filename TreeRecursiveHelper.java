package p3;

public class TreeRecursiveHelper<T> {

    public static String preOrderRecursive(TreeNode node, StringBuilder string){

        if (node == null) return string.toString();

        string.append(node.element + ", ");

        preOrderRecursive(node.left, string);
        preOrderRecursive(node.right, string);

        return string.toString();

    }

    public static String postOrderRecursive(TreeNode node, StringBuilder string){

        if (node == null) return string.toString();

        postOrderRecursive(node.left, string);
        postOrderRecursive(node.right, string);
        string.append(node.element + ", ");


        return string.toString();
    }

    public static String inOrderRecursive(TreeNode node, StringBuilder string){

        if (node == null) return string.toString();


        inOrderRecursive(node.left, string);
        string.append(node.element + ", ");
        inOrderRecursive(node.right, string);

        return string.toString();

    }

}
