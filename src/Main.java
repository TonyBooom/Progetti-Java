import java.util.Scanner;
import Classi.Persona;
import Classi.Studenti;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Persona[] gente = new Persona[3];
    public static Studenti[] studenti = new Studenti[3];
    public static int personCount = 0;
    public static int studentCount = 0;

    public static void main(String[] args) {

        System.out.println("Creazione studenti e persone");

        inserisciPersone();
        stampaTutti();

        scanner.close();
    }

    public static void inserisciPersone() {
        for(int i = 0; i < 3; i++) {
            Persona p = creaPersona();
            if(p instanceof Studenti) {
                studenti[studentCount++] = (Studenti) p;
            } else {
                gente[personCount++] = p;
            }
        }
    }

    public static Persona creaPersona() {
        System.out.print("Inserisci il nome: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci l'età: ");
        int eta = scanner.nextInt();
        scanner.nextLine(); // consuma il ritorno a capo

        if(eta > 18) {
            System.out.print("Inserisci la media voti: ");
            double mediaVoti = scanner.nextDouble();
            scanner.nextLine(); // consuma il ritorno a capo
            System.out.print("Inserisci la classe: ");
            String classe = scanner.nextLine();
            return new Studenti(nome, eta, mediaVoti, classe);
        }
        return new Persona(nome, eta);
    }

    public static void stampaTutti() {
        System.out.println("\n--- Persone ---");
        for(int i = 0; i < personCount; i++) {
            gente[i].saluta();
        }

        System.out.println("\n--- Studenti ---");
        for(int i = 0; i < studentCount; i++) {
            Studenti s = studenti[i];
            s.saluta();
            System.out.println("Classe: " + s.classe());
            System.out.println("Media voti: " + s.getMediaVoti());
        }
    }
}
