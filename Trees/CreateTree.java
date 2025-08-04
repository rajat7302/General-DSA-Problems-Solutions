import java.util.ArrayList;
import java.util.List;
public class CreateTree{
    private class TreeNode{
           private TreeNode left, right;
           int val;
           TreeNode(int val){
            this.val = val;
           }
    }
    private TreeNode createTree(int nums[], int i){
        if (i >= nums.length) return null;
        TreeNode root = new TreeNode(nums[i]);
        root.left = createTree(nums, 2 * i + 1);
        root.right = createTree(nums, 2 * i + 2);
        return root;
    }
    private void traverse(TreeNode root, List<Integer> ans)
    {
        if (root == null) return;
        traverse(root.left, ans);
        ans.add(root.val);
        traverse(root.right, ans);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        CreateTree ob = new CreateTree();
        TreeNode root = ob.createTree(nums, 0);
        List<Integer> ans = new ArrayList<>();
        ob.traverse(root, ans);
        System.out.println("The inorder traversal is "+ ans);

    }
}