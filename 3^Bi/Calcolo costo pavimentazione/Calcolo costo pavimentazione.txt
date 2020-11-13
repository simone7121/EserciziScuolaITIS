/*

Algoritmo: Ricevuto in input il lato maggiore, il lato minore
e il costo delle piastrelle al mq calcolarsi il prezzo finale
e l'area del piano.

Programmatore: Simone D'Anna
Data 16/10/2020

*/

#include <iostream>

using namespace std;

int main()
{
    float lato_maggiore,lato_minore,area,prezzo_piastrella_mq,totale;

    cout << "Calcolatore Costo Totale Piastrelle al MQ" << endl << endl << "Inserire il lato Maggiore (METRI): ";
    cin >> lato_maggiore;

    cout << "Inserire il lato Minore (METRI) : ";
    cin >> lato_minore;

    cout << "Inserire il prezzo delle Piastrelle al MQ (EUR) : ";
    cin >> prezzo_piastrella_mq;

    area=lato_maggiore*lato_minore;
    totale=area*prezzo_piastrella_mq;

    cout << endl << "I metri quadrati totali della stanza sono: " << area << " Mq" ;
    cout << endl << "Il calcolo del prezzo finale da come risultato: " << totale << " EUR" << endl;

    return 0;
}
