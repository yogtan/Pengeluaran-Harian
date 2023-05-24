/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSDNL;

/**
 *
 * @author ASUS
 */
public class Transaksi {
    private String tanggal;
    private String waktu;
    private String catatan;

    public Transaksi(String tanggal, String waktu, String catatan) {
        this.tanggal = tanggal;
        this.waktu = waktu;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
    


    @Override
    public String toString() {
        return "Tanggal: " + tanggal;
    }
}