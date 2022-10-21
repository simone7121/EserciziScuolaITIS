
public class passwordManagerStart {
    public static void main(String[] args) {

        Utente utenteSelezionato;

        utenteSelezionato = FinestraPrincipale.main();

        System.out.println("Ho finito ! " + utenteSelezionato.toString());

        FinestraSelezionePass.main(utenteSelezionato);

        

    }
}
