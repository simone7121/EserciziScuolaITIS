public class Counter {

    private int value;
    private int step;

    public Counter (){
        value = 0;
        step = 1;
    }

    public Counter(int step){
        value = 0;
        this.step = step;
    }

    void reset(){
        value=0;
    }

    void increment(){
        value+=step;
    }

    int getValue(){
        return value;
    }

    void setStep(int step){
        this.step=step;
    }

    void stampa(){
        System.out.println("Valore: " + value);
        System.out.println("Step: "+step);
    }

}
