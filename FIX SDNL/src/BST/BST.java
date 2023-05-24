package BST;

public class BST {
    private Node rootPengeluaran;
    private Node rootPendapatan;

    private class Node {
        private double value;
        private Node left;
        private Node right;

        public Node(double value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public BST() {
        rootPengeluaran = null;
        rootPendapatan = null;
    }

    public void insertPengeluaran(double pengeluaran) {
        rootPengeluaran = insertRecursive(rootPengeluaran, pengeluaran);
    }

    public void insertPendapatan(double pendapatan) {
        rootPendapatan = insertRecursive(rootPendapatan, pendapatan);
    }

    private Node insertRecursive(Node currentNode, double value) {
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.value) {
            currentNode.left = insertRecursive(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = insertRecursive(currentNode.right, value);
        }

        return currentNode;
    }

    public void inorderTraversalPengeluaran() {
        inorderTraversal(rootPengeluaran);
    }

    public void inorderTraversalPendapatan() {
        inorderTraversal(rootPendapatan);
    }

    private void inorderTraversal(Node currentNode) {
        if (currentNode != null) {
            inorderTraversal(currentNode.left);
            System.out.println(currentNode.value);
            inorderTraversal(currentNode.right);
        }
    }
}
