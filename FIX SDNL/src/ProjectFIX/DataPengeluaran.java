package ProjectFIX;

public class DataPengeluaran implements Comparable {

    private String NP;
    private String Tanggal;
    private String Waktu;
    private String Catatan;
    private int Pengeluaran;

    public DataPengeluaran(int Pengeluaran) {
        this.Pengeluaran = Pengeluaran;
    }

    public DataPengeluaran(String NP) {
        this.NP = NP;
    }


    public DataPengeluaran(String Tanggal, String Waktu, String Catatan, int Pengeluaran) {
        this.Tanggal = Tanggal;
        this.Waktu = Waktu;
        this.Catatan = Catatan;
        this.Pengeluaran = Pengeluaran;
    }

    public DataPengeluaran(String NP, String Tanggal, String Waktu, String Catatan, int Pengeluaran) {
        this.NP = NP;
        this.Tanggal = Tanggal;
        this.Waktu = Waktu;
        this.Catatan = Catatan;
        this.Pengeluaran = Pengeluaran;
    }

  


    public String getNP() {
        return NP;
    }

    public void setNP(String NP) {
        this.NP = NP;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }

    public String getWaktu() {
        return Waktu;
    }

    public void setWaktu(String Waktu) {
        this.Waktu = Waktu;
    }

    public String getCatatan() {
        return Catatan;
    }

    public void setCatatan(String Catatan) {
        this.Catatan = Catatan;
    }

    public int getPengeluaran() {
        return Pengeluaran;
    }

    public void setPengeluaran(int Pengeluaran) {
        this.Pengeluaran = Pengeluaran;
    }

    @Override
    public int compareTo(Object o) {
       return NP.compareTo(((DataPengeluaran)o).getNP());

    }
}
