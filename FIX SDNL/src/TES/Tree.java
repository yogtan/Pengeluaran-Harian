package TES;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    TreeNode root;

    public Tree() {
        this.root = null;
    }

    public Tree(TreeNode rt) {
        this.root = rt;
        rt.setLeftNode(null);
        rt.setRightNode(null);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void insertNode(DataPengeluaran data) {
        TreeNode baru = new TreeNode(data);
        if (root == null) {
            root = baru;
        } else {
            TreeNode bantu = root;
            while (true) {
                if (((Comparable) bantu.getData()).compareTo(data) <= 0) {
                    if (bantu.getRightNode() == null) {
                        bantu.setRightNode(baru);
                        baru.setParent(bantu);
//                        System.out.println("Berhasil Menginputkan Data " + baru.getData());
                        return;
                    } else {
                        bantu = bantu.getRightNode();
                    }

                } else {
                    if (bantu.getLeftNode() == null) {
                        bantu.setLeftNode(baru);
                        baru.setParent(bantu);
//                        System.out.println("Berhasil Menginputkan Data " + baru.getData());
                        return;
                    } else {
                        bantu = bantu.getLeftNode();
                    }
                }
            }
        }
    }

    public TreeNode search(int search) {
       TreeNode bantu = root;
        if (root == null) {
            return null;
        } else {
            while (bantu != null) {
                if (search == bantu.getData().getPengeluaran()) {
                    return bantu;
                } else {
                    if (search > bantu.getData().getPengeluaran()) {
                        bantu = bantu.getRightNode();
                    } else {
                        bantu = bantu.getLeftNode();
                    }
                }
            }
        }
        return null;
    }

    public boolean delete(int data) {
        TreeNode node = search(data);
        TreeNode parent = node.getParent();
//        TreeNode current = root;
        boolean cek = false;
        if (node != null) {
            if (node.getLeftNode() == null && node.getRightNode() == null) {
                if (parent.getLeftNode() == node) {
                    parent.setLeftNode(null);
                    node.setParent(null);
                } else {
                    parent.setRightNode(null);
                    node.setParent(null);
                }
                cek = true;
            } else if (node.getLeftNode() == null || node.getRightNode() == null) {
                if (parent == null) {
                    if (node.getLeftNode() == null) {
                        setRoot(node.getRightNode());
                        getRoot().setLeftNode(node.getLeftNode());
                    } else {
                        setRoot(node.getLeftNode());
                        getRoot().setRightNode(node.getRightNode());
                    }
                    getRoot().setParent(null);
                } else if (parent.getLeftNode() == node) {
                    if (node.getLeftNode() == null) {
                        parent.setLeftNode(node.getRightNode());
                        node.getRightNode().setParent(parent);
                        node.setRightNode(null);
                        node.setParent(null);
                    } else {
                        parent.setLeftNode(node.getLeftNode());
                        node.getLeftNode().setParent(parent);
                        node.setLeftNode(null);
                        node.setParent(null);
                    }
                    cek = true;
                } else {
                    if (parent.getRightNode() == node) {
                        if (node.getRightNode() == null) {
                            parent.setRightNode(node.getLeftNode());
                            node.getLeftNode().setParent(parent);
                            node.setRightNode(null);
                            node.setParent(null);
                        } else {
                            parent.setRightNode(node.getRightNode());
                            node.getRightNode().setParent(parent);
                            node.setLeftNode(null);
                            node.setParent(null);
                        }
                        cek = true;
                    }
                }

            } else {
//                TreeNode parent = node.getParent();
                TreeNode sucessor = getSucessor(node);
                DataPengeluaran temp;
                if (sucessor != null) {// cek Sucessor
                    if (sucessor.getRightNode() == null) {
                        if (sucessor.getParent() != node) {
                            sucessor.getParent().setLeftNode(null);
                        } else {
                            node.setRightNode(null);
                        }
                    } else {
                        if (sucessor.getParent() != node) {
                            sucessor.getParent().setLeftNode(sucessor.getRightNode());
                            sucessor.getRightNode().setParent(sucessor.getParent());
                        }
                    }
                    temp = sucessor.getData();
                    sucessor = node;
                    sucessor.setData(temp);
                    return true;
                } else {
                    return false;
                }
            }

        }
        return cek;

    }

   public TreeNode getSucessor(TreeNode data) {
        TreeNode bantu = data.getRightNode();
        while (bantu.getLeftNode() != null) {
            bantu = bantu.getLeftNode();
        }
        return bantu;
    }
    
    public TreeNode getPredesessor(TreeNode data){
        TreeNode bantu = data.getLeftNode();
        while(bantu.getRightNode() != null){
            bantu = bantu.getRightNode();
        }
        return bantu;
    }

    public int size() {
        return countNodes(root);
    }

    private int countNodes(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int count = 1;
        count += countNodes(node.getLeftNode());
        count += countNodes(node.getRightNode());
        return count;
    }

    public List<TreeNode> traverseInOrder() {
        List<TreeNode> nodeList = new ArrayList<>();
        traverseInOrder(root, nodeList);
        return nodeList;
    }

    private void traverseInOrder(TreeNode node, List<TreeNode> nodeList) {
        if (node == null) {
            return;
        }

        traverseInOrder(node.getLeftNode(), nodeList);
        nodeList.add(node);
        traverseInOrder(node.getRightNode(), nodeList);
    }
}
