/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.musteriprj.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.gov.ptt.musteriprj.dao.MusteriDAO;
import tr.gov.ptt.musteriprj.dto.Musteri;


public class MusteriDAOTest {
    public static void testMusteriListesiGetir()
    {
        try {
            List<Musteri> liste= MusteriDAO.musteriListesiGetir();
            for (Musteri musteri : liste) 
            {
                System.out.println(musteri.getNo()+  " " +musteri.getAd()+" "+musteri.getSoyad());    
            }
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        testMusteriListesiGetir();
        
    }
}
