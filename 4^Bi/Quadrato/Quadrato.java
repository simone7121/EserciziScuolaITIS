class Quadrato {

    private float lato;

    public Quadrato() {
        lato = 0f;
    }

    public Quadrato(float lato) {
        this.lato = lato;
    }

    public void setlato(float lato) {
        this.lato = lato;
    }

    public float getlato() {
        return lato;
    }

    public float area() {
        return lato * lato;
    }

    public float perimetro() {
        return 4 * lato;
    }

    public float diagonale() { // Costruttore
        return (float) Math.sqrt((lato*lato)*2);
    }

    public void stampa() {
        System.out.println("Lato = " + getlato());
    }
}