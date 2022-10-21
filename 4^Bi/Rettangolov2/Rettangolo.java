// VERSIONE: 2.0

class Rettangolo {

    private float base;
    private float altezza;

    public Rettangolo() {
        base = 2f;
        altezza = 1f;
    }

    public Rettangolo(float b, float h) {
        base = b;
        altezza = h;
    }

    public void setBase(float b) {
        base = b;
    }

    public void setAltezza(float h) {
        altezza = h;
    }

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public float area() {
        return base * altezza;
    }

    public float perimetro() {
        return 2 * (base + altezza);
    }

    public float diagonale() { // Costruttore
        return (float) Math.sqrt((base * base) + (altezza * altezza));
    }

    public boolean equiEsteso(Rettangolo r) {
        return (this.area() == r.area());
    }

    public Rettangolo copia() {
        return new Rettangolo(base, altezza);
    }

    public Rettangolo ingrandisci(int x, int y) {
        return new Rettangolo((base * x), (altezza * y));
    }

    public String toString(){
        String str = ("Base = " + base +"\nAltezza = " + altezza);
        return str;
    }
    

}
