
import javax.persistence.*;
 
@Entity(name = "tblQuanLy")
public class User {
	@Id
	public Integer MaVT;
	public String TenVT;
	public Integer SoLuong;
	public String Nhacc;
 
    public Integer getMa() {
        return MaVT;
    }
    public String getTen() {
        return TenVT;
    }
    public Integer getSl() {
        return SoLuong;
    }
    public String getNcc() {
        return Nhacc;
        //------------------------
    }
    public int setMa(int Ma) {
        return MaVT=Ma;
    }
    public String setTen(String Vt) {
        return TenVT=Vt;
    }
    public Integer setSl(int s) {
        return SoLuong=s;
    }
    public String setNcc(String sa) {
        return Nhacc=sa;
    }
    	//-------------------------
    public String toString()
    {
    	return "Ma VT : "+MaVT+ " Ten VT : "+TenVT+" So Luong : "+SoLuong+" Nha cc : "+Nhacc;
    }
}
