/*

Algoritmo: Ricevuto in input un numero, dire se e' primo

Programmatore: Simone D'Anna
Data: 20/02/2021

*/

#include <iostream>

using namespace std;

int main()
{   
    int num,div=1,i=0,x=0;

    do{

        cout << "Inserisci un numero: ";
        cin >> num;
    
        cout << endl;
    
        do{
        
            div++;
        
            if(num%div==0){

              i++;
            
            }

        }while(i==0 && div<num);
    
        if(i==1){

            cout<<"Il numero "<<num<< " e' primo";

        } else {

            cout<<"Il numero "<<num<<" non e' primo";

        }

        cout << endl << "Inserisci (0) [Uscita] (1) [Continua]: ";
        cin >> x;

    }while (x==1);

    return 0;

}
