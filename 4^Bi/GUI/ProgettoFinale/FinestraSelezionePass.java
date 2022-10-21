import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class FinestraSelezionePass extends JFrame implements ActionListener {

    private JLabel testoCentrale;
    private JLabel testoEmail;
    private JLabel testoPassword;

    private JButton addButton;
    private JButton modifyButton;

    private JComboBox listaValori;

    private JTextField outMail;
    private JTextField outPassword;

    private static Utente test;

    public FinestraSelezionePass(Utente utente) {

        testoCentrale = new JLabel("Seleziona Utenza", SwingConstants.LEFT);
        testoCentrale.setBounds(30, 10, 530, 119);

        listaValori = new JComboBox<>(singleLoginToObject(utente.getDatiSingleLogin()));
        listaValori.setBounds(30, 80, 200, 30);
        listaValori.setActionCommand("listaValori");

        addButton = new JButton("Aggiungi UTENZA NUOVA");
        addButton.setBounds(280, 140, 200, 30);
        addButton.setActionCommand("addButton");

        testoEmail = new JLabel("E-Mail", SwingConstants.LEFT);
        testoEmail.setBounds(30, 77, 200, 110);

        outMail = new JTextField();
        outMail.setBounds(30, 140, 200, 30);

        modifyButton = new JButton("Modifica UTENZA ESISTENTE");
        modifyButton.setBounds(280, 185, 200, 30);
        modifyButton.setActionCommand("modifyButton");

        testoPassword = new JLabel("Password", SwingConstants.LEFT);
        testoPassword.setBounds(30, 122, 200, 110);

        outPassword = new JTextField();
        outPassword.setBounds(30, 185, 200, 30);

        JPanel pannello = new JPanel();
        pannello.setLayout(null);

        this.setTitle("|Password manager|");

        pannello.add(testoCentrale);
        pannello.add(listaValori);
        pannello.add(addButton);
        pannello.add(testoEmail);
        pannello.add(outMail);
        pannello.add(testoPassword);
        pannello.add(outPassword);
        pannello.add(modifyButton);

        addButton.addActionListener(this);
        listaValori.addActionListener(this);
        modifyButton.addActionListener(this);

        this.add(pannello);
        this.pack();

    }

    public static void main(String[] args) {

        test = new Utente("simonedanna7@gmail.com", "ciao");

        test.addDatiSingleLogin("simonedanna7@gmail.com", "calippo123", "www.google.it");

        FinestraSelezionePass finestraInserimento = new FinestraSelezionePass(test);

        finestraInserimento.setSize(600, 300);
        finestraInserimento.setLocation(150, 150);

        finestraInserimento.setVisible(true);
        finestraInserimento.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    public static Utente startSelezionePass(Utente utente) {

        test = utente;

        FinestraSelezionePass finestraInserimento = new FinestraSelezionePass(test);

        finestraInserimento.setSize(600, 300);
        finestraInserimento.setLocation(150, 150);

        finestraInserimento.setVisible(true);
        finestraInserimento.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        
        //FIX SCRITTURA
        finestraInserimento.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); 
                JOptionPane.showConfirmDialog(null,"Vuoi uscire ?"); 
            }

        });

        if () {
            
        }

        return exit();
  
    }


    public void actionPerformed(ActionEvent event) {

        String eventToString = event.getActionCommand();

        if (eventToString.equals("addButton")) {

            System.out.println("addButton Heared !");

            addSingleLogin();

        } else if (eventToString.equals("modifyButton")) {

            System.out.println("modifyButton Heared !");

            modifySingleLogin();

        } else if (eventToString.equals("listaValori")) {

            System.out.println("listaValori Heared !");

            Vector<SingleLogin> appo = test.getDatiSingleLogin();
            outMail.setText(appo.get(listaValori.getSelectedIndex()).getEmail());
            outPassword.setText(appo.get(listaValori.getSelectedIndex()).getPassword());

        } else {

            System.out.println("Something Heared !" + eventToString);

        }

    }

    public void addSingleLogin() {

        String email;
        String password;
        String sito;

        sito = JOptionPane.showInputDialog(null, "Inserisci Sito Web Riferimento", "Inseriemnto nuova utenza",
                JOptionPane.INFORMATION_MESSAGE);
        email = JOptionPane.showInputDialog(null, "Inserisci E-Mail", "Inseriemnto nuova utenza",
                JOptionPane.INFORMATION_MESSAGE);
        password = JOptionPane.showInputDialog(null, "Inserisci Password", "Inseriemnto nuova utenza",
                JOptionPane.INFORMATION_MESSAGE);

        if (JOptionPane.showConfirmDialog(null, "I DATI SONO CORRETTI ?\n\nSito Web : " + sito + "\nE-Mail: " + email
                + "\nPassword:" + password) == 0) {
            test.addDatiSingleLogin(email, password, sito);
            listaValori.addItem(sito);
        }

    }

    public void modifySingleLogin() {

        int indexToModify = listaValori.getSelectedIndex();
        Vector<SingleLogin> appoVectSingleLogin = test.getDatiSingleLogin();
        SingleLogin appoToModify = appoVectSingleLogin.get(listaValori.getSelectedIndex());

        Object[] possibleValues = { "", "Sito", "Password", "E-Mail", "ELIMINA" };

        String email = appoToModify.getEmail();
        String sito = appoToModify.getSito();
        String password = appoToModify.getPassword();

        String input;

        if (!(email.isBlank() && password.isBlank())) {

            if (JOptionPane.showConfirmDialog(null, "Utenza da modificare Corretta ? \n\nSito Web : " + sito
                    + "\nE-Mail: " + email) == 0) {

                Object selectionInputRaw = JOptionPane.showInputDialog(null, "Scegli", "Scelta Modifica",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues, possibleValues[0]);

                if (selectionInputRaw != null) {
                    input = selectionInputRaw.toString();
                } else {
                    input = null;
                    return;
                }

                if (input.equals("Sito")) {

                    sito = JOptionPane.showInputDialog(null, "Inserisci NUOVO Sito Web Riferimento", "Modifica utenza",
                            JOptionPane.INFORMATION_MESSAGE);

                } else if (input.equals("Password")) {

                    password = JOptionPane.showInputDialog(null, "Inserisci NUOVA Password", "Modifica utenza",
                            JOptionPane.INFORMATION_MESSAGE);

                } else if (input.equals("E-Mail")) {

                    email = JOptionPane.showInputDialog(null, "Inserisci NUOVA E-Mail", "Modifica utenza",
                            JOptionPane.INFORMATION_MESSAGE);

                } else if (input.equals("ELIMINA") && JOptionPane.showConfirmDialog(null, "Confermi ? ") == 0) {

                    listaValori.removeItemAt(indexToModify);
                    test.removeDatiSingleLoginAt(indexToModify);
                    return;

                }

            }

        }

        appoToModify = new SingleLogin(email, password, sito);

        test.modificaDatiSingleLogin(indexToModify, appoToModify);
        listaValori.removeItemAt(indexToModify);
        listaValori.insertItemAt(sito, indexToModify);

    }

    public Object[] singleLoginToObject(Vector<SingleLogin> datiUtente) {

        Object[] possibleValues = new Object[datiUtente.size()];
        SingleLogin appo;

        for (int i = 0; i < possibleValues.length; i++) {
            appo = datiUtente.get(i);
            possibleValues[i] = appo.getSito();
        }

        return possibleValues;

    }
    
    public static Utente exit(){
        System.out.println("Before Return utente !");
        return test;    
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