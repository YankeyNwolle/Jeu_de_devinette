import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        System.out.println("BIENVENUE DANS LE JEU DE DEVINETTE");
        Random rand = new Random();
        // +1 pour inclure 100 car nextInt(100) génère entre 0 et 99
        int nombreAleatoire = rand.nextInt(100) + 1;
        int nombre = -1;
        int essaie = 0;
        int essaie_max = 10;
        Scanner sc = new Scanner(System.in);

        while (nombre != nombreAleatoire) {

            // Vérifié avant la saisie pour ne pas demander un essai supplémentaire inutile
            if (essaie_max == 0) {
                System.out.println("Tu as perdu ! Le nombre était : " + nombreAleatoire);
                System.out.println("Nombre d'essais : " + essaie);
                break;
            }

            System.out.println("Devinez un nombre (1-100) : ");

            try {
                nombre = sc.nextInt();

                if (nombre > nombreAleatoire) {
                    System.out.println("Le nombre est plus grand que le nombre généré");
                    essaie++;
                    essaie_max--;
                } else if (nombre < nombreAleatoire) {
                    System.out.println("Le nombre est plus petit que le nombre généré");
                    essaie++;
                    essaie_max--;
                } else {
                    essaie++;
                    System.out.println("Félicitations ! Tu as trouvé le nombre généré en " + essaie + " tentatives");
                }

            } catch (InputMismatchException e) {
                // sc.next() vide le scanner sinon la boucle tourne infiniment sur la mauvaise valeur
                System.out.println("Erreur : veuillez entrer uniquement des chiffres !");
                sc.next();
            }
        }

        sc.close();
    }
}