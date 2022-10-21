import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class Studenti {

    private String nome;
    private String cognome;
    private double voto;
    private String str;

    public Studenti(String nome, String cognome, double voto) {
        this.nome = nome;
        this.cognome = cognome;
        this.voto = voto;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCognome() {
        return cognome;
    }


    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    public double getVoto() {
        return voto;
    }


    public void setVoto(double voto) {
        this.voto = voto;
    }


    public String toString(){
        
        return "s";
    }

    public String toRiga(){
        str = nome+";"+cognome+";"+voto+"/n";
        return str; 
    }

    public boolean toFile(){
        
        FileWriter out;
        
        try {
            out = new FileWriter("Studente.txt",true);
            out.write(toRiga());
            out.close();
            return true;
        } catch (IOException e) {
            return false;
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