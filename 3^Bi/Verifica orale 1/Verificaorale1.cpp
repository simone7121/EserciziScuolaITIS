/*

Algoritmo: .

Programmatore: Simone D'Anna
Data: 16/12/2020

*/

#include <iostream>
 
using namespace std;
 
int main()
{
    
    int x, y, trasl;

    cout << "*_*_*_Calcolatore ascissa_*_*_*" <<endl ;
    
    cout << "Inserire il valore di X: " ;
    cin >> x;

    cout << "Inserire il valore di Y: " ;
    cin >> y;

    cout << "Inserire il valore di quanto \nsi vuole traslare i punti: ";
    cin >> trasl;    

    switch(trasl){

        case -3: case -2: case -1: case 0: case 1: case 2: case 3:
            x = x + trasl;
            y = y + trasl;
            break;

        default:
            cout << "Il valore inserito per la translazione non è compreso tra -3 e +3.";

    }

    cout << "Le coordinate del punto risultano essere:( " <<x <<" , " <<y <<" ).";

}