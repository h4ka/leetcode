
public class MaxDepthBinaryTree {



    public static int maxDepth(TreeNode root) {

        if (root == null) return 0;
        int lDepth = maxDepth(root.getLeft());
        int rDepth = maxDepth(root.getRight());
        return (lDepth > rDepth) ? lDepth + 1 : rDepth + 1;

    }


}
