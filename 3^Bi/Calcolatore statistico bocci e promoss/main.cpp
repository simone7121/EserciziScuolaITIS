/*

Algoritmo:  Si contino i bocciati e i promossi delle classi prime e si calcolino le percentuali di bocciati 
            e promossi sul totale degli studenti contati. Non si conosce il numero esatto degli studenti da 
            esaminare. Quindi all'inserimento del carattere «0» finisce il conto degli studenti. 

Programmatore: Simone D'Anna
Data: 17/02/2021

*/

#include <iostream>
#include <windows.h>

using namespace std;

int main(void)
{

    int bocciati=0,promossi=0,voto=0,totstudenti=0,sommavoti=0,mediavoti=0,i=0,totaleclassi=0;
    float percbocciati,percpromossi;

    system("cls");

    cout << "\t ~ Calcolatore scuola prima superiore ~ " << endl ;

    cout << "Inserire il numero totale delle classi prime: " ;
    cin >> totaleclassi;
    
    cout << endl;


    for (int f=1 ;f <= totaleclassi ;f++) {
        
        cout << "Inizio contatore della " << f <<" Prima Superiore " << endl ;
        
        i = 0;

        do {
            
            i++;

            cout << "Inserisci La media dei voti della " << i << " Persona (Inserire 0 per concludere): ";
            cin >> voto;

            if (voto<=5 && voto >= 1){

                bocciati++;
                sommavoti+=voto;

            } else if (voto<=10 && voto >= 6){

                promossi++;
                sommavoti+=voto;

            } else if (voto==0) {

                cout << "Tutti i voti degli studenti della classe sono stati inseriti" << endl;

            } else {

                cout << "ERRORE" << endl;

            }
            
        } while (voto!=0);

        Sleep(1500);
        system("cls");

    }

    system("cls");

    totstudenti=promossi+bocciati;

    percpromossi= (float(promossi)/totstudenti)*100;

    percbocciati= (float(bocciati)/totstudenti)*100;

    mediavoti= sommavoti/totstudenti;
    
    
    cout << "\t\t ~ RISULTATI ~ " << endl << endl ;

    Sleep(1000);

    cout << "Il totale degli studenti dell'istituto sono: " << totstudenti << endl << endl;
    
    Sleep(1000);

    cout << "Il totale degli studenti Promossi dell'istituto sono: " << promossi << endl;
    cout << "La percentuale degli studenti Promossi dell'istituto sono: " << percpromossi << "%"<< endl << endl;
    
    Sleep(1000);

    cout << "Il totale degli studenti Bocciati dell'istituto sono: " << bocciati << endl;
    cout << "La percentuale degli studenti Bocciati dell'istituto sono: " << percbocciati << "%";

    return 0;

}