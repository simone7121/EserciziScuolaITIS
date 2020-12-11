

#include <iostream>

using namespace std;

int main() {

    const float prezzoAdulti_19_80 = 8;    //Prezzo Adulti.
    const float prezzoRagazzi_7_18 = 6;    //Prezzo Ragazzi fino a 18 anni.
    const float prezzoSpeciale_6_80 = 0;   //Prezzo Bambini fino a 6 anni ed anziani con pi� di 80 anni.

    int eta, totaleBiglietti, esito, numeroPersone;

    cout << "~ Biglietteria Virtuale YourMoviePlex! ~" << endl << endl;

    cout << "Salve \nQuante persone siete? :  " ;
    cin >> numeroPersone;
    cout << endl;

    for(int i=1; i<=numeroPersone; i++ ){

        cout << "Inserire la vostra eta': " ;
        cin >> eta;
        cout << endl;

        if (eta>80 || eta<=6 && eta>=0){

            totaleBiglietti=totaleBiglietti+prezzoSpeciale_6_80;
            esito=0;

            } else if (eta>6 && eta<=18){

               totaleBiglietti=totaleBiglietti+prezzoRagazzi_7_18;
               esito=1;

                } else if (eta>18 && eta<=80){

                   totaleBiglietti=totaleBiglietti+prezzoAdulti_19_80;
                   esito=2;

                    } else if (eta<0) {

                        esito=3;
                        numeroPersone++;

                    }

            switch (esito){

            case 0:
                cout << "E' stata applicata l'offerta (Bambini e Over80),\nIl biglietto costera' 0 EUR.\n\n";
                break;
            case 1:
                cout << "E' stata applicata l'offerta (Junior),\nIl biglietto costera' 6 EUR.\n\n";
                break;
            case 2:
                cout << "E' stata applicata l'offerta (Adulti),\nIl biglietto costera' 8 EUR.\n\n";
                break;
            case 3:
                cout << "L'eta' inserita non e' corretta, Riprova.\n\n";
                break;
            default:
                cout << "Errore Interno" << endl;
                break;

            }

        }

        for ( int r = 0; r < 16; r++ ) {

        cout << "*-* " ;

    }

    cout << "\n\nGentile cliente,\n\nIl totale dei biglietti da come risultato " << totaleBiglietti << " Eur" << endl <<"Arrivederci e buona visione!\n\n";

    return 0;

}
