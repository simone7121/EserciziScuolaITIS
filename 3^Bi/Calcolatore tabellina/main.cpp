/*

Problema: Dato in input un numero,
          Calcolare la sua tabellina.

Versione: 1.0

Programmatore: Simone D'Anna
Data: 12/01/2021

*/

#include <iostream>

using namespace std;

int main(){
    
    int ripet = 1;
    
    cout << "~ Calcolatore tabellina ~" << endl ;

    while (ripet==1){
    
        int numero, risultato;
    
        cout << "Inserire il numero di cui si vuole \neseguire la moltiplicazione:";
        cin >> numero;

        cout << endl << "Verra eseguito l'output della tabellina del " << numero << endl;

        for (int i=1;i<=10;i++){

            risultato = numero * i;
            cout << numero << " X " << i << " = " << risultato << endl ;

        }

        cout << endl ;
       
        cout << "Vuoi eseguire l'output di un altra tabellina ? (1 Si - 0 No)" << endl ;
        cin >> ripet;

    }

    return 0;

}