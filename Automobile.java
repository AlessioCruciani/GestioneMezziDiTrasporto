/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author aless
 */
public class Automobile {
    private String Targa;
    private String Marca;
    private String Modello;
    private String CodiceModello;
    private int NumeroOptional = 0;
    private String NomeMotore;
    private float PrezzoAuto;
    
    public Automobile(String targa, String marca, String modello, String codicemodello, int numerooptional, String nomemotore, float prezzoauto){
        this.Targa = targa;
        this.Marca = marca;
        this.Modello = modello;
        this.CodiceModello = codicemodello;
        this.NumeroOptional = numerooptional;
        this.PrezzoAuto = prezzoauto;
        this.NomeMotore = nomemotore;
    }
    
    public String getTarga(){
        return Targa;
    }
    public String getMarca(){
        return Marca;
    }
    public String getModello(){
        return Modello;
    }
    public String getCodiceModello(){
        return CodiceModello;
    }
    public String getNomeMotore(){
        return NomeMotore;
    }
    public int getNumeroOptional(){
        return NumeroOptional;
    }
    public float getPrezzoAuto(){
        return PrezzoAuto;
    }
    public void setNomeMotore(String nomemotore){
        this.NomeMotore = nomemotore;
    }
    public void AggiungiNumeroOptional(){
        NumeroOptional += 1;
    }
    public void TogliNumeroOptional(){
        NumeroOptional -= 1;
    }
}
