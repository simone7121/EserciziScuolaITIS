public class Contatore {

    private int val;
    
    public Contatore(){
        val = 0;
    }

    void inc(){
        val++;
    }

    void dec(){
        val--;
    }

    void azzera(){
        val = 0;
    }

    int getVal(){
        return val;
    }

    void setVal(int val){
        this.val=val;
    }

    void stampa(){
        System.out.println(val);
    }

}
