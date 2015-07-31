
package tr.gov.ptt.musteriprj.bean;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import tr.gov.ptt.musteriprj.dao.GirisDAO;
import tr.gov.ptt.musteriprj.dto.Giris;

@ManagedBean
@RequestScoped

public class GirisBean {
    
    private Giris giris;

    public Giris getGiris() {
        return giris;
    }

    public void setGiris(Giris giris) {
        this.giris = giris;
    }

    public GirisBean() {
        giris= new Giris();
    }
    public String girisKontrol()
    {
        try {
            boolean sonuc = GirisDAO.giriseYetkilimi(giris);
            if(sonuc)
            {
                return "musteriListele.xhtml?faces-redirect=true";
            }
            else
            {
               return "giris.xhtml?faces-redirect=true";
            }
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
           return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
           return null;
        }
    
    }
}
