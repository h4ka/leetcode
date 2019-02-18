import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDepthBinaryTreeTest {

    @Test
    public void maxDepth() {

        TreeNode root = new TreeNode(3);
        TreeNode l2 = new TreeNode(9);
        TreeNode r2 = new TreeNode(20);
        TreeNode r3 = new TreeNode(7);
        TreeNode l3 = new TreeNode(15);

        root.setLeft(l2);
        root.setRight(r2);
        r2.setLeft(l3);
        r2.setRight(r3);

        assertEquals(3, MaxDepthBinaryTree.maxDepth(root));



    }
}