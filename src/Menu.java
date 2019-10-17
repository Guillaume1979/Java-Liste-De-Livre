
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {


    public static void menuDisplay(ArrayList listOfBooks2, Scanner sc) {


        // Affichage du menu qui propose les choix
        System.out.println("1-Lister les fichiers\n2-Ajouter un fichier\n3-Supprimer un fichier\n4-Afficher des informations sur un livre\n5-Quitter le programme");
        System.out.println("Choix :");

        try {

            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 1:
                    //int sizeArray = listOfBooks2.size();
                    for (int i = 0; i != listOfBooks2.size(); i++) {
                        //Affichage de la liste avec une numérotation qui commence à 1 et pas 0 (plus logique pour l'utilisateur)
                        System.out.println("Livre " + (i + 1) + " : " + listOfBooks2.get(i));
                    }
                    System.out.println();
                    menuDisplay(listOfBooks2, sc);
                    break;
                case 2:

                    System.out.println("Saisir le nom du fichier à ajouter :");
                    String item = sc.nextLine();
                    listOfBooks2.add(item);
                    System.out.println("Yeah Baby !!! Tu as ajouté le fichier " + "\"" + listOfBooks2.get(listOfBooks2.indexOf(item)) + "\"");
                    System.out.println();
                    menuDisplay(listOfBooks2, sc);
                    break;
                //case 2bis: numérotation à revoir
                case 3:
                    System.out.println("Saisir le numéro du fichier à supprimer dans la liste suivante :");

                    for (int i = 0; i != listOfBooks2.size(); i++) {
                        System.out.println((i + 1) + " " + listOfBooks2.get(i));
                    }
                    System.out.println("Numéro =");
                    try {
                        int itemSupr = sc.nextInt();
                        System.out.println("Tu as viré le livre " + "\"" + listOfBooks2.get(itemSupr - 1) + "\"");
                        System.out.println();
                        listOfBooks2.remove(itemSupr - 1);
                        menuDisplay(listOfBooks2, sc);
                        break;
                    } catch (Exception e) {
                        System.out.println("Erreur de saisie");
                        System.out.println();
                        menuDisplay(listOfBooks2, sc);
                        break;
                    }

                case 4:
                    subChoice4(listOfBooks2);
                    break;

                case 5:
                    System.out.println("Tu me quittes déjà ? Dommage, j'te kiffais ;)");
                    break;

                default:
                    System.out.println("Choix non valide. Merci de faire un autre choix");
                    System.out.println();
                    menuDisplay(listOfBooks2, sc);
            }


        } catch (InputMismatchException | FileNotFoundException e) {
            System.out.println("Hey coco !! Choix non valide. T'es gentil, tu fais un autre choix");
            System.out.println();
            Scanner sc2 = new Scanner(System.in);
            menuDisplay(listOfBooks2, sc2);

        }

    }

    public static void subChoice4(ArrayList listOfBooks3) throws FileNotFoundException {

        System.out.println("//  Détail d'un livre  //");
        System.out.println();


        Scanner sc = new Scanner(System.in);
        System.out.println("Sélectionner un livre dans la liste ci-dessous :");
        for (int i = 0; i != listOfBooks3.size(); i++) {
            System.out.println((i + 1) + " " + listOfBooks3.get(i));
        }
        System.out.println();
        System.out.println("Numéro du livre choisi ? :");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Livre sélectionné : " + listOfBooks3.get(choice - 1));
        System.out.println("Que souhaites-tu faire à présent ?");
        System.out.println("1-Afficher le nombre de ligne du livre choisi\n2-Afficher le nombre de mots du livre choisi'\n3-Revenir au menu");
        int selection = sc.nextInt();
        sc.nextLine();

        switch (selection) {
            case 1:
                System.out.println("Ce livre comporte " + WordsList.nbOfLine(listOfBooks3.get(choice - 1).toString()) + " lignes");
                System.out.println();
                subChoice4(listOfBooks3);
                break;

            case 2:
                System.out.println("Ce livre compte " + WordsList.nbOfWord(listOfBooks3.get(choice - 1).toString()) + " mots différents");
                System.out.println();
                subChoice4(listOfBooks3);
                break;

            case 3:
                menuDisplay(listOfBooks3, sc);
                break;

            default:
                System.out.println("Choix non valide. Merci de faire un autre choix");
                System.out.println();
                subChoice4(listOfBooks3);
        }

    }
}

