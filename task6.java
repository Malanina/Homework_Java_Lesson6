/*Учитывая двоичного дерева, верните порядок обхода значений его узлов.
пример:

Input: root = [1,null,2,3]
Output: [1,2,3]

    public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }
    }

public List<Integer> preorderTraversal(TreeNode root) {
}
 */

import java.util.ArrayList;
import java.util.Stack;

public class task6 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,null, new TreeNode(2, null, new TreeNode(3)));
        System.out.println(TreeNode.preorderTraversal(root));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static ArrayList<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) 
            return list;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) 
                list.add(node.val);

            if (node.right != null) 
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
        }
        return list;
    }

}
