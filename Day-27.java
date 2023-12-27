/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    double sum =0;
    double cnt;
    List<Double> temp = new LinkedList<Double>();
    public List<Double> averageOfLevels(TreeNode root) {
        printLevelorder(root);
        return temp;
    }
    public void printLevelorder(TreeNode root)
    {
        int h = height(root);
        int i;
        for(i=1;i<=h;i++)
        {
            sum=0;
            cnt=0;
            addCurrentLevel(root,i);
            double avg=(double)sum/(double)cnt;
            temp.add((double)avg);
        }
    }
     int height(TreeNode root)
    {
        if (root == null)
            return 0;
        else {
         
            int lheight = height(root.left);
            int rheight = height(root.right);
 
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    public void addCurrentLevel(TreeNode root,int level)
    {
        if (root == null)
            return;
        if (level == 1)
        {
            sum=sum+root.val;
            cnt++;
        }
        else if (level > 1) {
            addCurrentLevel(root.left, level - 1);
            addCurrentLevel(root.right, level - 1);
        }
    }

}
