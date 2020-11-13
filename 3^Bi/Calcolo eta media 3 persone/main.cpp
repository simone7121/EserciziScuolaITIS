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
    float eta_media;
    int eta_1,eta_2,eta_3,media;

    cout << "Calcolatore eta media" << endl << endl << "Inserire la prima eta': ";
    cin >> eta_1;

    cout << "Inserire la seconda eta': ";
    cin >> eta_2;

    cout << "Inserire la terza eta': ";
    cin >> eta_3;

    eta_media=(float)(eta_1+eta_2+eta_3)/3;
    media= eta_media;

    cout << endl << "Il calcolo dell'eta' media da come risultato: " << eta_media << " Anni" << endl;
    cout << endl << "Il calcolo dell'eta' media senza decimali da come risultato: " << media << " Anni" << endl;

    return 0;
}



