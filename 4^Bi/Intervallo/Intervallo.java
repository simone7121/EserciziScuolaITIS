public class Intervallo {

    private double numeroSx;
    private double numeroDx;

    private String intervalloSx;
    private String intervalloDx;
        
    public Intervallo(double numeroSx, double numeroDx, String intervalloSx, String intervalloDx) {
        this.numeroSx = numeroSx;
        this.numeroDx = numeroDx;
        this.intervalloSx = intervalloSx;
        this.intervalloDx = intervalloDx;
    }

    public double getNumeroDx() {
        return numeroDx;
    }

    public double getNumeroSx() {
        return numeroSx;
    }

    public String getIntervalloDx() {
        return intervalloDx;
    }
    public String getIntervalloSx() {
        return intervalloSx;
    }

    public Intervallo unisci(Intervallo daUnire) {

        double finalSx;
        double finalDx;

        String finalInterSx;
        String finalInterDx;

        if (numeroDx < daUnire.numeroSx || daUnire.numeroDx < numeroSx) {
            return null;
        }

        if (numeroDx > daUnire.numeroDx) {

            if (numeroSx > daUnire.numeroSx) {

                finalSx = daUnire.numeroSx;
                finalDx = numeroDx;

                finalInterSx = daUnire.getIntervalloSx();
                finalInterDx = intervalloDx;

                return new Intervallo(finalSx,finalDx,finalInterSx,finalInterDx);

            } else if (daUnire.numeroSx > numeroSx) {

                finalSx = numeroSx;
                finalDx = numeroDx;

                finalInterSx = intervalloSx;
                finalInterDx = intervalloDx;

                return new Intervallo(finalSx,finalDx,finalInterSx,finalInterDx);

            }

        }

        if (daUnire.numeroDx > numeroDx) {

            if (numeroSx > daUnire.numeroSx) {

                finalSx = daUnire.numeroSx;
                finalDx = daUnire.numeroDx;

                finalInterSx = daUnire.intervalloSx;
                finalInterDx = daUnire.intervalloDx;

                return new Intervallo(finalSx,finalDx,finalInterSx,finalInterDx);
            
            } else if (daUnire.numeroSx > numeroSx) {

                finalSx = numeroSx;
                finalDx = daUnire.numeroDx;

                finalInterSx = this.intervalloSx;
                finalInterDx = daUnire.intervalloDx;

                return new Intervallo(finalSx,finalDx,finalInterSx,finalInterDx);

            }

        } else if (numeroSx == daUnire.numeroSx && numeroDx == daUnire.numeroDx) {
            
            finalSx = numeroSx;
            finalDx = numeroDx;

            if (intervalloSx.equalsIgnoreCase("cs") || daUnire.intervalloSx.equalsIgnoreCase("cs")){
                finalInterSx = "cs";
            } else {
                finalInterSx = "as";
            }

            if (this.intervalloDx.equalsIgnoreCase("cd") || daUnire.intervalloDx.equalsIgnoreCase("cd")) {
                finalInterDx = "cd";
            } else {
                finalInterDx = "ad";
            }
            
            return new Intervallo(finalSx,finalDx,finalInterSx,finalInterDx);

        } else if (numeroSx < daUnire.numeroSx && numeroDx > daUnire.numeroDx) {
            
            finalSx = numeroSx;
            finalDx = numeroDx;

            finalInterSx = intervalloSx;
            finalInterDx = intervalloDx;

            return new Intervallo(finalSx,finalDx,finalInterSx,finalInterDx);

        } else if (daUnire.numeroSx < numeroSx && daUnire.numeroDx > numeroDx) {

            finalSx = daUnire.numeroSx;
            finalDx = daUnire.numeroDx;

            finalInterSx = daUnire.intervalloSx;
            finalInterDx = daUnire.intervalloDx;


            return new Intervallo(finalSx,finalDx,finalInterSx,finalInterDx);
        }

        return null;
        
    }

    public boolean contiene(double numeroCont) {
        
        if (intervalloSx.equalsIgnoreCase("cs") && intervalloDx.equalsIgnoreCase("cd") && numeroCont >= numeroSx && numeroCont <= numeroDx) {
            return true;
        } else if (intervalloSx.equalsIgnoreCase("cs") && numeroCont >= numeroSx && numeroCont < numeroDx) {
            return true;
        } else if (intervalloDx.equalsIgnoreCase("cd") && numeroCont > numeroSx && numeroCont <= numeroDx) {
            return true;
        } else if (numeroCont > numeroSx && numeroCont < numeroDx) {
            return true;
        } else {
            return false;
        }
        
    }

    public String toString() {

        String intervalloDxf = "";
        String intervalloSxf = "";

        if (intervalloSx.equalsIgnoreCase("as")) {
            intervalloSxf = "(";
        } else if (intervalloSx.equalsIgnoreCase("cs")){
            intervalloSxf = "[";
        }
        
        if (intervalloDx.equalsIgnoreCase("ad")) {
            intervalloDxf = ")";
        } else if (intervalloDx.equalsIgnoreCase("cd")){
            intervalloDxf = "]";
        }
        
        return intervalloSxf + numeroSx + " , " + numeroDx + intervalloDxf;
        
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
