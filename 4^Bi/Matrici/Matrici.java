/*

Algoritmo:  Lette da tastiera 2 matrici rettangolari, creare la matrice somma e farne il relativo output.

Programmatore: Simone D'Anna
Data: 08/10/2021

*/

import java.io.*;

class Matrici{
	public static void main (String [] args){

        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        int numeroColonne=0;
        int numeroRighe=0;

        String msgErrore = "ERRORE RIPROVA";

        do {

            System.out.print("Inserire dimensione COLONNE: ");

            try {	

                numeroColonne=Integer.parseInt(in.readLine());

            } catch (Exception e) {

                System.err.println(msgErrore);                               
                return;

            }

        } while (numeroColonne<=0);

        System.out.println(" ");
        
        do{

            System.out.print("Inserire dimensione RIGHE: ");

            try{

                numeroRighe=Integer.parseInt(in.readLine());

            } catch (Exception e) {

                System.err.println(msgErrore);                               
                return;

            }

        } while (numeroRighe<=numeroColonne);

        int a [][] = new int [numeroColonne] [numeroRighe];
        int b [][] = new int [numeroColonne] [numeroRighe];
        int somma [][] = new int [numeroColonne] [numeroRighe];
        
        System.out.println( "\n----------( MATRICE 1 )----------" );

        for(int i=0;i<a.length;i++){

            for(int j=0;j<a[0].length;j++){

                try {

                    System.out.print( "Inserire Valore di [" + i + "] [" + j + "] : " );

                    a[i][j]=Integer.parseInt(in.readLine());

                } catch (Exception e) {

                    System.err.println(msgErrore);                               
                    return;

                }

            }
        
            System.out.println( " " );

        }

        System.out.println( "----------( MATRICE 2 )----------" );

        for(int i=0;i<b.length;i++){

            for(int j=0;j<b[0].length;j++){	

                try{

                    System.out.print( "Inserire Valore di [" + i + "] [" + j + "] : " );

                    b[i][j]=Integer.parseInt(in.readLine());

                } catch(Exception e) {

                    System.err.println(msgErrore);                               
                    return;

                }

            }
        
            System.out.println( " " );

        }

        for(int i=0;i<somma.length;i++) {

            for(int j=0;j<somma[0].length;j++){

                somma[i][j]=a[i][j]+b[i][j];

            }

        }

        for (int i=0;i<somma.length;i++) {

            for (int j=0;j<somma[0].length;j++) {

                System.out.print( "\t" + somma[i][j] );

            }

            System.out.println( " " );

        }

	}

}

/*____/\\\\\\\\\\\__________/\\\\\\\\\\\\_________________
____/\\\/////////\\\_______\/\\\////////\\\_______________
____\//\\\______\///________\/\\\______\//\\\_____________
______\////\\\_______________\/\\\_______\/\\\____________
__________\////\\\____________\/\\\_______\/\\\___________
______________\////\\\_________\/\\\_______\/\\\__________
_______/\\\______\//\\\________\/\\\_______/\\\___________
________\///\\\\\\\\\\\/____/\\\_\/\\\\\\\\\\\\/____/\\\__
___________\///////////_____\///__\////////////_____\///*/