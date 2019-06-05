package at.bibliothek.web;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;



/**
 *
 * @author Alex-Mi
 *
 */
@Named
@ViewScoped
// TEST: was passeirt wenn wir ViewScoped durch RequestScoped ersetzen?
//@RequestScoped  
public class NewCustomerBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public enum KundeTyp {
        TYP_NATPERS("Nat. Person"), TYP_FIRMA("Firma");

        private String value;

        private KundeTyp(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    private KundeTyp custmerType;
    private Map<String, KundeTyp> custmerTypes;
    private long savedKundeId;

    private String vorname;
    private String nachname;
    private String addresse;
    private Date gebDatum;
    private String steuerNummer;
    private String kundeTyp = Integer.MIN_VALUE + "";

    public  NewCustomerBean() {
        custmerTypes = new HashMap<String, KundeTyp>();
        custmerTypes.put(KundeTyp.TYP_NATPERS.value, KundeTyp.TYP_NATPERS);
        custmerTypes.put(KundeTyp.TYP_FIRMA.value, KundeTyp.TYP_FIRMA);
    }
    
	public void changeCustomerType(){
		System.out.println("Selected CustomerType is: " + custmerType);
	}

    public KundeTyp getCustmerType() {
        return custmerType;
    }

    public void setCustmerType(KundeTyp custmerType) {
        this.custmerType = custmerType;
    }

    public Map<String, KundeTyp> getCustmerTypes() {
        return custmerTypes;
    }

    public void setCustmerTypes(Map<String, KundeTyp> custmerTypes) {
        this.custmerTypes = custmerTypes;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public Date getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(Date date) {
        this.gebDatum = date;
    }

    public String getSteuerNummer() {
        return steuerNummer;
    }

    public void setSteuerNummer(String steuerNummer) {
        this.steuerNummer = steuerNummer;
    }

    public String getKundeTyp() {
        return kundeTyp;
    }

    public void setKundeTyp(String kundenTyp) {
        this.kundeTyp = kundenTyp;
    }

    public String saveNewCustomer() {
    	return "customer_created?faces-redirect=true";
    }
    
    public long getSavedKundeId() {
        return savedKundeId;
    }

    public void setSavedKundeId(long savedKundeId) {
        this.savedKundeId = savedKundeId;
    }
    
   }