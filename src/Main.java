import java.util.Scanner;

import Calcolatrice.Calcolatrice;
import Classi.Persona;
import Classi.Studenti;

public class Main {

    public static Calcolatrice calcolatrice = new Calcolatrice();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String scelta;

        do {

            System.out.println("1.Calcolatrice\n"
                             + "2.Leggi voto\n"
                             + "3.Stampa pari\n"
                             + "4.Array\n"
                             + "5.Frase\n"
                             + "6.Overload\n"
                             + "7.Esci\n");

            scelta = scanner.nextLine();

            switch (scelta) {
                case "1":
                    usaCalcolatrice();
                    break;
                case "2":
                    leggiVotoS();
                    break;
                case "3":
                    stampaPari();
                    break;
                case "4":
                    arrayLettura();
                    break;
                case "5":
                    frase();
                    break;
                case "7":
                    System.out.println("Uscita...");
                    break;
                case "6":
                    System.out.println("Overload di metodi");
                    double a = inserisciNumeroDouble();
                    double b = inserisciNumeroDouble();
                    somma((int)a,(int)b);
                    somma(a,b);
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }while (!scelta.equals("7"));

        scanner.close();
    }

    public static void usaCalcolatrice(){
        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // consuma il ritorno a capo

        System.out.println("Scegli l'operazione (+, -, *, /): ");
        String operazione = scanner.nextLine();

        int risultato;
        switch (operazione) {
            case "+":
                risultato = calcolatrice.somma(num1, num2);
                System.out.println("Risultato: " + risultato);
                break;
            case "-":
                risultato = calcolatrice.sottrazione(num1, num2);
                System.out.println("Risultato: " + risultato);
                break;
            case "*":
                risultato = calcolatrice.moltiplicazione(num1, num2);
                System.out.println("Risultato: " + risultato);
                break;
            case "/":
                try {
                    risultato = calcolatrice.divisione(num1, num2);
                    System.out.println("Risultato: " + risultato);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Operazione non valida.");
        }
    }


    public static void leggiVoto(){
        System.out.println("Inserisci un voto");
        int voto = scanner.nextInt();

        if(voto >= 0  && voto <6) System.out.println("Insufficiente\n");
        if(voto == 6) System.out.println("Sufficiente\n");
        if(voto == 7 || voto == 8) System.out.println("Buono\n");
        if(voto > 8 && voto <=10) System.out.println("Ottimo\n");

        if(voto < 0 || voto > 10) System.out.println("Voto non valido\n");
        scanner.nextLine();
    }

    public static void leggiVotoS(){
        System.out.println("Inserisci un voto");
        int voto = scanner.nextInt();

        switch (voto){
            case 0,1,2,3,4,5:
                System.out.println("Insufficiente\n");
                break;
            case 6:
                System.out.println("Sufficiente\n");
                break;
            case 7,8:
                System.out.println("Buono\n");
                break;
            case 9,10:
                System.out.println("Ottimo\n");
                break;
            default:
                System.out.println("Voto non valido\n");
        }

        scanner.nextLine();
    }

    public static void stampaPari(){
        System.out.println("Numeri pari da 1 a 100:");
        for(int i = 1; i <= 100; i++)
            if(i % 2 == 0) System.out.print(i + ",");
        System.out.println("\n");
    }

    public static void arrayLettura(){

        int array[] = new int[5];
        for(int i = 0; i < array.length; i++){
            System.out.print("Inserisci il " + (i+1) + " numero: ");
            array[i] = scanner.nextInt();
        }

        int somma = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            somma += array[i];
            if(max < array[i]) max = array[i];
        }

        System.out.println("Somma: " + somma + "\n"
                         + "Media: " + somma/array.length +"\n"
                         + "Massimo: " + max + "\n");
        scanner.nextLine();

    }

    public static void frase() {
        System.out.print("Inserisci una frase: ");
        String frase = scanner.nextLine();

        String fraseMaiuscola = frase.toUpperCase();
        String fraseMinuscola = frase.toLowerCase();
        int lunghezza = frase.length();

        System.out.println("Frase maiuscola: " + fraseMaiuscola + "\n"
                + "Frase minuscola: " + fraseMinuscola + "\n"
                + "Lunghezza: " + lunghezza + "\n"
                + "Primo carattere: " + frase.charAt(0) + "\n"
                + "Ultimo carattere: " + frase.charAt(frase.length() - 1) + "\n");
    }

    public static void somma(int a, int b){
        System.out.println("Somma interi: " + (a + b));
    }

    public static void somma(double a, double b){
        System.out.println("Somma double: " + (a + b));
    }

    public static int inserisciNumeroIntero(){
        return scanner.nextInt();
    }

    public static double inserisciNumeroDouble(){
        return scanner.nextDouble();
    }

}
