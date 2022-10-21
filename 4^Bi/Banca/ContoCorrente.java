public class ContoCorrente {
    
    private String id;
    private String intestatario;
    private double saldo;

    public ContoCorrente(String id, String intestatario, double saldo) {
        this.id = id;
        this.intestatario = intestatario;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getIntestatario() {
        return intestatario;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setIntestatario(String intestatario) {
        this.intestatario = intestatario;
    }

}
