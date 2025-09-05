package Calcolatrice;

public class Calcolatrice {

    public int somma(int a, int b) {
        return a + b;
    }

    public int sottrazione(int a, int b){
        return a - b;
    }

    public int moltiplicazione(int a, int b){
        return a * b;
    }

    public int divisione(int a, int b){
        if(b == 0) {
            throw new IllegalArgumentException("Divisione per zero non è permessa.");
        }
        return a / b;
    }
}
