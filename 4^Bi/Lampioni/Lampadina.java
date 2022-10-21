public class Lampadina {

    protected String tipo;
    protected String tecnologia;
    protected int voltaggio;
    protected int wattora;
    protected int lifespan;

    private boolean rottura = false;

    // Costruttori

    public Lampadina(String tipo, String tecnologia, int voltaggio, int wattora, int lifespan) {
        this.tipo = tipo;
        this.tecnologia = tecnologia;
        this.voltaggio = voltaggio;
        this.wattora = wattora;
        this.lifespan = lifespan;
    }

    // Getter e Setter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getVoltaggio() {
        return voltaggio;
    }

    public void setVoltaggio(int voltaggio) {
        this.voltaggio = voltaggio;
    }

    public int getWattora() {
        return wattora;
    }

    public void setWattora(int wattora) {
        this.wattora = wattora;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    // Metodi Ausiliari

    public boolean uso(int ore) {

        if (ore < lifespan && !rottura) {

            lifespan -= ore;
            return true;

        } else if (ore > lifespan && !rottura) {

            lifespan = 0;
            rottura = true;
            return false;

        } else if (rottura) {

            return false;

        } else {

            return true;

        }

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