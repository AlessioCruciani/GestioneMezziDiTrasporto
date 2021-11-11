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
public class MotoreDiesel extends Motore{
    
    private int potenza;
    private int rpm;
    private int Coppia;
    private float PrezzoMotore;
    
    public MotoreDiesel(int cilindrata, int cilindri, int rpm, int Coppia, String NomeMotore, String CodiceMotore, float prezzomotore){
        super(cilindrata, cilindri, NomeMotore, CodiceMotore, prezzomotore);
        this.Coppia = Coppia;
        this.rpm = rpm;
    }
    
    @Override
    public int getPotenza(){
        potenza = (int)((Coppia*2*3.14*rpm)/60000);
        return potenza;
    }
    @Override
    public boolean isDiesel(){
        return true;
    }
    @Override
    public int getRPM(){
        return rpm;
    }
}