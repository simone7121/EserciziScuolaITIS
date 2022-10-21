
public class Animale {

    protected String versoAnimale;
    protected int eta;
    protected int zampe;
    protected String cibo;
    protected double quantAcqua = 0.000f;
    protected double quantCibo = 0.000f;
    protected double peso;
    protected String nome;
    protected String tipoAnimale;

    
    // Costruttori

    public Animale(){
        versoAnimale = "L'Animale non emana versi";
        tipoAnimale = "Animale";
    }

    public Animale(int zampe) {
        versoAnimale = "L'Animale non emana versi";
        this.zampe = zampe;
        tipoAnimale = "Animale";
    }

    public Animale(String nome, double peso, int eta, String cibo,int zampe) {

        this.peso = peso;
        this.nome=nome;
        this.eta=eta;
        this.cibo = cibo;
        this.zampe = zampe;
        versoAnimale = "L'Animale non emana versi";
        tipoAnimale = "Animale";

    }

    // Getter e Setter

    public String getVersoAnimale() {
        return versoAnimale;
    }

    public void setVersoAnimale(String versoAnimale) {
        this.versoAnimale = versoAnimale;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getZampe() {
        return zampe;
    }

    public void setZampe(int zampe) {
        this.zampe = zampe;
    }

    public String getCibo() {
        return cibo;
    }

    public void setCibo(String cibo) {
        this.cibo = cibo;
    }

    public double getQuantAcqua() {
        return quantAcqua;
    }

    public void setQuantAcqua(double quantAcqua) {
        this.quantAcqua = quantAcqua;
    }

    public double getQuantCibo() {
        return quantCibo;
    }

    public void setQuantCibo(double quantCibo) {
        this.quantCibo = quantCibo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoAnimale() {
        return tipoAnimale;
    }

    public void setTipoAnimale(String tipoAnimale) {
        this.tipoAnimale = tipoAnimale;
    }

    // Metodi Ausiliari

    public String bevi() {

        return "L'animale " + nome + " deve bere " + quantAcqua + "ml di acqua.";

    }

    public String faVerso() {
        return versoAnimale;
    }

    public void status() {

        System.out.print("\n"+tipoAnimale+"\n\tNome: " +nome+"\n\tEta': "+eta+"\n\tZampe: " + zampe+"\n\tPeso:" +peso);
        
    }

}
