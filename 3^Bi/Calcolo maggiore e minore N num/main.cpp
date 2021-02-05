/*

Problema: Dato in input un set di numeri,
          trovare il minore e il maggiore.

Versione: 1.0

Programmatore: Simone D'Anna
Data: 12/01/2021

*/

#include <iostream>
#include <stdlib.h>

using namespace std;

int main(){

    int numero, totnum, max, min;

    cout << "~ Calcolatore Max Min ~" << endl << endl ;
    
    cout << "Inserire il totale dei numeri \nda calcolare il max e il minimo: ";
    cin >> totnum;
    
    cout << endl << endl ;

    for(int i=1 ; totnum>=i ; i++){
        
        cout << "Inserisci il " << i << " numero: " ;
		cin >> numero;
        
        if (i==1){
            
            max=numero;
            min=numero;

        } else if (numero>max) {

		    max=numero;

		} else if (numero<=max) {

		    min=numero;
		}

    }

    cout << endl << "Il numero massimo inserito e': "<< max << endl;
    cout << "Il numero minimo inserito e': "<< min << endl;

    return 0;
}
    