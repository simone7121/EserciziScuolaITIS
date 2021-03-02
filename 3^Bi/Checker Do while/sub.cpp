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

    int persone,altezza,media,sommaltezza=0;
       
    cout << "\t ~ Calcolatore media altezza ~ " << endl ;

    cout << "Inserisci il numero totale delle persone: ";
    cin >> persone;
    
    cout << endl
    
    for (int i = 1; i <= persone; i++)
    {

        do {

            cout << "Inserisci l'altezza della " << i << " Persona ( IN CM ): ";
            cin >> altezza;
            cout << endl;

        } while (altezza < 50 || altezza > 200) ;

        sommaltezza += altezza;

    }

    media = sommaltezza / persone ;
    
    cout << "L'altezza media e' " << media << " Cm";

} 