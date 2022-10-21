public class Garage {
    
    private int maxposti;
    private int postioccupati;
    private Veicolo veicoli[];
    private String nome;

    public Garage(int maxposti, String nome) {
        this.maxposti = maxposti;
        this.nome = nome;
        veicoli = new Veicolo[maxposti];
        postioccupati = 0;
    }

    public Garage(int maxposti) {
        this.maxposti = maxposti;
        veicoli = new Veicolo[maxposti];
        postioccupati = 0;
    }

    // Getters e Setters

    public int getMaxposti() {
        return maxposti;
    }

    public int getPostioccupati() {
        return postioccupati;
    }

    public String getNome() {
        return nome;
    }

    public void setMaxposti(int maxposti) {
        this.maxposti = maxposti;
    }

    public void setPostioccupati(int postioccupati) {
        this.postioccupati = postioccupati;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodi Ausiliari

    public boolean addVeicolo(Veicolo veicolo) {

        int primoPostoDisponibile = postoDisponibile();

        if (primoPostoDisponibile != -1) {
            veicoli[primoPostoDisponibile] = veicolo;
            postioccupati++;
            return true;
        } else {
            return false;
        }

    }

    public boolean removeVeicolo(int index) {

        if (postioccupati == 0) {

            return false;

        } else {

            veicoli[index] = null;
            postioccupati--;

            return true;
        }

    }

    private int postoDisponibile() {

        for (int i = 0; i < veicoli.length; i++) {

            if (veicoli[i] == null) {
                return i;
            }
            
        }

        return -1;
    }

    public void stampaStatoGarage(){

        System.out.println("| Stato Garage |");
        System.out.println("\t| Posti liberi : " + (maxposti-postioccupati));
        System.out.println("\t| Posti occupati : " + postioccupati);

    }

    
    public void stampaVeicoli(){

        System.out.println("| VEICOLI PRESENTI NEL GARAGE |");

        for (int i = 0; i < maxposti ; i++) {

            if (veicoli[i] == null) {

                System.out.println("("+(i+1)+")  | POSTO VUOTO |");
                
            } else {

                System.out.println("("+(i+1)+")  "+veicoli[i]);

            }
  
        }

    }

}