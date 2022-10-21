
class Stringa{

    private String stringai;

    public Stringa(String stringai){
        this.stringai=stringai;
    }

    public String getStringa(){
        return stringai;
    }

    public int ricercaCarattere(char caratt){

        for(int i=0; i<stringai.length(); i++){
            if(caratt==stringai.charAt(i)){
                return i;
            }
        }

        return -1;
    }

    public boolean palindromo(){

        return stringai.equals(this.reverse());

    }

    public String reverse(){

        String tempStr="";

        for(int i = stringai.length()-1; i>=0; i--){
            tempStr+=stringai.charAt(i);
        }
        
        return tempStr;
    }

    public String estrazioneDelCentro(){
        
        String tempStr="";

        if(stringai.length()%2==0){
            tempStr+=this.stringai.charAt(stringai.length()/2-1);
        }
        
        tempStr+=this.stringai.charAt(stringai.length()/2);
        
        return tempStr;
    }


    public String sottostringheDiN(int n){

        String tempStr="";

        for(int i=0; i<=(stringai.length()-n); i++){

            tempStr+=stringai.substring(i, i+n)+"\n";

        }

        return tempStr;

    }

}