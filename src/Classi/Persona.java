package Classi;

public class Persona {
    String nome;
    int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void saluta() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni.");
    }

    public String getNome() {
        return nome;
    }
    public int getEta() {
        return eta;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }

}
