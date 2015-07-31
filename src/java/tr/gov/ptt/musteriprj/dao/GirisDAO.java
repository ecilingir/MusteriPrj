
package tr.gov.ptt.musteriprj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tr.gov.ptt.musteriprj.dto.Giris;
import tr.gov.ptt.musteriprj.util.VTBaglanti;


public class GirisDAO {
    
    public static boolean giriseYetkilimi(Giris p_giris) throws ClassNotFoundException, SQLException
    {
        String vtSifre=null;
        Connection conn =VTBaglanti.baglantiGetir();
        PreparedStatement ps=conn.prepareStatement("Select sifre From giris where kullanici=?");
        ps.setString(1, p_giris.getKullanici());
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
           vtSifre=rs.getString("sifre");
        }
        rs.close();
        ps.close();
        VTBaglanti.BaglantiKapat(conn);
        if( vtSifre!=null && vtSifre.equals(p_giris.getSifre()))
        {
            return true;
        }
        else
        {
           return false;
        }
    }

}
