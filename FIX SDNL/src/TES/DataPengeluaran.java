package TES;

public class DataPengeluaran implements Comparable {
    private String Tanggal;
    private String Waktu;
    private String Catatan;
    private int Pengeluaran;

    public DataPengeluaran(int Pengeluaran) {
        this.Pengeluaran = Pengeluaran;
    }
    public DataPengeluaran(String Tanggal, String Waktu, String Catatan) {
        this.Tanggal = Tanggal;
        this.Waktu = Waktu;
        this.Catatan = Catatan;
 
    }
    public DataPengeluaran(String Tanggal, String Waktu, String Catatan, int Pengeluaran) {
        this.Tanggal = Tanggal;
        this.Waktu = Waktu;
        this.Catatan = Catatan;
        this.Pengeluaran = Pengeluaran;
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
        try {
            return this.Pengeluaran.compareTo(((DataPengeluaran) o).Pengeluaran);
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Not supported Comparation.");
        }
     }

    
}
