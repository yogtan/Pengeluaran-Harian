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
public class Penyewa implements Comparable{
    String nama, no_hp, jenis_kel;
    String NIK;
    Penyewa(){};
    
    public Penyewa(String NIK, String nama, String noHp, String jenis_kel) {
        this.NIK = NIK;
        this.nama = nama;
        this.no_hp = noHp;
        this.jenis_kel = jenis_kel;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getJenis_kel() {
        return jenis_kel;
    }

    public void setJenis_kel(String jenis_kel) {
        this.jenis_kel = jenis_kel;
    }
    
    public int cari(Object ob, DataKost dk){
        int jumlah = 0;
        for(int i = 0; i < dk.penyewaList.size(); i++){
            if(((String)ob).equals(dk.penyewaList.get(i).NIK)){
                jumlah++;
            }
        }
        return jumlah;
    }
    
    @Override
    public int compareTo(Object cari){
        if(((Comparable)cari).compareTo(this.NIK) == 0){
            return 0;
        }else if(((Comparable)cari).compareTo(this.NIK) > 0){
            return 1;
        }else{
            return -1;
        }
    }
    
    
}
