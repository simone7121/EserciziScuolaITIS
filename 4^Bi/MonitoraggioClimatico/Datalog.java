import java.util.Calendar;
import java.text.*;

public class Datalog {

    private Calendar dataAcqisizione;
    private String citta;
    private int tempMax;
    private int tempMin;
    private int umidita;

    SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");

    public Datalog(String strCalendar, String citta, int tempMax, int tempMin, int umidita) throws ParseException {
        dataAcqisizione = parserData(strCalendar);
        this.citta = citta;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.umidita = umidita;
    }

    public Calendar getDataAcqisizione() {
        return dataAcqisizione;
    }

    public String getCitta() {
        return citta;
    }

    public int getTempMax() {
        return tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public int getUmidita() {
        return umidita;
    }

    public String getDataAcqisizioneStr() {
        return formatter1.format(dataAcqisizione.getTime());
    }

    public Calendar parserData(String strCalendar) throws ParseException {

        Calendar modificata = Calendar.getInstance();
        modificata.setTime(formatter1.parse(strCalendar));

        return modificata;

    }

    public String toFormattedStr() {

        return getDataAcqisizioneStr() + "\n" + citta + "\n" + tempMax + "\n" + tempMin + "\n" + umidita + "\n";
        
        /*
         * Example output
         * 21-09-2011
         * Napoli
         * 21
         * 12
         * 33
         */

    }
    
}
