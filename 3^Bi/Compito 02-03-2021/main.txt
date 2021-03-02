/*

Algoritmo:  Leggere da tastiera un numero imprecisato di coppie di numeri interi. Terminare la lettura quando 
            il primo numero della coppia risulta essere uguale a zero. 
            Contare le coppie che danno il prodotto multiplo di un numero intero K.


Pseudocode: ------------------------------------------------------------------------------------------------------------------------------

function main(void)
    
    variable x: integer
    variable y: integer
    variable k: integer
    variable prodotto: integer
    variable coincidenze: integer

    coincidenze = 0
    prodotto = 0
    
    system("cls")

    output " ~ Calcolatore coppie di numeri ~ "
    output "Inserisca un numero che serva da confronto per il prodotto delle due cifre della coppia di numeri."

    input k

    do
        
        system("cls")

        output "Inserisca il Primo Numero Della Coppia. (INSERISCA 0 PER USCIRE )"
        input x

        if (x ≠ 0) 

            output "Inserisca il Secondo Numero Della Coppia."
            input y

            prodotto = x * y

            if (prodotto MOD k == 0) 

                coincidenze++

            end If

        end If

    while (x ≠ 0)
    
    system("cls")
    
    if (coincidenze == 1)

        output "Si e' trovato rispettivamente 1 valore che corrisponde"

    else (if coincidenze == 0)

        output "Si e' trovato rispettivamente nessun valore che corrisponde"

    else

        output "Si sono trovati rispettivamente " coincidenze " Valori che corrispondono"

    end If

    output "alla moltiplicazione delle due cifre contenute nella coppia di numeri, la quale il risultato e' un multiplo di " + k

end function main (void)

---------------------------------------------------------------------------------------------------------------------------------------

Programmatore: Simone D'Anna
Data: 02/03/2021

*/

#include <iostream>

using namespace std;

int main(){

    int x, y, k, prodotto = 0, coincidenze = 0 ;    // Dichiarazione Variabili, setto il totalizzatore coincidenze a 0.

    system("cls");

    cout << "\t ~ Calcolatore coppie di numeri ~ " << endl;

    cout << "Inserisca un numero che serva da confronto \nper il prodotto delle due cifre della coppia di numeri: " ;
    cin >> k;

    do {                                            // Inizio ciclo indefinito fino a quando il primo numero inserito della coppia e' 0
        
        system("cls");

        cout << "\nInserisca il Primo Numero Della Coppia.\n(INSERISCA 0 PER USCIRE ): ";
        cin >> x;

        if (x != 0) {                               // Se il primo numero inserito della coppia e' 0, Salta l'inserimento del secondo numero della coppia.

            cout << "\nInserisca il Secondo Numero Della Coppia: ";
            cin >> y;

            prodotto = x * y;

            if (prodotto % k == 0) {                // Se il prodotto di x ed y e' un multiplo di k, Incrementa il contatore coincidenze di 1. 

                coincidenze++;

            }

        }

    } while (x != 0);
    
    system("cls");

    cout << "\n\t ~ RISULTATO ~ \n" << endl;

    if (coincidenze == 1){                          // Se si e' trovata 1 sola coincidenza, si stampa il messaggio grammaticalmente corretto.
        
        cout << "Si e' trovato rispettivamente 1 valore che corrisponde";

    } else if (coincidenze == 0) {                  // Se si e' trovata nessuna coincidenza, si stampa il messaggio grammaticalmente corretto.
        
        cout << "Si e' trovato rispettivamente nessun valore che corrisponde";

    } else {                                        // Se si e' una coincidenza che differisce nelle prime 2 condizioni, si stampa il messaggio grammaticalmente corretto.
        
        cout << "Si sono trovati rispettivamente " << coincidenze << " Valori che corrispondono";

    }
 
    cout << " alla \nmoltiplicazione delle due cifre contenute nella coppia di numeri,\nla quale il risultato e' un multiplo di " << k << endl;
    
    return 0;

}