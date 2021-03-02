/*

Algoritmo:  Simula un'asta tra due compratori.
            Termina quando uno dei due si ritira scrivendo "0".
            Stampa chi dei due si e' aggiudicato l'asta e a che prezzo.

Programmatore: Simone D'Anna
Data: 27/02/2021

*/

#include <iostream>

using namespace std;

int main()
{
    int piniziale, turni = 0, offerta1 = 0, offerta2 = 0, offerta = 0, offertafinale = 0, rilancio = 0;
    string ogetto;
    string offerente1;
    string offerente2;

    cout << "Da quanto si vuole iniziale l'asta?" << endl;
    cin >> piniziale;

    if (piniziale < 0)
    {
        cout << "Il prezzo iniziale non e' valido" << endl;
    }
    else
    {
        cout << "Di quale oggetto si vuole fare l'asta?" << endl;
        cin >> ogetto;


        cout << "Chi e' il primo offerente?" << endl;
        cin >> offerente1;

        cout << "Chi e' il secondo offerente?" << endl;
        cin >> offerente2;

        while (turni < 1 || turni > 2){

            cout << "Chi fa la prima offerta?" << endl;
            cout << "Scrivere 1 se e' il primo offerente a fare la prima offerta, se invece e' il secondo a fare l'offerta scrivere 2" << endl;
            cin >> turni;
        }
      
       

        do{

            if (turni == 1){
               
                while (offerta1 < piniziale){

                    cout << "Inserire la propria offerta" << endl;
                    cin >> offerta1;
                
                    if (offerta1 < piniziale){ 

                    cout << "L'offerta non e' valida" << endl;
                    cout << "Riscrivi la tua offerta" << endl;

                    }
                    
                }

                turni = 2;

                cout << "Ci sono altri offerenti?, se non ce ne sono scrivere 0, altrimenti scrivere qualsiasi numero" << endl;
                cin >> turni;

                if (turni != 0){

                    turni = 2;

                }

            } 
            
            if (turni == 2){
               
                while (offerta2 < piniziale){

                    cout << "inserire la propria offerta" << endl;
                    cin >> offerta2;
                   

                    if (offerta2 < piniziale){

                        cout << "l'offerta non e' valida" << endl;
                        cout << " ridigita la tua offerta" << endl;

                    }

                    turni = 1;

                    cout << "ci sono altri offerenti?, se non ce ne sono scrivere 0, altrimenti scrivere qualsiasi numero" << endl;
                    cin >> turni;

                    if (turni != 0){

                        turni = 1;

                    }

                }
               
            }

        } while (turni != 0);


        if (offerta1 > offerta2)
        {
            cout << "la maggiore offerta e' di: " << offerente1 << ". \nL'offerta ammonta ad un totale di: " << offerta1;
        }
        else if (offerta2 > offerta1)
        {
            cout << "la maggiore offerta e' di: " << offerente2 << ". \nL'offerta ammonta ad un totale di: " << offerta2;
        }

    }
    return 0;
}