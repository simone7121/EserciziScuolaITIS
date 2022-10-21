public class Operazioni {

    private double n1;
    private double n2;

    public Operazioni(double n1, double n2) {
            this.n1=n1;
            this.n2=n2;
        }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double somma() {
        return n1 + n2;
    }

    public double sottrazione() {
        return n1 - n2;
    }

    public double prodotto() {
        return n1 * n2;
    }

    public double divisione() {
        return n1 / n2;
    }

    public void stampa() {
        System.out.println("Primo numero: " + n1);
        System.out.println("Secondo numero: " + n2);

    }
}
