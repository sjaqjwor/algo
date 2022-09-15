public class SmallElement {

    public static int answer = Integer.MAX_VALUE;
    public static int nodeCount;
    public static void main(String[] args) {
//        TreeNode treeNode1 = new TreeNode(3,new TreeNode(1,null,new TreeNode(2)),new TreeNode(4));
//        System.out.println(kthSmallest(treeNode1,1));
//        TreeNode treeNode2 = new TreeNode(5,new TreeNode(3,new TreeNode(2,new TreeNode(1),null),new TreeNode(4)),new TreeNode(6));
//
        TreeNode treeNode = new TreeNode(5,new TreeNode(3,new TreeNode(2,new TreeNode(1),null),new TreeNode(4)),new TreeNode(6));
        nodeCount=3;
        System.out.println(kthSmallest(treeNode,3));
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      public TreeNode() {}

        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  public static void test(TreeNode root , int k){
      if (root==null) return;
      test(root.left,k);
      --nodeCount;
      if (nodeCount==0){
          answer = Math.min(answer,root.val);
      }
      test(root.right,k);
  }
    public static int kthSmallest(TreeNode root, int k) {
       test(root,k);
       return answer;
    }
}
