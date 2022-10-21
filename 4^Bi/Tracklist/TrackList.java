public class TrackList {
    
    private String nomeTrklst;
    private Track [] t;
    private int i;

    public TrackList(String nomeTrklst) {
        this.nomeTrklst = nomeTrklst;
        this.t = new Track[20];
        i = 0;
    }
       
    public int aggiungi(Track t) {
        this.t[i]=t;
        i++;
        return i;
    }

    public int durata(){
        int duratacomplessiva = 0;
        for(int j = 0; j<i; j++){
            duratacomplessiva += t[j].getDurata();
        }
        return duratacomplessiva;
        
    }

    public void printTracks() {
        
        String div = "\n______________________________________________________________________________________________________________";

        
        System.out.println("\n\n\t\t\t\t  Nome tracklist:" + nomeTrklst + "\n");
        System.out.format("%30s","Titolo");
        System.out.format("%30s","Cantante");
        System.out.format("%30s","Autore");
        System.out.format("%10s","Durata");
        System.out.println(div);

        for(int j=0;j<i;j++){
            System.out.format("\n");
            System.out.format("%30s",t[j].getTitolo());
            System.out.format("%30s",t[j].getCantante());
            System.out.format("%30s",t[j].getAutore());
            System.out.format("%10d",t[j].getDurata());
        }

        System.out.println(div);

    }

}
