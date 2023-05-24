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
public class Pendapatan {

    private int pendapatan;
    private String tanggal;
    private String waktu;
    private String catatan;

    public Pendapatan(int pendapatan, String tanggal, String waktu, String catatan) {
        this.pendapatan = pendapatan;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.catatan = catatan;
    }

    public int getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(int pendapatan) {
        this.pendapatan = pendapatan;
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
