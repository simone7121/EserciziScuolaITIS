/*

Algoritmo: Ricevuto in input un orario attraverso le sue tre  componenti
(ore, minuti e secondi), si calcola il valore totale in secondi.

Programmatore: Simone D'Anna
Data 10/10/2020

*/
#include <iostream>

using namespace std;

int main()
{
    int ore,minuti,secondi,seconditotali;

    cout << "Calcolatore di secondi" << endl << endl << "Inserire le Ore: ";
    cin >> ore;

    cout << "Inserire i Minuti: ";
    cin >> minuti;

    cout << "Calcolatore di secondi: ";
    cin >> secondi;

    seconditotali=(ore*3600)+(minuti*60)+secondi;

    cout << endl << "Il calcolo da orario completo a secondi da come risultato: " << seconditotali << " Secondi" << endl;

    return 0;

}
