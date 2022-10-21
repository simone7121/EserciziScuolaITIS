/**
 * Automobile
 */
public class Automobile {

    private String nomeAuto;
    private char status;
    private int velocita;
    private String unitaDiMisura;

    private static final int QUANTOFRENA = 10;
    private static final int QUANTOACCELLERA = 5;
    
    public Automobile(String nomeAuto, String unitaDiMisura) {
        this.nomeAuto = nomeAuto;
        this.unitaDiMisura = unitaDiMisura;
        this.velocita = 50;

    }
    
    public String getNomeAuto() {
        return nomeAuto;
    }
    
    public char getStatus() {
        return status;
    }

    public int getVelocita() {
        return velocita;
    }

    public void accelerare(){
        velocita+=QUANTOACCELLERA;
    }

    public void frena(){

        if(velocita>QUANTOFRENA){

            velocita-=QUANTOFRENA;

        }

    }

    public String toString(){
        
        return "La velocita' e' : " + velocita + unitaDiMisura;

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