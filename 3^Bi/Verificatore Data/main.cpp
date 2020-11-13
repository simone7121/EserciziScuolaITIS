/*

Algoritmo: Ricevuto in input una data, dire se essa e corretta o meno.

Programmatore: Simone D'Anna
Data: 11/11/2020

*/

#include <iostream>

using namespace std;

int main() {

    int giorno,mese,anno,esito;


    cout << "~ Verificatore Data CalendarCheck5000 ~" << endl << endl;

    cout << "Inserire il giorno: " ;
    cin >> giorno;

    cout << "Inserire il mese: " ;
    cin >> mese;

    cout << "Inserire l'anno: " ;
    cin >> anno;
    cout << endl;

    switch (mese){

    case 1:
        if (giorno <= 31){
        esito = 0;
        } else {
        esito = 1;
        }
        break;
    case 2:
        if (anno%4==0){
            if (giorno <= 29){
                esito = 0;
                } else {
                    esito = 1;
                }
        } else {
            if (giorno <= 28){
            esito = 0;
            } else {
                esito = 1;
            }
        }
        break;
    case 3:
        if (giorno <= 31){
        esito = 0;
        } else {
        esito = 1;
        }
        break;
    case 4:
        if (giorno <= 30){
        esito = 0;
        } else {
        esito = 1;
        }
        break;
    case 5:
        if (giorno <= 31){
        esito = 0;
        } else {
        esito = 1;
        }
        break;
    case 6:
        if (giorno <= 30){
        esito = 1;
        } else {
        esito = 0;
        }
        break;
    case 7:
        if (giorno <= 31){
        esito = 0;
        } else {
        esito = 1;
        }
        break;
    case 8:
        if (giorno <= 31){
        esito = 0;
        } else {
        esito = 1;
        }
        break;
    case 9:
        if (giorno <= 30){
        esito = 0;
        } else {
        esito = 1;
        }
        break;
    case 10:
        if (giorno <= 31){
        esito = 0;
        } else {
        esito = 1;
        }
        break;
    case 11:
        if (giorno <= 30){
        esito = 0;
        } else {
        esito = 1;
        }
        break;
    case 12:
        if (giorno <= 31){
        esito = 0;
        } else {
        esito = 1;
        }
        break;
    default:
        esito = 2;
    }

    switch (esito){

    case 0:
        cout << "La data inserita e' corretta." << endl;
        break;
    case 1:
        cout << "La data inserita e' scorretta." << endl << "Controlla meglio il giorno." << endl;
        break;
    case 2:
        cout << "La data inserita e' scorretta." << endl << "Controlla meglio il mese." << endl;
        break;
    default:
        cout << "Errore Interno" << endl;
        break;
    }

}
