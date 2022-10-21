public class Utente {
    
    private String nome;
    private int punteggi;

    public Utente(String nome) {
        this.nome = nome;
    }

    public Utente(String nome, int punteggi) {
        this.nome = nome;
        this.punteggi = punteggi;
    }

    public String getNome() {
        return nome;
    }

    public int getPunteggi() {
        return punteggi;
    }

    public void setPunteggi(int punteggi) {
        this.punteggi = punteggi;
    }

    public String toString(){
        return nome;
    }


}
