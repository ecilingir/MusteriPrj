
package tr.gov.ptt.musteriprj.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public class JSFUtil {
    
    public static void mesajEkle(String p_ozet, String p_detay)
    {
    
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage (FacesMessage.SEVERITY_INFO,p_ozet,
                p_detay));
        FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
    }
    
    public static void hataEkle(String p_ozet, String p_detay)
    {
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage (FacesMessage.SEVERITY_INFO,p_ozet,
                p_detay));
        FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
    }
}
