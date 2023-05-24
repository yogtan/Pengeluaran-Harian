    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSDNL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DataKost {
     ArrayList<KamarKost> kamarList = new ArrayList<>();
     ArrayList<Penyewa> penyewaList = new ArrayList<>();
     ArrayList<Kost> kostList = new ArrayList<>();
     ArrayList<Menyewa> sewa = new ArrayList<>();
 
    public void insertSewa(Menyewa sew){
         try {
            sewa.add(sew);
        } catch (Exception ex) {
            Logger.getLogger(DataKost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void insertKamar(KamarKost data) {
            try {
                kamarList.add(data);
            } catch (Exception ex) {
                Logger.getLogger(DataKost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertPenyewa(Penyewa data) {
            try {
                penyewaList.add(data);
            } catch (Exception ex) {
                Logger.getLogger(DataKost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertKost(Kost data) {
            try {
                kostList.add(data);
            } catch (Exception ex) {
                Logger.getLogger(DataKost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int haveValues(String jenisKel){
        int values = 1;
        for(int i = 0; i < sewa.size(); i++){
            if(sewa.get(i).jeniskel.equals(jenisKel)){
                values++;
            }
        }
        return values;
    }
    
}
