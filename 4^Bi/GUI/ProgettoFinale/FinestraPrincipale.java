import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class FinestraPrincipale extends JFrame implements ActionListener {

    private JLabel testoBenvenuto;
    private JLabel testoEmail;
    private JLabel testoPassword;

    private JButton submitButton;

    private JTextField passwordInput;
    private JTextField emailInput;

    private static Vector<Utente> usersPasswordManager = new Vector<>();
    private static Utente utenteSelezionato;

    public FinestraPrincipale() {

        testoBenvenuto = new JLabel("~|Very Secure Password Manager|~", SwingConstants.CENTER);
        testoBenvenuto.setBounds(180, 50, 250, 30);

        testoEmail = new JLabel("E-Mail", SwingConstants.CENTER);
        testoEmail.setBounds(200, 120, 200, 30);

        emailInput = new JTextField();
        emailInput.setBounds(200, 150, 200, 30);

        testoPassword = new JLabel("Password", SwingConstants.CENTER);
        testoPassword.setBounds(200, 200, 200, 30);

        passwordInput = new JTextField();
        passwordInput.setBounds(200, 230, 200, 30);

        submitButton = new JButton("Accedi");
        submitButton.setBounds(200, 320, 200, 30);

        JPanel pannello = new JPanel();
        pannello.setLayout(null);

        this.setTitle("|Password manager|");

        pannello.add(testoBenvenuto);
        pannello.add(testoEmail);
        pannello.add(emailInput);
        pannello.add(testoPassword);
        pannello.add(passwordInput);
        pannello.add(submitButton);

        submitButton.addActionListener(this);

        this.add(pannello);
        this.pack();

        fileToVector();

    }

    public static void main(String[] args) {

        FinestraPrincipale finestraInserimento = new FinestraPrincipale();

        finestraInserimento.setSize(600, 500);
        finestraInserimento.setLocation(150, 150);

        finestraInserimento.setVisible(true);
        finestraInserimento.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // toFile();

    }

    public void actionPerformed(ActionEvent event) {

        String eventToString = event.getActionCommand();

        if (eventToString.equals("Accedi")) {

            try {
                verificaUtenza(emailInput.getText(), passwordInput.getText());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

    public void verificaUtenza(String email, String password) throws IOException {

        Utente appo = new Utente(null, null);
        int indexAppo = 0;

        boolean emailCorretta = false;
        boolean passwordCorretta = false;
        boolean emailScorretta = false;
        boolean passwordScorretta = false;

        Iterator<Utente> i = usersPasswordManager.iterator();

        while (i.hasNext()) {

            appo = i.next();

            if (email.equals(appo.getEmailAcceso())) {

                emailCorretta = true;
                emailScorretta = false;

                if (password.equals(appo.getPasswordAccesso())) {

                    passwordCorretta = true;
                    passwordScorretta = false;
                    break;

                } else {

                    passwordCorretta = false;
                    passwordScorretta = true;

                }

            } else {

                emailScorretta = true;
                passwordScorretta = true;

            }

        }

        if (emailCorretta && passwordCorretta) {

            JOptionPane.showMessageDialog(null, "Email e Password CORRETTI\nBenvenuto " + emailInput.getText());

            utenteSelezionato = appo;
            appo = FinestraSelezionePass.startSelezionePass(utenteSelezionato);

            usersPasswordManager.remove(indexAppo);
            usersPasswordManager.add(indexAppo, appo);

            toFile();

        } else if (emailCorretta && passwordScorretta) {

            JOptionPane.showMessageDialog(null, "PASSWORD ERRATA");

        } else if (emailScorretta) {

            JOptionPane.showMessageDialog(null, "E-Mail Non Riconosciuta");

        }

        indexAppo++;

    }

    public static void fileToVector() {

        Utente appoUtente = new Utente(null, null);
        String appoString;

        boolean definizioneSingleLogin = false;

        try {

            Scanner reader = new Scanner(new BufferedReader(new FileReader("input.txt")));
            reader.useDelimiter("‖");

            do {

                appoString = reader.next();

                if (appoString.equals("startUtenza")) {

                    appoUtente = new Utente(reader.next(), reader.next());

                } else if (appoString.equals("startDatiUtente")) {

                    definizioneSingleLogin = true;

                    if (appoString.equals("endDatiUtente")) {
                        definizioneSingleLogin = false;
                        break;
                    } else {
                        appoUtente.addDatiSingleLogin(reader.next(), reader.next(), reader.next());
                    }

                } else if (appoString.equals("endDatiUtente") || !definizioneSingleLogin) {
                    usersPasswordManager.add(appoUtente);
                }

            } while (reader.hasNext());

            reader.close(); // Chiudo il file di Input.

        } catch (Exception e) { // Nel caso di errori in una delle operazioni.

            if (e.toString().equals("java.util.NoSuchElementException")) {

                JOptionPane.showMessageDialog(null, "ERRORE DI LETTURA !\nIl file è vuoto.\n" + e, "ERRORE",
                        JOptionPane.ERROR_MESSAGE);

            }

        }

    }

    private static void toFile() throws IOException {

        Utente appo;
        Iterator<Utente> i = usersPasswordManager.iterator();

        File creator = new File("input.txt");

        if (creator.delete()) {
            System.out.println("File eliminato: " + creator.getName());
        } else {
            System.out.println("File non eliminato.");
        }

        if (creator.createNewFile()) {
            System.out.println("File creato: " + creator.getName());
        } else {
            System.out.println("File gia esiste.");
        }

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));

            writer.write("");

            while (i.hasNext()) {

                appo = i.next();

                writer.write(appo.getDatiUtente());

            }

            writer.close();

        } catch (IOException e) { // Nel caso di errori in una delle operazioni.

            JOptionPane.showMessageDialog(null, "ERRORE DI SCRITTURA !" + e, "ERRORE",
                    JOptionPane.ERROR_MESSAGE);

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