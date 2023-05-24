package BST;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class tabelModel extends AbstractTableModel {

    String namaKolom[];
    String jenisKel;
    Data dph;
    ArrayList<Pengeluaran> pengeluaranList;
    ArrayList<Pendapatan> pendapatanList;

    public tabelModel(String[] namaKolom, Data dk, String jenisKel) {
        this.namaKolom = namaKolom;
        this.dph = dk;
        this.jenisKel = jenisKel;
        if (jenisKel != null) {
            masukkanData(jenisKel);
        }
    }

    @Override
    public int getRowCount() {
        
            return pengeluaranList.size() + pendapatanList.size();
     
    }

    @Override
    public int getColumnCount() {
        return namaKolom.length;
    }

    public void masukkanData(String jenis) {
    if (jenis.equals("Hapus")) {
        pengeluaranList = new ArrayList<>();
        pendapatanList = new ArrayList<>();
    } else if (jenis.equals("Tampil")) {
        if (jenisKel == null) {
            pengeluaranList = dph.pengeluaranList;
            pendapatanList = dph.pendapatanList;
        } else if (jenisKel.equals("KamarKosong")) {
            pengeluaranList = new ArrayList<>();
            pendapatanList = new ArrayList<>();
        }
    }
}


    @Override
    
public Object getValueAt(int rowIndex, int columnIndex) {
    if (rowIndex < pengeluaranList.size()) {
        Pengeluaran pengeluaran = pengeluaranList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pengeluaran.getTanggal();
            case 1:
                return pengeluaran.getWaktu();
            case 2:
                return pengeluaran.getCatatan();
            case 3:
                return pengeluaran.getCatatan();
        }
    } else if (rowIndex < pengeluaranList.size() + pendapatanList.size()) {
        int pendapatanIndex = rowIndex - pengeluaranList.size();
        Pendapatan pendapatan = pendapatanList.get(pendapatanIndex);
        switch (columnIndex) {
            case 0:
                return pendapatan.getTanggal();
            case 1:
                return pendapatan.getWaktu();
            case 2:
                return pendapatan.getCatatan();
            case 3:
                return pendapatan.getCatatan();
        }
    }
    return null;
}

    @Override
    public String getColumnName(int col) {
        return namaKolom[col];
    }

    @Override
    public Class<?> getColumnClass(int col) {
        if (getRowCount() > 0) {
            return getValueAt(0, col).getClass();
        }
        return Object.class;
    }

}
