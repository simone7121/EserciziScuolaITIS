import java.io.*;

class SingleLogin implements Serializable{

    protected String email;
    protected String password;
    protected String sito;

    public SingleLogin(String email, String password, String sito) {
        this.email = email;
        this.password = password;
        this.sito = sito;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getSito() {
        return sito;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSito(String sito) {
        this.sito = sito;
    }

    public String getSingleLoginFromatted(){

        return "‖"+email+"‖"+password+"‖"+sito;
        
    }

}