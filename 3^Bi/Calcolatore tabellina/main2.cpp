/*

Problema: Dato in input un numero,
          Calcolare la sua tabellina.

Versione: 2.0

Programmatore: Simone D'Anna
Data: 19/01/2021

*/

#include <iostream>

using namespace std;

int main(){

    int numero = 0, risultato;

    cout << "~ Calcolatore tabellina 2.0 ~" << endl ;
    
    cout << "Inserire il numero di cui si vuole \neseguire la moltiplicazione:";
    cin >> numero;

    cout << endl << "Verra eseguito l'output della tabellina fino al  " << numero << endl;
    
    for (int i=1;i<=numero;i++){
        
        for (int j=1;j<=10;j++){

            risultato = j * i;
        
            cout << i << " X " << j << " = " << risultato << "\t";

        }

        cout << endl << endl;

    }
   

    cout << endl ;

    return 0;

}