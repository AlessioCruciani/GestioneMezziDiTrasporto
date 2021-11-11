/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motori;

/**
 *
 * @author aless
 */
public class MotoreBenzina extends Motore{
    
    private int potenza;
    private int rpm;
    private int Coppia;
    private float PrezzoMotore;
    
    public MotoreBenzina(int cilindrata, int cilindri, int rpm, int Coppia, String NomeMotore, String CodiceMotore, float prezzomotore){
        super(cilindrata, cilindri, NomeMotore, CodiceMotore, prezzomotore);
        this.Coppia = Coppia;
        this.rpm = rpm;
    }
    
    @Override
    public int getPotenza(){
        potenza = (int)(Coppia*2*3.14*rpm);
        return potenza;
    }
    @Override
    public boolean isDiesel(){
        return false;
    }
    @Override
    public int getRPM(){
        return rpm;
    }
}
