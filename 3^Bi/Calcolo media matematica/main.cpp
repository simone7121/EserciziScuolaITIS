/*

Algoritmo:  Dato un elenco di (N) studenti, per ogni studente sono indicati il nome e due voti relativi a due prove di Matematica; 
            alla fine del programma si indicano i numeri di coloro che dovranno frequentare un corso di recupero, e degli errori 
            di inserimento dei voti.

Pseudocode: -------------------------------------------------------------------------------------------

function main (void)

    variable studenti: integer
    variable votoprimaver: integer
    variable votosecondaver: integer
    variable vototot: integer
    variable conterr: integer
    variable contneg: integer
    variable i: integer

    variable nome: string

    conterr = 0
    contneg = 0
    i = 0

    output "\t ~ Calcolatore media Matematica ~ "

    output "Inserisci il numero degli studenti: "
    input studenti

    for i from 1 to studenti

        output "Inserisci il nome dell'alunno"
        input nome

        output "Inserire il Primo voto:"
        input votoprimaver

        output "Inserire il Secondo voto:"
        input votosecondaver

        vototot ← (votoprimaver + votosecondaver) / 2

        if vototot >=0 AND vototot <=5 then

            output "L'alunno ", nome ," E' indebitato"
            contneg ← contneg + 1

        else

            output "C'e' un errere nei voti, ricontrolla."
            contneg ← conterr + 1

        end If

        output "La sua media e': ", vototot

    end for

    output "Il totale degli errori di inserimento sono: ", conterr
    output "Il totale degli studenti Indebitati sono: ", contneg

end function main

-------------------------------------------------------------------------------------------

Programmatore: Simone D'Anna
Data: 23/02/2021

*/

#include <iostream>
#include <windows.h>
#include <string>

using namespace std;

int main(void)
{

    int studenti, votoprimaver, votosecondaver, vototot, conterr=0, contneg=0, i;
    string nome;

    system("cls");

    cout << "\t ~ Calcolatore media Matematica ~ " << endl;

    cout << "Inserisci il numero degli studenti: ";
    cin >> studenti;

    system("cls");
    
    for (i = 1; i <= studenti; i++) {

        cout << "Inserisci il nome dell'alunno: ";
        cin >> nome;

        cout << endl << "Inserire il Primo voto: " ;
        cin >> votoprimaver;

        cout << endl << "Inserire il Secondo voto: " ;
        cin >> votosecondaver;

        vototot = (votoprimaver + votosecondaver) / 2;

        if (vototot >=0 && vototot <=5){

            cout << "L'alunno " << nome << " E' indebitato" << endl;
            contneg ++;

        } else {

            cout << "C'e' un errere nei voti, ricontrolla.";
            conterr ++;

        }

        cout << "La sua media e': " << vototot << endl;

        Sleep(2000);
        system("cls");

    }

    cout << "\t ~ Risultati ~ "<< endl << endl;

    cout << "Il totale degli errori di inserimento sono: " << conterr << endl;

    cout << "Il totale degli studenti Indebitati sono: " << contneg << endl;

    return 0;

}