/*

Problema: Calcolo Stipendio In base a
          enciclopedie vendute.

Programmatore: Simone D'Anna
Data: 20/10/2020

*/

#include <iostream>

using namespace std;

int main()
{
    const int stipendio_mensile = 1000;                                 // Stipendio mensile in EUR
    const int guadagno_aggiuntivo = 150;                                // Guadagno per ogni enciclopedia
    const int trattentuta = 18;                                         // Percentuale trattenuta

    int enciclopedie_vendute;                                           // Input enciclopedie vendute
    float totale_paga_lordo, totale_paga_netto, totale_imposta;

    cout << "Calcolo Stipendio Mensile" << endl << "Inserire le enciclopedie vendute: " ;
    cin >> enciclopedie_vendute;

    totale_paga_lordo= stipendio_mensile+(guadagno_aggiuntivo*enciclopedie_vendute);
    totale_imposta=(trattentuta*totale_paga_lordo)/100;
    totale_paga_netto= totale_paga_lordo - totale_imposta;

    cout << endl << "Il calcolo da come risultato: " << totale_paga_netto << " EUR" ;

    return 0;
}
