package SDNLFIX;

public class TreeNode {
    private DataPengeluaran Data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    private TreeNode parent;

   public TreeNode(){}
    public TreeNode(DataPengeluaran Data){
    this.Data = Data;
}

    public DataPengeluaran getData() {
        return Data;
    }

    public void setData(DataPengeluaran Data) {
        this.Data = Data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
    
     public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}