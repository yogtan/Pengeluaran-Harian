package BST;

import ProjectSDNL.DataKost;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Data {
//ArrayList<Penyewa> penyewaList = new ArrayList<>();
     ArrayList<Pengeluaran> pengeluaranList= new ArrayList<>();
    ArrayList<Pendapatan> pendapatanList= new ArrayList<>();
    private BST bstPengeluaran;
    private BST bstPendapatan;

    public Data() {
        pengeluaranList = new ArrayList<>();
        pendapatanList = new ArrayList<>();
        bstPengeluaran = new BST();
        bstPendapatan = new BST();
    }

    public void tambahPengeluaran(Pengeluaran data) {
        try {
             bstPengeluaran.insertPengeluaran(data.getPengeluaran());
            pengeluaranList.add(data);
        } catch (Exception ex) {
            Logger.getLogger(DataKost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tambahPendapatan(Pendapatan data) {
        try {
             bstPendapatan.insertPendapatan(data.getPendapatan());
            pendapatanList.add(data);
        } catch (Exception ex) {
            Logger.getLogger(DataKost.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

// Metode lain untuk manipulasi data pada array list dan tree
public void tampilkanPengeluaran() {
        for (Pengeluaran pengeluaran : pengeluaranList) {
            System.out.println(pengeluaran);
        }
    }

    public void tampilkanPendapatan() {
        for (Pendapatan pendapatan : pendapatanList) {
            System.out.println(pendapatan);
        }
    }

//    public void tampilkanPengeluaranUrut() {
//        bstPengeluaran.inorderTraversal();
//    }
//
//    public void tampilkanPendapatanUrut() {
//        bstPendapatan.inorderTraversal();
//    }
}
