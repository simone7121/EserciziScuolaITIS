/*

Problema: Dato in input un numero,
          Calcolare la sua tavola pitagorica
          fino al 15, senno' ritorna errore.

Versione: 1.0

Programmatore: Simone D'Anna
Data: 12/01/2021

*/

#include <iostream>

using namespace std;

int main() {

    int numero, risultato;

    cout << "~ Calcolatore tabellina ~" << endl ;
    
    cout << "Inserire il numero di cui si vuole \neseguire la moltiplicazione: ";
    cin >> numero;

    if (numero <= 15) {
        
        cout << endl << "Verra eseguito l'output della tavola pitagorica fino al numero " << numero << endl << endl;

        for (int i=1;i<=numero;i++) {
        
            for(int j=1;j<=numero;j++) {
                
                cout << "\t" << i*j;		
                
            }

            cout << endl;

        }

    } else {

        cout << endl << "Il numero e' maggiore di 15";

    }

    return 0;

}