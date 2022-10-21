// Classe Base Utenze

public class Utenze {

    private String nome;
    private String citta;
    private String tipoCliente;
    private float importo = 0.00f;

    // Costruttori

    public Utenze(String nome, String citta, String tipoCliente, float importo) {
        this.setNome(nome);
        this.setCitta(citta);
        this.setTipoCliente(tipoCliente);
        this.setImporto(importo);
    }

    // Getter e Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public float getImporto() {
        return importo;
    }

    public void setImporto(float importo) {
        this.importo = importo;
    }

}
