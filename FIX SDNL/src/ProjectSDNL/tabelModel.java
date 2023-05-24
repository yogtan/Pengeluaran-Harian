package ProjectSDNL;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class tabelModel extends AbstractTableModel {

    String namaKolom[];
    String jenisKel;
    DataKost dk;
    ArrayList<Menyewa> arr = new ArrayList<>();
    ArrayList<KamarKost> kamarKosong = new ArrayList<>();

    public tabelModel(String[] namaKolom, DataKost dk, String jenisKel) {
        this.namaKolom = namaKolom;
        this.dk = dk;
        this.jenisKel = jenisKel;
        if(jenisKel != null){
            masukkanDat(jenisKel);
        }
            
    }

    @Override
    public int getRowCount() {
        if(jenisKel == null){
            return dk.sewa.size();
        }else{
            return arr.size();
        }
            
    }

    @Override
    public int getColumnCount() {
        return namaKolom.length;
    }

    public void masukkanDat(String jenis) {
        if (jenis.equals("L")) {
            for (int i = 0; i < dk.sewa.size(); i++) {
                if (dk.sewa.get(i).jeniskel.equals("L")) {
                    arr.add(dk.sewa.get(i));
                }
            }
        } else if (jenis.equals("P")) {
            for (int i = 0; i < dk.sewa.size(); i++) {
                if (dk.sewa.get(i).jeniskel.equals("P")) {
                    arr.add(dk.sewa.get(i));
                }
            }
        } else if(jenis.equals("KamarKosong")){
            for(int i = 0; i < dk.kamarList.size(); i++){
                if(!dk.kamarList.get(i).diSewa){
                    kamarKosong.add(dk.kamarList.get(i));
                }
            }
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (jenisKel == null) {
            Menyewa sewa = dk.sewa.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return sewa.nokost;
                case 1:
                    return sewa.nama;
                case 2:
                    return sewa.jeniskel;
                case 3:
                    return sewa.lamaSewa;
            }
        }else if(jenisKel.equals("P")||jenisKel.equals("L")){
            switch (columnIndex) {
                case 0:
                    return arr.get(rowIndex).nokost;
                case 1:
                    return arr.get(rowIndex).nama;
                case 2:
                    return arr.get(rowIndex).jeniskel;
                case 3:
                    return arr.get(rowIndex).lamaSewa;
            }
        }else if(jenisKel.equals("Kosong")){
            switch(columnIndex){
                case 0:
                    return kamarKosong.get(rowIndex).no_kost;
                case 1:
                    return kamarKosong.get(rowIndex).kst.kategori;
                case 2:
                    return kamarKosong.get(rowIndex).kst.alamat;
                case 3:
                    return kamarKosong.get(rowIndex).hargaSewa;
            }
        }
        return null;
    }

    @Override
    public String getColumnName(int col) {
        return namaKolom[col];
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
