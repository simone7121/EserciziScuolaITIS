/*

Problema: Sommare tutti i
          numeri compresi tra 1 e 50

Versione: 2.0

Programmatore: Simone D'Anna
Data: 10/01/2021

*/

#include <iostream>

using namespace std;

int main(){

    int i, x=1;

    cout << "Verranno Sommati i numeri progressivamente da 1 a 50" << endl << endl;

    for ( i=3; i<51; i=i+2)
    {
        x = x + i;
        cout << x << endl;
    }
    
    cout << endl << "Il prodotto complessivo e': " << x;

    return 0;

}