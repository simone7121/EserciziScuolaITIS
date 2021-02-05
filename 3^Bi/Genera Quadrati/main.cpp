/*

Problema: Stampare un quadrato 
          dato il lato e un simbolo.

Versione: 1.0

Programmatore: Simone D'Anna
Data: 20/01/2021

*/

#include <iostream>

using namespace std;

int main() {

    int lato;
    char simbolo;

    cout << "\t\t~ Genera Quadrati ~" << endl << endl ;
    
    cout << "Inserire la lunghezza del lato: ";
    cin >> lato ;
    
    cout << endl << "Inserire il simbolo con la quale\ndeve essere stampato : ";
    cin >> simbolo ;
    
    cout << endl ;

    for (int i=1;i<=lato;i++) {
         
        cout << "\t" ;

        for(int j=1; j<=lato; j++) {

            cout << simbolo ;		
                
        }

        cout << endl;

    }

    return 0;

}