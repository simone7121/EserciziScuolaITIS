/*

Algoritmo:  Leggere una sequenza di numeri. Terminare la lettura quando si incontra un valore pari a 0 
            e stampare quanti numeri sono stati letti e quanti fra essi sono risultati pari.


Programmatore: Simone D'Anna
Data: 06/03/2021

*/

#include <iostream>

using namespace std;

int main() {

    int numero, countpari=0, countnum=0, i=0;
    system("cls");
    
    do{

        i++;

        cout << "Inserire il " << i << "^ Numero : ";
        cin >> numero;

        if(numero != 0){
            
            countnum++;

            if (numero % 2 ==0){

                countpari++;
               
            }
            
        }

    } while (numero != 0);

    cout << "Il totale dei numeri inseriti e': " << countnum << endl ;

    cout << "Il totale dei numeri pari inseriti e': " << countpari << endl ;
    
}