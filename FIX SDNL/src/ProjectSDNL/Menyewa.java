package ProjectSDNL;

public class Menyewa {
    int nokost,  lamaSewa;
    String jeniskel, nik, nama, alamat;

    public Menyewa(int nokost, int lamaSewa, String jeniskel, String nik, String nama, String alamat) {
        this.nokost = nokost;
        this.lamaSewa = lamaSewa;
        this.jeniskel = jeniskel;
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }
}
