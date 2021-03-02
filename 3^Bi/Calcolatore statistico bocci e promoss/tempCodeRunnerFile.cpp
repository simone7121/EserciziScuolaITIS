/*

Algoritmo: Ricevuto in input il numero di persone in totale
           calcolare la media dell'altezza di n persone
           (se il nimerto inserito e' compreso tra 50 e 200).

Programmatore: Simone D'Anna
Data: 09/02/2021

*/

#include <iostream>

using namespace std;

int main()
{

    int bocciati=0,promossi=0,voto=0,totstudenti=0,sommavoti=0,mediavoti=0,i=0,totaleclassi=0;
    float percbocciati,percpromossi;
       
    cout << "\t ~ Calcolatore scuola prima superiore ~ " << endl ;

    cout << "Inserire il numero totale delle classi prime: " << endl ;
    cin >> totaleclassi;


    for (int f=1 ;f <= totaleclassi ;f++) {
        
        cout << "Inizio contatore della " << f <<" Prima Superiore " << endl ;

        do {
            
            i++;

            cout << "Inserisci La media dei voti della " << i << " Persona (Inserire 0 per concludere): ";
            cin >> voto;

            if (voto<=5 || voto >= 1){
                bocciati++;
                sommavoti+=voto;
            } else if (voto<=10 || voto >= 10){
                promossi++;
                sommavoti+=voto;
            } else if (voto==0) {
                cout << "Tutti i voti degli studenti della classe sono stati inseriti" << endl;
            }
            
        } while (voto=!0);

    }

    totstudenti=promossi+bocciati;

    percpromossi= (totstudenti/promossi)*100;

    percbocciati= (totstudenti/bocciati)*100;

    mediavoti= sommavoti/totstudenti;



    cout << "Il totale degli studenti dell'istituto sono: " << totstudenti << endl;

    cout << "Il totale degli studenti Promossi dell'istituto sono: " << promossi << endl;
    cout << "La percentuale degli studenti Promossi dell'istituto sono: " << percpromossi << endl;

    cout << "Il totale degli studenti Bocciati dell'istituto sono: " << bocciati << endl;
    cout << "La percentuale degli studenti Bocciati dell'istituto sono: " << percbocciati;

}
