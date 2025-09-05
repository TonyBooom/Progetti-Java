package Classi;

public class Studenti extends Persona {

    double mediaVoti;
    String classe;

    public Studenti(String nome, int eta,double mediaVoti, String classe) {
        super(nome, eta);
        this.mediaVoti = mediaVoti;
        this.classe = classe;
    }

    public double getMediaVoti(){
        return this.mediaVoti;
    }

    public String classe(){
        return this.classe;
    }

    public void setMediaVoti(double mediaVoti){
        this.mediaVoti = mediaVoti;
    }

    public void setClasse(String classe){
        this.classe = classe;
    }


}
