import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MiniProjetJava {

    public static void main(String[] args) {
        ArrayList<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("./source-livres/Smith/Smith-Richesse_des_Nations_1.txt");
        listOfBooks.add("./source-livres/Smith/Smith-Richesse_des_Nations_2.txt");
        listOfBooks.add("./source-livres/Smith/Smith-Richesse_des_Nations_3.txt");
        listOfBooks.add("./source-livres/Smith/Smith-Richesse_des_Nations_4.txt");
        listOfBooks.add("./source-livres/Smith/Smith-Richesse_des_Nations_5.txt");
        listOfBooks.add("./source-livres/Spinoza/Spinoza-Traite_Politique.txt");
        listOfBooks.add("./source-livres/Spinoza/Spinoza-Reforme.txt");
        listOfBooks.add("./source-livres/Spinoza/Spinoza-Ethique.txt");
        Scanner sc = new Scanner(System.in);
        Menu.menuDisplay(listOfBooks, sc);

    }
}
