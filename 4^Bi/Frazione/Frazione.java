class Frazione {
    // attributi mascherati
    private int numeratore;

    private int denominatore;

    // costruttore
    // imposta solo valori positivi
    public Frazione(int num, int den) {
            if (num > 0) {
                numeratore = num;
            }else{
                numeratore=1;
            }
        if (den > 0) {
            denominatore = den;
        }else{
            denominatore=1;

        }
    }

    // metodo mascherato
    private int calcolaMCD(int a, int b) {
        int temp, resto;
        // ordina i due valori
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        resto = a % b;
        while (resto != 0) {
            a = b;
            b = resto;
            resto = a % b;
        }
        return b;
    }

    // metodo di interfaccia
    public boolean semplifica() {
        int mcd = calcolaMCD(numeratore, denominatore);
        if (mcd != 1) {
            numeratore = numeratore / mcd;
            denominatore = denominatore / mcd;
            return true;
        }
        return false;
    }

    public String getTipo(){
        if(numeratore>denominatore){
            return "propria";
        }else if(numeratore<denominatore){
            return "impropria";
        }else{
            return "apparente";
        }

    }
    // metodo di interfaccia
    public void mostra() {
        System.out.println(numeratore);
        System.out.println("------------");
        System.out.println(denominatore);
    }
}