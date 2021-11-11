package auto;

/**
 *
 * @author aless
 */
public class OptionalAutomobile {
    private String CodiceOptional;
    private String Descrizione;
    private float ValoreOptional;
    private boolean Inserito;
    
    public OptionalAutomobile(String codiceoptional, String descrizione, float valoreoptional){
        this.CodiceOptional = codiceoptional;
        this.Descrizione = descrizione;
        this.ValoreOptional = valoreoptional;
        this.Inserito = false;
    }
    
    public String getCodiceOptional(){
        return CodiceOptional;
    }
    public String getDescrizione(){
        return Descrizione;
    }
    public float getValoreOptional(){
        return ValoreOptional;
    }
    public boolean getInserito(){
        return Inserito;
    }
    public void setInserito(boolean inserito){
        this.Inserito = inserito;
    }
    public void setNonInserito(boolean inserito){
        this.Inserito = inserito;
    }
}
