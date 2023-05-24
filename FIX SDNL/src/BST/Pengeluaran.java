/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BST;

import ProjectSDNL.*;

/**
 *
 * @author ASUS
 */
public class Pengeluaran {

    private int pengeluaran;
    private String tanggal;
    private String waktu;
    private String catatan;

    public Pengeluaran(int pengeluaran, String tanggal, String waktu, String catatan) {
        this.pengeluaran = pengeluaran;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.catatan = catatan;
    }

    public int getPengeluaran() {
        return pengeluaran;
    }

    public void setPengeluaran(int pengeluaran) {
        this.pengeluaran = pengeluaran;
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

}
