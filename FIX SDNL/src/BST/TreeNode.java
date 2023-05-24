package BST;
public class TreeNode {
    private int data;
    private TreeNode leftNode, rightNode;

    TreeNode(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public TreeNode getLeftNode() {
        return leftNode;
    }
    public TreeNode getRightNode() {
        return rightNode;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
    
    public void insert(int data) {
        if (data > getData()) {
            if (getRightNode() == null) {
                setRightNode(new TreeNode(data));
            } else {
                getRightNode().insert(data);
            }
        } else {
            if (getLeftNode() == null) {
                setLeftNode(new TreeNode(data));
            } else {
                getLeftNode().insert(data);
            }

        }
    }
}
