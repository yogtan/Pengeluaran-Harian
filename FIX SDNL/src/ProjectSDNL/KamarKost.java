package ProjectSDNL;

public class KamarKost implements Comparable{
    
    int no_kost, hargaSewa;
    boolean diSewa;
    Kost kst;
    
    KamarKost(){}

    public KamarKost(int no_kost, int hargaSewa,Kost kst, boolean statusKamar) {
        this.no_kost = no_kost;
        this.diSewa = statusKamar;
        this.hargaSewa = hargaSewa;
        this.kst = kst;
        
    }

    public boolean isStatusKamar() {
        return diSewa;
    }

    public void setDiPinjam(boolean statusKamar) {
        this.diSewa = statusKamar;
    }

    public Kost getKst() {
        return kst;
    }

    public void setKst(Kost kst) {
        this.kst = kst;
    }

    public int getNo_kost() {
        return no_kost;
    }

    public void setNo_kost(int no_kost) {
        this.no_kost = no_kost;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    
    @Override
    public int compareTo(Object cari){
        if(((Comparable)cari).compareTo(this.getNo_kost()) == 0){
            return 0;
        }else if(((Comparable)cari).compareTo(this.getNo_kost()) > 0){
            return 1;
        }else{
            return -1;
        }
    }
    
    public int cari(Object ob, DataKost dk){
        int jumlah = 0;
        for(int i = 0; i < dk.kamarList.size(); i++){
            if(((int)ob) == dk.kamarList.get(i).no_kost){
                jumlah++;
            }
        }
        return jumlah;
    }
    
    
}
