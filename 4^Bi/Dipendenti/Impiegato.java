
class Impiegato {

    private String nome;
    private String cognome;
    private String reparto;

    public Impiegato() {
        nome = "";
        cognome = "";
        reparto = "";

    }

    public Impiegato(String nome, String cognome, String reparto){
        this.nome=nome;
        this.cognome=cognome;
        this.reparto=reparto;

    }

    public void setNome(String n) {
        nome = n;
    }

    public void setCognome(String c) {
        cognome = c;
    }

    public void setReparto(String r) {
        reparto = r;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getReparto() {
        return reparto;
    }

    public void stampa() {
        System.out.print("\nNome: (" + nome + ") ");
        System.out.print(" Cognome: (" + cognome + ") ");
        System.out.print(" Reparto: (" + reparto + ")\n");
    }

}
