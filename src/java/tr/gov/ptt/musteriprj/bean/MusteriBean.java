
package tr.gov.ptt.musteriprj.bean;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import tr.gov.ptt.musteriprj.dao.MusteriDAO;
import tr.gov.ptt.musteriprj.dto.Musteri;
import tr.gov.ptt.musteriprj.util.JSFUtil;

@ManagedBean
@SessionScoped

public class MusteriBean {
    
    private List<Musteri> musteriListesi;

    public List<Musteri> getMusteriListesi() {
        return musteriListesi;
    }
    @PostConstruct
    public void veriTabanındanGetir()
    {
        try {
            musteriListesi= MusteriDAO.musteriListesiGetir();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JSFUtil.hataEkle("Driver Bulunamadı Hatası:", ex.getMessage());
            //return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JSFUtil.hataEkle("SQL Hatası:", ex.getMessage());
           // return null;
        }
    }
}
