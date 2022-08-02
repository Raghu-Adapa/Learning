package tree.bt;

class TreeNode {
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


public class FindPath {


    static TreeNode root;

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null) return false;

        if(root.left ==null && root.right==null){

            if(root.val - targetSum == 0)
                return true;
            else return false;

        }

        boolean left = false;
        if(root.left!=null){
            left = hasPathSum(root.left, targetSum - root.val);
        }

        boolean right = false;
        if(root.right!=null) {
            right = hasPathSum(root.right, targetSum - root.val);
        }

        if(left || right){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);


        boolean result = hasPathSum(root, 22);
        System.out.println(result);
    }
}
