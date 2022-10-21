import java.util.Calendar;

public class Gatto extends Animale {

    protected Calendar scadVacc;

    // Costruttori

    public Gatto() {
        super(4);
        scadVacc = Calendar.getInstance();
        tipoAnimale = "Gatto";
    }

    public Gatto(String nome, double peso, int eta, Calendar scadVacc) {
        super(4);
        this.peso = peso;
        this.scadVacc = scadVacc;
        this.nome=nome;
        this.eta=eta;
        tipoAnimale = "Gatto";
        cibo = "Carne";
    }

    // Getter e Setter

    public Calendar getScadVacc() {
        return scadVacc;
    }

    public void setScadVacc(Calendar scadVacc) {
        this.scadVacc = scadVacc;
    }

    // Metodi Ausiliari

    @Override
    public String faVerso() {

        return "Miaoooo";

    }

    public String mangia() {

        quantAcqua = 0.500;
        quantCibo = 0.040 * peso;

        return "Il gatto " + nome + " deve mangiare " + quantCibo + "Kg di cibo e " + quantAcqua + "ml di acqua.";

    }

}
