import java.math.*;

public class Punto {
    private double coordX;
    private double coordY;

    public Punto(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public double distanzaDa(Punto p) {
        double distX = this.coordX - p.coordX;
        double distY = this.coordY - p.coordY;
        double dist = Math.sqrt(distX * distX + distY * distY);
        return dist;
    }

    public Punto puntoTraslato(double dx, double dy) {
        return new Punto(this.coordX + dx, this.coordY + dy);
    }

    public boolean equals(Punto p) {
        return (this.coordX == p.coordX && this.coordY == p.coordY);
    }

    public String toString(){
        String des = "\n("+this.coordX+","+this.coordY+")";
        return des;
        }
     public static double distanzaTra(Punto p1, Punto p2){
        double distX = p1.coordX - p2.coordX;
        double distY = p1.coordY - p2.coordY;
        double dist = Math.sqrt(distX * distX + distY * distY);
        return dist;

     }
}