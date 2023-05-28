package ProjectFIX;

public class DataPengeluaran implements Comparable {

    private String Tanggal;
    private String Waktu;
    private String Catatan;
    private String Pengeluaran;

    public DataPengeluaran(String Pengeluaran) {
        this.Pengeluaran = Pengeluaran;
    }

    public DataPengeluaran(String Tanggal, String Waktu, String Catatan) {
        this.Tanggal = Tanggal;
        this.Waktu = Waktu;
        this.Catatan = Catatan;

    }

    public DataPengeluaran(String Tanggal, String Waktu, String Catatan, String Pengeluaran) {

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

    public String getPengeluaran() {
        return Pengeluaran;
    }

    public void setPengeluaran(String FPengeluaran) {
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
