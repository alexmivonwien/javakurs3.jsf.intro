package jsf.intro.contact;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;

/**
 * HTML5 Support in JSF 2.2, (for example: make <h:inputText> accept only digits (pure HTML))
 *  
 * @see http://hantsy.blogspot.com/2013/08/jsf-22-html5-support.html
 * 
 * 
 * 
 * @author Alex-Mi
 *
 */
@ManagedBean
// No scope provided - defaults to @RequestScope 
public class ContactBean {
	
	private String strasse;
	private String email;
	private short hausNummer;
	private String ort;
	private int plz;
	
	
	private Map<Integer, String> plzOrtMap = new HashMap<>();
	
	public ContactBean() {
		plzOrtMap.put(1010, "Wien,Innere Stadt");
		plzOrtMap.put(1020, "Wien,Leopoldstadt");
		plzOrtMap.put(1030, "Wien,Landstra�e");
		plzOrtMap.put(1040, "Wien,Wieden");
		plzOrtMap.put(1050, "Wien,Margareten");
		plzOrtMap.put(1060, "Wien,Mariahilf");
		plzOrtMap.put(1070, "Wien,Neubau");
		plzOrtMap.put(1080, "Wien,Josefstadt");
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public short getHausNummer() {
		return hausNummer;
	}
	public void setHausNummer(short hausNummer) {
		this.hausNummer = hausNummer;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
		if (plzOrtMap.get(plz)!=null) {
			this.setOrt(plzOrtMap.get(plz));
		}
	}
	
	public String goToNextView() {
		return "contactrequest-recieved";
	}
	
}
