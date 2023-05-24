/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSDNL;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Data {

    private ArrayList<Transaksi> transaksiList;

    public Data() {
        transaksiList = new ArrayList<>();
    }

    public void tambahTransaksi(Transaksi transaksi) {
        transaksiList.add(transaksi);
    }

    public void hapusTransaksi(Transaksi transaksi) {
        transaksiList.remove(transaksi);
    }

    public ArrayList<Transaksi> getTransaksiList() {
        return transaksiList;
    }
}
