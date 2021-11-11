/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import motori.*;
import auto.*;
import java.util.Optional;

/**
 *
 * @author aless
 */
public class GestioneMezziDiTrasporto {

    public static void main(String[] args) {

        ArrayList<Motore> ListaMotori = new ArrayList<>();
        Motore T2 = new MotoreBenzina(1447, 3, 5000, 245, "T2", "B3154T9", 5000);
        Motore V9X = new MotoreDiesel(2993, 6, 3750, 450, "V9X", "C2569T2", 7000);
        ListaMotori.add(0, T2);
        ListaMotori.add(1, V9X);

        ArrayList<Automobile> ListaAuto = new ArrayList<>();
        //Automobile(String targa, String marca, String modello, String codicemodello, int numerooptional, String nomemotore, float prezzoauto)
        Automobile Volvo = new Automobile("CB12556NR", "Volvo", "XC90", "ABCD001", 0, "T2", 50000);
        Automobile Volvo2 = new Automobile("UT25896PE", "Volvo", "XC60", "JKLM450", 0, "V9X", 60000);
        Automobile Renault = new Automobile("TN25684LP", "Renault", "C700", "EFGH100", 0, "V9X", 35000);
        ListaAuto.add(0, Volvo);
        ListaAuto.add(1, Renault);
        ListaAuto.add(2, Volvo2);

        ArrayList<OptionalAutomobile> ListaOptional = new ArrayList<>();
        OptionalAutomobile AriaCondizionata = new OptionalAutomobile("AR500", "Aria Condizionata", 500);
        OptionalAutomobile Navigatore = new OptionalAutomobile("NV700", "Navigatore Integrato", 1500);
        OptionalAutomobile Sensori = new OptionalAutomobile("SP100", "Sensori di parcheggio", 2000);
        OptionalAutomobile RuotaScorta = new OptionalAutomobile("RS600", "Ruota di Scorta", 700);
        ListaOptional.add(0, AriaCondizionata);
        ListaOptional.add(1, Navigatore);
        ListaOptional.add(2, Sensori);
        ListaOptional.add(3, RuotaScorta);

        char scelta = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(); //riga bianca
            System.out.println("OPERAZIONI DISPONIBILI");
            System.out.println("   [C]rea un nuovo preventivo per un automobile");
            System.out.println("   [U]scita");
            System.out.print("scelta: ");
            scelta = input.next().charAt(0);

            switch (scelta) {
                case 'C':
                    System.out.println("Inserisci la Marca dell'auto di cui si vuole generare un preventivo: ");
                    /*
                    System.out.print("Marche di auto disponibili: ");
                    for(Automobile l : ListaAuto) System.out.print(l.getMarca() + "  ");
                     */
                    String MarcaAutodaCercare = input.next();
                    boolean controllo = false;
                    for (Automobile i : ListaAuto) {
                        if (MarcaAutodaCercare.equals(i.getMarca())) {
                            System.out.println("Marca: " + i.getMarca() + " Modello: " + i.getModello() + " Targa: " + i.getTarga() + " Motore dell'auto: " + i.getNomeMotore() + " Optional: " + i.getNumeroOptional());
                        }
                    }
                    System.out.println("Inserisci il modello dell'auto di cui si vuole generare il preventivo: ");
                    String ModelloAutoDaCercare = input.next();
                    for (Automobile j : ListaAuto) {
                        if (ModelloAutoDaCercare.equals(j.getModello())) {
                            System.out.println("Marca: " + j.getMarca() + " Modello: " + j.getModello() + " Targa: " + j.getTarga() + " Motore dell'auto: " + j.getNomeMotore() + " Optional: " + j.getNumeroOptional());
                            char scelta2 = 0;
                            do {
                                System.out.println(); //riga bianca
                                System.out.println("OPERAZIONI DISPONIBILI");
                                System.out.println("   [V]isualizza le specifiche del motore");
                                System.out.println("   [C]ambia il motore della macchina");
                                System.out.println("   [A]ggiungi un optional alla macchina");
                                System.out.println("   [T]ogli un optional dalla macchina");
                                System.out.println("   [R]iepilogo sulla macchina scelta");
                                System.out.println("   [S]tampa il costo della vettura con le selezioni effettuate");
                                System.out.println("   [U]scita");
                                System.out.print("scelta: ");
                                scelta2 = input.next().charAt(0);

                                switch (scelta2) {
                                    case 'V':
                                        for (Motore k : ListaMotori) {
                                            if (j.getNomeMotore().equals(k.getNomeMotore())) {
                                                System.out.println("Motore:  " + k.getNomeMotore() + "  Codice Motore:  " + k.getCodiceMotore() + "  Cilindri:  " + k.getCilindri() + "  Cilindrata:  " + k.getCilindrata() + "  Potenza:  " + k.getPotenza() + "  Diesel:  " + k.isDiesel());
                                            }
                                        }
                                        break;
                                    case 'C':
                                        System.out.println("LISTA DEI MOTORI DISPONIBILI:  ");
                                        for (Motore k : ListaMotori) {
                                            System.out.println();
                                            System.out.println("MOTORE:  " + k.getNomeMotore());
                                            System.out.println("SPECIFICHE: ");
                                            System.out.println("            - Codice Motore:  " + k.getCodiceMotore());
                                            System.out.println("            - Cilindri:  " + k.getCilindri());
                                            System.out.println("            - Cilindrata:  " + k.getCilindrata());
                                            System.out.println("            - Potenza:  " + k.getPotenza());
                                            System.out.println("            - Diesel:  " + k.isDiesel());
                                        }
                                        System.out.println("Inserisci il nome del motore con il quale si vuole sostituire quello già presente nell'auto: ");
                                        String NomeMotoreSostituto = input.next();

                                        for (Motore k : ListaMotori) {
                                            if (NomeMotoreSostituto.equals(k.getNomeMotore())) {
                                                j.setNomeMotore(NomeMotoreSostituto);
                                                System.out.println();
                                                System.out.println("Marca: " + j.getMarca() + " Modello: " + j.getModello() + " Targa: " + j.getTarga() + " Motore dell'auto: " + j.getNomeMotore() + " Optional: " + j.getNumeroOptional());
                                            } else {
                                                System.out.println("Il motore inserito non è presente nella lista.");
                                            }
                                        }

                                        break;
                                    case 'A':
                                        System.out.println("LISTA DEGLI OPTIONAL DISPONIBILI:  ");
                                        for (OptionalAutomobile z : ListaOptional) {
                                            System.out.println();
                                            System.out.println("Optional:  " + z.getDescrizione());
                                            System.out.println("SPECIFICHE: ");
                                            System.out.println("            - Codice Optional:  " + z.getCodiceOptional());
                                            System.out.println("            - Costo Optional:  " + z.getValoreOptional());
                                            System.out.println("            - Optional Inserito:  " + z.getInserito());
                                        }
                                        System.out.println("Inserisci il codice dell'optional che si vuole inserire nell'auto: ");
                                        String CodiceOptionalInserito = input.next();

                                        for (OptionalAutomobile z : ListaOptional) {
                                            if (CodiceOptionalInserito.equals(z.getCodiceOptional())) {
                                                z.setInserito(true);
                                                System.out.println("Optional inserito con successo!");
                                                j.AggiungiNumeroOptional();
                                            }
                                        }
                                        break;
                                    case 'T':
                                        System.out.println("LISTA DEGLI OPTIONAL DISPONIBILI:  ");
                                        for (OptionalAutomobile z : ListaOptional) {
                                            System.out.println();
                                            System.out.println("Optional:  " + z.getDescrizione());
                                            System.out.println("SPECIFICHE: ");
                                            System.out.println("            - Codice Optional:  " + z.getCodiceOptional());
                                            System.out.println("            - Costo Optional:  " + z.getValoreOptional());
                                            System.out.println("            - Optional Inserito:  " + z.getInserito());
                                        }
                                        System.out.println("Inserisci il codice dell'optional che si vuole rimuovere dall'auto: ");
                                        String CodiceOptionalDaRimuovere = input.next();
                                        
                                        if(j.getNumeroOptional() != 0){
                                        for (OptionalAutomobile z : ListaOptional) {
                                            if (CodiceOptionalDaRimuovere.equals(z.getCodiceOptional())) {
                                                z.setNonInserito(false);
                                                System.out.println("Optional rimosso con successo!");
                                                j.TogliNumeroOptional();
                                            }
                                        }
                                        }
                                        else{
                                            System.out.println("Nessun optional è attualmente inserito nella selezione");
                                        }
                                        break;
                                    case 'R':
                                        System.out.println("Marca: " + j.getMarca() + " Modello: " + j.getModello() + " Targa: " + j.getTarga() + " Motore dell'auto: " + j.getNomeMotore() + " Optional: " + j.getNumeroOptional());
                                        break;
                                    case 'S':
                                        float TotaleCostoMacchina = 0;
                                        TotaleCostoMacchina += j.getPrezzoAuto();
                                        for(Motore k : ListaMotori){
                                            if(j.getNomeMotore().equals(k.getNomeMotore())){
                                                TotaleCostoMacchina+= k.getPrezzoMotore();
                                            }
                                        }
                                        for(OptionalAutomobile z : ListaOptional){
                                            if(z.getInserito()){
                                                TotaleCostoMacchina += z.getValoreOptional();
                                            }
                                        }
                                        
                                        System.out.println("Il costo TOTALE dell'auto con le specifiche selezionate è:  " + TotaleCostoMacchina);
                                        break;

                                    case 'U':
                                        break;
                                    default:
                                        System.out.println("Inserisci solo caratteri consentiti");
                                }

                            } while (scelta2 != 'U');
                        }
                    }

                    break;
                default:
                    System.out.println("Inserisci solo caratteri consentiti");
            }
        } while (scelta != 'U');
    }
}
