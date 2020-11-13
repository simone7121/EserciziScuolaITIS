/*

Algoritmo: Ricevuto in input il quantitativo di foto, calcolare le due tariffe proposte dal
           negozio, e proporre quella piu' conveniente al compratore.

Programmatore: Simone D'Anna
Data: 11/11/2020

*/

#include <iostream>

using namespace std;

int main() {

    const float prezzo1 = 0.10;         //Prezzo ogni foto.
    const float quotafissa1 = 7.50;     //Quota da aggiungere.
    const float prezzo2 = 0.20;         //Prezzo ogni foto.

    string nomeCliente,cognomeCliente;
    int totaleFoto;
    float totalePrezzo1, totalePrezzo2;



    cout << "~ Calcolo Prezzo foto Digistamp2000 ~" << endl << endl;

    cout << "Inserire il vostro Nome: " ;
    cin >> nomeCliente;

    cout << "Inserire il vostro Cognome: " ;
    cin >> cognomeCliente;

    cout << "Inserire il quantitativo di foto da stampare: " ;
    cin >> totaleFoto;
    cout << endl;

    totalePrezzo1 = totaleFoto * prezzo1 + quotafissa1;
    totalePrezzo2 = totaleFoto * prezzo2;

    for ( int i = 0; i < 16; i++ ) {

        cout << "*-* " ;

    }

    cout << endl << endl << "Gentile " << cognomeCliente << " "  << nomeCliente << endl;

    cout << "L'offerta Numero 1 da come risultato " << totalePrezzo1 << " Eur" << endl;

    cout << "E l'offerta numero 2 da come risultato " << totalePrezzo2 << " Eur" << endl << endl;

    if (totalePrezzo1 > totalePrezzo2) {

        cout << "Le consigliamo di scegliere la 2 offerta, poiche' risulta la piu conveniente." << endl;

    } else {

        cout << "Le consigliamo di scegliere la 1 offerta, poiche' risulta la piu conveniente." << endl;

    }
    return 0;
}
