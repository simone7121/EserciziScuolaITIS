public class MatitaConGommino extends Matita {

    protected int cancellatureRimaste;

    public MatitaConGommino(int lunghezza, String durezza, String colore, int cancellatureRimaste) {
        super(lunghezza+1, durezza, colore);
        this.cancellatureRimaste = cancellatureRimaste;
    }

    public MatitaConGommino(String durezza, String colore, int cancellatureRimaste) {
        super(19, durezza, colore);
        this.cancellatureRimaste = cancellatureRimaste;
    }

    public int getCancellatureRimaste() {
        return cancellatureRimaste;
    }

    public void setCancellatureRimaste(int cancellatureRimaste) {
        this.cancellatureRimaste = cancellatureRimaste;
    }

    public String cancella(String frase) {

        if (cancellatureRimaste != 0) {
            
            if (frase.length() == 0){
                System.out.println("Cosa cancello, il nulla ??");
            } else {
                cancellatureRimaste--;
                frase = frase.substring(0, frase.length() - 1);   
            }

        } else {

            System.out.println("Gomma finita, non puoi piu' cancellare nulla !!");
            
        }

        return frase;

    }

    @Override // Overriding del tosSring della superclasse matita
    public String toString() {
        
        return "[("+lunghezza+") Cm  ("+durezza+") ("+colore+") ("+cancellatureRimaste+") Cancellature Rimaste (Caratteri rimanenti: "+caratteririmanenti+")"+"]";
        
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