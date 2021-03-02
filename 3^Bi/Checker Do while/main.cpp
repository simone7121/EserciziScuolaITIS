/*

Algoritmo: Ricevuto in input un numero qualsiasi,
           vedere se esso e' compreso tra 1 e 10

Programmatore: Simone D'Anna
Data: 09/02/2021

*/


#include <iostream>

using namespace std;

int main()
{

  int numeroinserito,tentativi;

  tentativi = 0
  
  cout << "\t ~ Checker Numero ~ " << endl ;

  do {

    cout << "Inserisci un numero: ";
    cin >> numeroinserito;
    tentativi++;

  } while (numeroinserito < 1 || numeroinserito > 10) ;

  cout << endl << "Bravo, hai inserito un numero compreso tra 1 e 10, ";

  if (tentativi == 1 ){

    cout << "e' ci sono voluti 0 Tentativi, Bravo ! ";

  } else {

    cout << "ma ci sono voluti " << tentativi << " Tentativi";

  }
  
} 