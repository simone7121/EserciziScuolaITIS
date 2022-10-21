import java.io.*;

public class Pagella {
    private int voti [] [];
    private int numMaterie;
    private String materia[];

    // Costruttore 

    public Pagella (int nvoti){

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        this.nvoti=nvoti;
        voti = new int[nvoti][2];
        materia = new String[nvoti];
        for(int i=0; i<nvoti; i++){
            System.out.print("Inserisci la "+(i+1)+" materia: ");
            materia[i]=tastiera.readLine();
        }
    }

    public void aggiungiVoto(int quadrimestre, String disciplina){
        quadrimestre--;
        int i = 0, voto;
        while(!materia[i].equals(disciplina) && i<nvoti)i++;

        if(i < nvoti){
            System.out.print("Insericsi il voto di" +materia[i]+": ");
            do{
                voto = tastiera.readLine();
            }while(voto < 1 || voto > 10);
            voti[i][quadrimestre]=voto;

        }else{
            System.out.print("Materia non trovata");
            
        }
    }
}
