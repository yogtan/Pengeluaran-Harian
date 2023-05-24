/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSDNL;

/**
 *
 * @author Ryan
 */
public class Kost {
    String kategori,alamat;
    int id_kost, jumlah_kamar;
    
    Kost(){};

    public Kost(int id_kost,  int jumlah_kamar, String alamat, String kategori) {
        this.kategori = kategori;
        this.alamat = alamat;
        this.id_kost = id_kost;
        this.jumlah_kamar = jumlah_kamar;
    }
    
    

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getId_kost() {
        return id_kost;
    }

    public void setId_kost(int id_kost) {
        this.id_kost = id_kost;
    }

    public int getJumlah_kamar() {
        return jumlah_kamar;
    }

    public void setJumlah_kamar(int jumlah_kamar) {
        this.jumlah_kamar = jumlah_kamar;
    }
    
    public int cari(Object ob, DataKost dk){
        int jumlah = 0;
        for(int i = 0; i < dk.kostList.size(); i++){
            if(((String)ob).equals(dk.kostList.get(i).alamat)){
                jumlah++;
            }
        }
        return jumlah;
    }
    
    
    
}
