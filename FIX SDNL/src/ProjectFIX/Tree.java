package ProjectFIX;

import java.util.ArrayList;

public class Tree {

    private TreeNode root;
    public ArrayList<DataPengeluaran> simpDat;
    public Tree(){
        simpDat = new ArrayList();
    
    };

    public Tree(TreeNode root) {
        this.root = root;
        simpDat = new ArrayList();
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
                if (bantu.getData().getPengeluaran() < data.getPengeluaran()) {
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

    public TreeNode search(DataPengeluaran search) {
        TreeNode cari = root;
        while (cari != null) {
            if (search.getPengeluaran() == cari.getData().getPengeluaran()) {
                return cari;
            } else if (search.getPengeluaran() > cari.getData().getPengeluaran()) {
                cari = cari.getRightNode();

            } else {
                cari = cari.getLeftNode();
            }
        }
        return null;
    }


    public boolean delete012(DataPengeluaran data) {
        TreeNode node = search(data);
        TreeNode parent = node.getParent();
//        TreeNode current = root;
        boolean cek = false;
        if (node != root) {
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
                }
                else if (parent.getLeftNode() == node) {
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

            }
            

        } else {
                TreeNode sucessor = getSucessor(root);
                TreeNode predesessor = getPredesessor(root);
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
                }else if(predesessor != null){
                    if(predesessor.getLeftNode() == null){
                        if(predesessor.getParent()!=node){
                            predesessor.getParent().setRightNode(null);
                        }else{
                            node.setRightNode(null);
                        }
                    }else{
                        if(predesessor.getParent() != node){
                            predesessor.getParent().setRightNode(predesessor.getLeftNode());
                            predesessor.getLeftNode().setParent(predesessor.getParent());
                        }
                    }
                    temp = predesessor.getData();
                    predesessor = node;
                    predesessor.setData(temp);
                    return true;
                }else {
                    root = null;
                    return false;
                }
        }
        return cek;

    }
    
    public void inorderTraversal() {
        inorderHelper(root);
    }
    
    private void inorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.getLeftNode());
        simpDat.add(node.getData());
        inorderHelper(node.getRightNode());
    }

    public TreeNode getSucessor(TreeNode data) {
        TreeNode bantu = data.getRightNode();
        if(bantu != null){
            while (bantu.getLeftNode() != null) {
                bantu = bantu.getLeftNode();
            }
        }
        return bantu;
    }
            
    
    public TreeNode getPredesessor(TreeNode data){
        TreeNode bantu = data.getLeftNode();
        if(bantu != null){
            while(bantu.getRightNode() != null){
                bantu = bantu.getRightNode();
            }
        }
        return bantu;
    }
            
    
    
    
}