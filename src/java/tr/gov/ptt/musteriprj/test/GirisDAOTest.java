
package tr.gov.ptt.musteriprj.test;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.gov.ptt.musteriprj.dao.GirisDAO;
import tr.gov.ptt.musteriprj.dto.Giris;


public class GirisDAOTest {
    
    public static void testGiriseYetkilimi()
    {
     try 
       {
            
            Giris giris = new Giris();
            giris.setKullanici("esra");
            giris.setSifre("1234");
            boolean sonuc= GirisDAO.giriseYetkilimi(giris);
            if(sonuc)
                System.out.println("Giriş Başarılı");
            else
                System.out.println("Kullanıcı Adı Yada Şifre Yalnış");
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
    
    public static void main(String[] args) {
        
        testGiriseYetkilimi();
        
    }
    
}
