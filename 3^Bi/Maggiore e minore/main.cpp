/*

Algoritmo: Ricevuto in input un set di 2 numeri, calcolare
           il massimo ed il minimo con l'if.

Programmatore: Simone D'Anna
Data 7/11/2020

*/

#include <iostream>

using namespace std;

int main()
{
    float Numero_1,Numero_2;

    cout << "Calcolatore Massimo e minimo numero" << endl << endl << "Inserire il primo numero: ";
    cin >> Numero_1;

    cout << "Inserire il secondo numero: ";
    cin >> Numero_2;

     if (Numero_1 == Numero_2) {

        cout << "Il primo valore ( " << Numero_1 <<  " ) e' uguale al secondo valore ( " << Numero_2 << " )" << endl;

    } else {

        if (Numero_1 > Numero_2) {

            cout << "Il primo valore ( " << Numero_1 <<  " ) e' maggiore rispetto al secondo valore ( " << Numero_2 << " )" << endl;

        } else {

            cout << "Il primo valore ( " << Numero_1 <<  " )  e' minore rispetto al secondo valore ( " << Numero_2 << " )" << endl;

        }

    }

   return 0;

}

