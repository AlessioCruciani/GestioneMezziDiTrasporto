package motori;

public abstract class Motore {

    private int cilindrata = 0;
    private int cilindri;
    private String NomeMotore;
    private String CodiceMotore;
    private float PrezzoMotore;
    
    public Motore(int c, int nc, String nm, String cm, float prezzomotore) {
        this.cilindrata = c;
        this.cilindri = nc;
        this.NomeMotore = nm;
        this.CodiceMotore = cm;
        this.PrezzoMotore = prezzomotore;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int getCilindri() {
        return cilindri;
    }

    public String getNomeMotore() {
        return NomeMotore;
    }
    
    public String getCodiceMotore(){
        return CodiceMotore;
    }
    
    public float getPrezzoMotore(){
        return PrezzoMotore;
    }

    public abstract int getPotenza();

    public abstract boolean isDiesel();

    public abstract int getRPM();
}
