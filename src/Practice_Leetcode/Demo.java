package Practice_Leetcode;

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



public class Demo {
    public int Traversal(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        int leftTree = Traversal(root.left, sum);
        int rightTree = Traversal(root.right, sum);
        int val = Math.abs(leftTree - rightTree);
        sum += val;
        return root.val;
    }
    public int findTilt(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int sum = 0;
        Traversal(root, sum);
        return sum;
    }
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int [] output = new int[queries.length];
        int even_sum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                even_sum += nums[i];
            }
        }

        for(int i=0; i<queries.length; i++){
            int val = queries[i][0];
            int idx = queries[i][1];

            if(nums[idx] % 2 == 0){
                even_sum = even_sum - nums[idx];
            }

            nums[idx] += val;

            if(nums[idx] % 2 == 0){
                even_sum += nums[idx];
            }

            output[i] = even_sum;
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println("welcome application to this amazing world");
    }
}
