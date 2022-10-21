import java.io.Serializable;
import java.util.*;

class Utente implements Serializable{

    protected String emailAcceso;
    protected String passwordAccesso;
    protected Vector <SingleLogin> datiUtente;

    public Utente(String emailAcceso, String passwordAccesso) {
        
        this.emailAcceso = emailAcceso;
        this.passwordAccesso = passwordAccesso;
        datiUtente = new Vector<>();

    }

    public void addSpace(){
        SingleLogin appo = new SingleLogin(" ", " ", " ");
        datiUtente.add(appo);
    }

    public String getEmailAcceso() {
        return emailAcceso;
    }

    public String getPasswordAccesso() {
        return passwordAccesso;
    }
    
    public void addDatiSingleLogin(String email, String password, String sito){
        SingleLogin appo = new SingleLogin(email, password, sito);
        datiUtente.add(appo);
    }

    public Vector <SingleLogin> getDatiSingleLogin(){
        return datiUtente;
    }

    public void modificaDatiSingleLogin(int indexToModify, SingleLogin datiUtenteNuovo){
        
        datiUtente.set(indexToModify, datiUtenteNuovo);

    }

    public void removeDatiSingleLoginAt (int index){
        datiUtente.remove(index);
    }

    public String getDatiUtente(){

        StringBuilder exit = new StringBuilder("‖startUtenza‖" + emailAcceso + "‖" + passwordAccesso + "‖endUtenza‖startDatiUtente");
        SingleLogin appo;

        Iterator <SingleLogin> i = datiUtente.iterator();

        while (i.hasNext()) {

            appo = i.next();

            exit.append(appo.getSingleLoginFromatted());
            
        }

        exit.append("‖endDatiUtente");

        return exit.toString();

    }

}