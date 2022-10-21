import java.util.Calendar;

public class Cane extends Animale {

    Calendar scadVacc;
    Calendar oggi = Calendar.getInstance();

    protected int microChip;
    protected String taglia;
    protected double quantRiso;

    // Costruttori

    public Cane() {
        super(4);
        microChip = 0;
        taglia = "S";
        scadVacc = Calendar.getInstance();
        tipoAnimale = "Cane";
        quantRiso = 0.000f;
        cibo = "Carne";
    }

    public Cane(int microChip, String taglia, double peso) {
        super(4);
        this.microChip = microChip;
        this.taglia = taglia.toUpperCase();
        this.peso = peso;
        scadVacc = Calendar.getInstance();
        tipoAnimale = "Cane";
        quantRiso = 0.000f;
        cibo = "Carne";
    }

    public Cane(String nome, double peso, int eta, int microChip, String taglia, Calendar scadVacc) {
        super(4);
        this.microChip = microChip;
        this.taglia = taglia.toUpperCase();
        this.peso = peso;
        this.scadVacc = scadVacc;
        this.nome=nome;
        this.eta=eta;
        tipoAnimale = "Cane";
        quantRiso = 0.000f;
        cibo = "Carne";

    }

    // Getter e Setter

    public Calendar getScadVacc() {
        return scadVacc;
    }

    public void setScadVacc(Calendar scadVacc) {
        this.scadVacc = scadVacc;
    }

    public int getMicroChip() {
        return microChip;
    }

    public void setMicroChip(int microChip) {
        this.microChip = microChip;
    }

    public String getTaglia() {
        return taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    // Metodi Ausiliari

    @Override
    public String faVerso() {

        return "Bau Bau";

    }

    public String mangia() {

        quantAcqua = 0.200 * peso; 

        switch (taglia) {
            case "S":
                quantRiso = 0.010;
                break;
            case "M":
                quantRiso = 0.025;
                break;
            case "L":
                quantRiso = 0.040;
                break;
            case "XL":
                quantRiso = 0.065;
                break;
            default:
                break;
        }

        quantCibo = (0.012 * peso);

        if (oggi.get(Calendar.DAY_OF_WEEK) == 2) {

            return "Il cane " + nome + " deve mangiare " + quantCibo + "Kg di cibo ("+cibo+"), " + quantRiso + "Kg di RISO (PIU' UN OSSO) e " + quantAcqua + "ml di acqua.";

        } else {

            return "Il cane " + nome + " deve mangiare " + quantCibo + "Kg di cibo ("+cibo+"), " + quantRiso + "Kg di RISO e " + quantAcqua + "ml di acqua.";

        }

    }

    @Override
    public void status() {
        super.status();
        System.out.print("\n\tTaglia: " +taglia+"\n\tMicrochip: "+microChip);
        
    }
}
