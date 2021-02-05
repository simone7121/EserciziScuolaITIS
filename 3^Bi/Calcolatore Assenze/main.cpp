/*

Problema: Programma che calcola e visualizza le assenze per ciascun piano, 
          che individua e visualizza il piano con il maggior numero di assenze, 
          che calcola e visualizzata il numero totale di assenti nella scuola.

Versione: 2.0

Programmatore: Simone D'Anna
Data: 20/01/2021

*/

#include <iostream>
#include <windows.h>

using namespace std;

int main() {

    int pianitotali,classipiano,totassenti=0,totpiano=0,assenti,maxass,minass,pianomax,pianomin;

    cout << "\t\t~ Calcolo Assenze ~" << endl << endl ;
    
    cout << "Inserire I piani totali: ";
    cin >> pianitotali ;
    
    for (int i=1;i<=pianitotali;i++){

        cout << endl << "Inserire il numero di classi del " << i << " piano: ";
        cin >> classipiano ;

        for (int j=1;j<=classipiano;j++) {
           
            cout << endl << "Inserire il numero di assenti della " << j << " classe: ";
            cin >> assenti ;
            
            totassenti+=assenti;
            totpiano+=assenti;
            
            cout << "\t";

            if (i==1){
            
                maxass=assenti;
                minass=assenti;
                pianomax=i;
                pianomin=i;

            } else if (assenti > maxass) {

		        maxass=assenti;
                pianomax=i;

		    } else if (assenti <= maxass) {

		        minass=assenti;
                pianomin=i;

		    }
            
        }
        
        system("cls");
        
        cout << endl << "\t\tGli assenti del " << i << " piano sono: " << totpiano ;
        totpiano=0;
        
        Sleep(2000);
        system("cls");

    }
    cout << "\t\t~ Risultati Assenze ~" ;
    
    cout << endl << "Il piano con piu' assenze e' stato: " << pianomax ;

    cout << endl << "Il massimo delle assenze e': " << maxass ;

    cout << endl << endl << "Il piano con meno assenze e' stato: " << pianomin ;
    
    cout << endl << "Il minimo delle assenze e': " << minass ;

    cout << endl << endl << "Il totale degli assenti e': " << totassenti << endl << endl ;

    return 0;

}