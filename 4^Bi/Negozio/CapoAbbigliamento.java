public class CapoAbbigliamento extends TipoCapoAbbigliamento {

    protected String taglia;
    protected int quantitaAcquistata;
    protected int quantitaDisponibile;

    public CapoAbbigliamento(String marca, String modello, float costo, String taglia, int quantitaDisponibile) {

        super(marca, modello, costo);
        this.taglia = taglia;
        this.quantitaDisponibile = quantitaDisponibile;
        this.quantitaAcquistata = 0;

    }

    public boolean venduto(int capiVend) {

        if (capiVend > quantitaDisponibile) {

            return false;

        } else {

            quantitaDisponibile -= capiVend;
            quantitaAcquistata += capiVend;
            return true;

        }

    }

    public String getTaglia() {
        return taglia;
    }

    public double getCosto(boolean dummy) {
        return costo;
    }

    public void getDettagli() {

        System.out.println(
                "Taglia: " + taglia + "  Quantità acquistata: " + quantitaAcquistata + "  Quantità Disponibile: "
                        + quantitaDisponibile + "  Marca: " + marca + "  Modello: " + modello + "  Costo: " + costo);

    }

}
