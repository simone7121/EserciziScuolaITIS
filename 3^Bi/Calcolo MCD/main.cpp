/*

Problema: Dato il dividendo e il divisore,
          Calcolare l'MCD

Versione: 1.0

Programmatore: Simone D'Anna
Data: 23/01/2021

*/

#include <iostream>

using namespace std ;

int main() { 

    int a,b,a1,b1,scambio,resto ;

    cout << "\t\t~ Calcolo MCD ~" << endl << endl ;
    
    cout << "Inserire Il numeri: " << endl << endl ;
    cin >> a ;
    
    cout << "---"  << endl ;
    cin >> b ;

    if (a>b & b<a){

        scambio = b;
        b = a ;
        a = scambio ;
        
        cout << endl << "Ho invertito " << b << " e " << a << endl << endl;

    }

    a1=a;
    b1=b;

    while(b>0)  {
        
        resto = a % b ;
        a = b ;
        b = resto; 

    }

    cout << endl << a1 << endl << "--- \t" << "Risultato = " << a << endl << b1 << endl << endl ;

    return 0;

}