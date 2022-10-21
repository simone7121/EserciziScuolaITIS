public class TipoCapoAbbigliamento {
    
    protected String marca;
    protected String modello;
    protected float costo;

    public TipoCapoAbbigliamento(String marca, String modello, float costo) {

        this.marca = marca;
        this.modello = modello;
        this.costo = costo;

    }
    
    public void getCosto() {

        System.out.println(costo);

    }

    public void modificaCosto(float costo){

        this.costo = costo;

    }

    public float applicaSconto(int percent){

        float scontato = 0.00f;
        scontato = costo -((costo * percent)/100);
        return scontato;

    }

}
