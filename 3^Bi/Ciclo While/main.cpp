#include <iostream>
#include <windows.h>

using namespace std;

int main() { 

    int numero,somma,i=1;

    cout << "\t\t~ Calcolo Somma Iterativa ~" << endl << endl ;
    
    cout << "Inserire Il numero: ";
    cin >> numero ;

    while(i<=numero)  {

        somma = somma + i;
        i++;

    }

    cout << "Risultato: " << somma;

}