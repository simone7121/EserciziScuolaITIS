/*

Algoritmo: Ricevuto in input il numero, dire che giorno è.

Programmatore: Simone D'Anna
Data: 11/12/2020

*/

#include <iostream>
 
using namespace std;
 
int main()
{
    int giorno;
    
    cout << "Inserisci un numero che va da 1 a 7. \nVerra mostrato in output il giorno corrispondente: ";
    cin >> giorno;

    switch(giorno){

    case 1:
        cout << "Lunedi' " <<endl;
        break;
    case 2:
        cout << "Martedi' " <<endl;
        break;
    case 3:
        cout << "Mercoledi' " <<endl;
        break;
    case 4:
        cout << "Giovedi' " <<endl;
        break;
    case 5:
        cout << "Venerdi' " <<endl;
        break;
    case 6:
        cout << "Sabato " <<endl;
        break;
    case 7:
        cout << "Domenica " <<endl;
        break;
    default:
        cout << "Il numero inserito non e' collegabile a un giorno della settimana." <<endl;
        break;
    }

    return 0;

}