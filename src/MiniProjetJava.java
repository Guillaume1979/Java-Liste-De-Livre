import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MiniProjetJava {

    public static void main(String[] args) {
        //Création de la collection en ajoutant des données manuellement pour faciliter l'utilisation du programme et en particulier la commande 4-Afficher les détails
        //on peut bien évidement ajouter les fichiers par saisie mais avec un risque d'erreur
        ArrayList<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("./source-livres/Smith/Smith-Richesse_des_Nations_1.txt");
        listOfBooks.add("./source-livres/Smith/Smith-Richesse_des_Nations_2.txt");
        listOfBooks.add("./source-livres/Smith/Smith-Richesse_des_Nations_3.txt");
        listOfBooks.add("./source-livres/Smith/Smith-Richesse_des_Nations_4.txt");
        listOfBooks.add("./source-livres/Smith/Smith-Richesse_des_Nations_5.txt");
        listOfBooks.add("./source-livres/Spinoza/Spinoza-Traite_Politique.txt");
        listOfBooks.add("./source-livres/Spinoza/Spinoza-Reforme.txt");
        listOfBooks.add("./source-livres/Spinoza/Spinoza-Ethique.txt");
        //ouverture du scanner de saisie par appel de la classe Scanner
        Scanner sc = new Scanner(System.in);
        //Appel à la classe Menu
        Menu.menuDisplay(listOfBooks, sc);

    }
}
