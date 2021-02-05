/*

Problema: Stampare un triangolo rettangolo 
          dato il cateto e un simbolo.

Versione: 1.0

Programmatore: Simone D'Anna
Data: 20/01/2021

*/

#include <iostream>

using namespace std;

int main() {

    int cateto;
    char simbolo;

    cout << "\t\t~ Genera Triangoli ~" << endl << endl ;
    
    cout << "Inserire la lunghezza del cateto: ";
    cin >> cateto ;
    
    cout << endl << "Inserire il simbolo con la quale\ndeve essere stampato : ";
    cin >> simbolo ;
    
    cout << endl ;

    for (int i=1;i<=cateto;i++) {
         
        cout << "\t" ;

        for(int j=1; j<=i; j++) {

            cout << simbolo ;		
                
        }

        cout << endl;

    }

    return 0;

}