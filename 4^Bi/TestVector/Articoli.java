public class Articoli {
    private String cod;
    private String descrizione;
    private double prezzo;

    public Articoli(String cod,String desc,double pre){
        this.cod=cod;
        descrizione=desc;
        prezzo=pre;
    }

    public String getCod(){
        return cod;
    }

    public String getDescrizione(){
        return descrizione;
    }
    public double getPrezzo(){
        return prezzo;
    }

    public String toString(){
        String s="";
        s+="Il codice e' "+cod+" la descrizione e' "+descrizione+" il prezzo e' "+prezzo;
        return s;
    }
}