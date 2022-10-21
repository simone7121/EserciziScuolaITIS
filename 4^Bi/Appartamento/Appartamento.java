public class Appartamento {

    private String nomeProprietario;
    private int superficie, piano, numAbitanti;


    public Appartamento(String nomeProprietario, int superficie, int piano, int numAbitanti) {
        this.nomeProprietario = nomeProprietario;
        this.superficie = superficie;
        this.piano = piano;
        this.numAbitanti = numAbitanti;
    }
        
    public int getSuperficie() {
        return superficie;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }
    
    public int getNumAbitanti() {
        return numAbitanti;
    }

    public int getPiano() {
        return piano;
    }
    
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String toString () {
        
        return "Proprietario: " + nomeProprietario + "\nSuperficie: " +superficie+ "\nPiano: " +piano+ "\nNumero abitanti: " + numAbitanti; 
    
    }
    
    
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