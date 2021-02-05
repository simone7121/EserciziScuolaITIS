#include <iostream>

using namespace std;

int main() {

    int slide_powerpoint, simpatico, copiato;
    double voto;

    cout << "~Easy Calcolatore Voti Powerpoint ~" << endl ;
    
    cout << "Inserire il numero di slide: ";
    cin >> slide_powerpoint;
    cout << endl;

    cout << "L'alunno ti sta antipatico? (1 Si / 0 No): ";
    cin >> simpatico;
    cout << endl;


    if (simpatico == 1) {
        
        if (slide_powerpoint >= 20) {

            voto = 6.5;
            copiato = 1;

        } else {

            voto = 4.75;

        }

    } else if (simpatico == 0) {

        if (slide_powerpoint >= 20) {

            voto = 6.85;
            copiato = 1;

        } else {

            voto = 5.75;

        }

    }

    if (copiato == 1){

        cout << "Mi dispiace, ma ho abbassato il \nvoto perche' palesemente ha copiato da internet." << endl ;

    }
    
    cout << "Il voto sara': " << voto;

    return 0;

}