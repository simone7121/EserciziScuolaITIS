/*

Algoritmo: Ricevuto in input i secondi, dare in output
i secondi trasformati in ore e minuti.

Programmatore: Simone D'Anna
Data 21/10/2020

*/

#include <iostream>

using namespace std;

int main()
{
    int secondi, ore, minuti;

    cout << "Inserire i secondi: ";
    cin >> secondi;

    minuti = secondi / 60;
    ore = minuti / 60;

    cout << endl << secondi << " secondi trasformati sono: " << int(ore) << " ore " << int(minuti%60) << " minuti " << int(secondi%60) << " secondi." << endl ;

    return 0;
}
