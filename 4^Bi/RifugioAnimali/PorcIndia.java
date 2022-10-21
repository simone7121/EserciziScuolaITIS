public class PorcIndia extends Animale {

    // Costruttori

    public PorcIndia() {
        super(4);
        tipoAnimale = "Porcellino D'India";
    }

    public PorcIndia(String nome, double peso, int eta) {
        super(4);
        tipoAnimale = "Porcellino D'India";
        this.nome=nome;
        this.peso=peso;
        this.eta=eta;
        cibo = "Verdura";

    }

    // Metodi Ausiliari

    @Override
    public String faVerso() {

        return "Oink";

    }

    public String mangia() {

        quantAcqua = 0.250;

        if (eta <= 5) {
            quantCibo = 0.100;
        } else {
            quantCibo = 0.070;
        }

        return "Il Porcellino D'India " + nome + " deve mangiare " + quantCibo + "Kg di cibo e " + quantAcqua
                + "ml di acqua.";

    }

}