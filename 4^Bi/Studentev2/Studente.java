class Studente {

    private String nome;
    private String cognome;
    private int punteggio;
    private int totQuestionari;

////////////////////////////////

    public Studente(String nome, String cognome, int totQuestionari) {
        this.nome = nome;
        this.cognome = cognome;
        this.totQuestionari = totQuestionari;
    }

    public Studente(String nome, String cognome, int totQuestionari, int punteggio) {
        this.nome = nome;
        this.cognome = cognome;
        this.punteggio = punteggio;
        this.totQuestionari = totQuestionari;
    }

////////////////////////////////

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public int getPunteggio() {
        return this.punteggio;
    }

    public int getTotQuestionari() {
        return totQuestionari;
    }

////////////////////////////////    

    public void setNome(String n) {
        this.nome = n;
    }

    public void setCognome(String n) {
        this.cognome = n;
    }

    public void setPunteggio(int n) {
        this.punteggio = n;
    }

////////////////////////////////

    public void addPunt(int valore) {
        punteggio += valore;
        totQuestionari++;
    }

    public float media() {
        return (float) punteggio/totQuestionari;        
    }

////////////////////////////////

    public String toString() {
        return  "\n| Nome = " + nome + 
                    "\t| Cognome = " + cognome + 
                    "\t| Punteggio = "+ punteggio + 
                    "\t| Totale Questionari = "+ totQuestionari + 
                    "\t| ";
    }

////////////////////////////////

}
/*
 * ____/\\\\\\\\\\\__________/\\\\\\\\\\\\___________________
 * ____/\\\/////////\\\_______\/\\\////////\\\_______________
 * ____\//\\\______\///________\/\\\______\//\\\_____________
 * ______\////\\\_______________\/\\\_______\/\\\____________
 * __________\////\\\____________\/\\\_______\/\\\___________
 * ______________\////\\\_________\/\\\_______\/\\\__________
 * _______/\\\______\//\\\________\/\\\_______/\\\___________
 * ________\///\\\\\\\\\\\/____/\\\_\/\\\\\\\\\\\\/____/\\\__
 * ___________\///////////_____\///__\////////////_____\///__
 */