public class TrackListTester {
    public static void main(String[] args) {

        Track t1 = new Track("Bourée", 238, "Jethro Tull");
        TrackList tl1 = new TrackList("Varie");

        int num = tl1.aggiungi(t1);
        int tempo = tl1.durata();

        System.out.println(
                "Nella TrackList tl1 ci sono " + num + " brani e la sua durata complessiva è " + tempo + " secondi.");

        num = tl1.aggiungi(new Track("Il pescatore", 264, "Fiorella Mannoia", "Fabrizio De André"));
        num = tl1.aggiungi(new Track("Un chimico", 180, "Fabrizio De André"));
        num = tl1.aggiungi(new Track("Bocca di Rosa", 280, "Fabrizio De André", "Fabrizio De André"));

        tempo = tl1.durata();
        
        System.out.println(
                "Nella TrackList tl1 ci sono " + num + " brani e la sua durata complessiva è " + tempo + " secondi.");
        tl1.printTracks();
    }
}