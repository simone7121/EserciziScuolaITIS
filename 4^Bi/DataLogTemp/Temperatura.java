import java.util.Vector;

public class Temperatura {

    private String nome;
    private Vector<Integer> temperature;

    public Temperatura(String nome,Vector<Integer> temperature) {
        this.nome = nome;
        this.temperature = temperature;
    }

    public Temperatura(String nome) {
        this.nome = nome;
        temperature = new Vector<>();
        
    }

    public String getNome() {
        return nome;
    }

    public Vector<Integer> getTemperature() {
        return temperature;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTemperature(Vector<Integer> temperature) {
        this.temperature = temperature;
    }

    public void addTemperatura(int temp){
        temperature.add(temp);
    }
    
}
