class Studente {
    private String nome, cognome;
    private int matricola;
    private static int ultimaMatricola = 0;

    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        Studente.ultimaMatricola++;
        this.matricola = Studente.ultimaMatricola;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public int getMatricola() {
        return this.matricola;
    }

    public String toString() {
        String s =  "|Nome = " + this.getNome() + 
                    "\t|Cognome = " + this.getCognome() + 
                    "\t|Matricola = "+ this.getMatricola() + 
                    "\t|";
                    

        return s;
    }

    public static int getProssimaMatricola() {
        return Studente.ultimaMatricola + 1;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setCognome(String n) {
        this.cognome = n;
    }

}