import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordsList {
    // comptage du nombre de mots
    public static int nbOfWord(String fileName) throws FileNotFoundException {

        HashMap<String, Integer> wordCollec = new HashMap<String, Integer>();

        Scanner sc = new Scanner(new File(fileName));

        for (int i = 0; sc.hasNextLine(); i++) {
            String word = sc.nextLine();
            if (wordCollec.containsKey(word)) {
                int timeNb = wordCollec.get(word);
                timeNb++;
                wordCollec.put(word, timeNb);
            } else {
                wordCollec.put(word, 1);
            }
        }

        sc.close();
        return wordCollec.size();
    }

    // comptage du nombre de lignes
    public static int nbOfLine(String fileName) throws FileNotFoundException {

        ArrayList<String> lines = new ArrayList<>();

        Scanner sc = new Scanner(new File(fileName));
        for (int i = 0; sc.hasNextLine(); i++) {
            lines.add(sc.nextLine());
        }

        sc.close();
        return lines.size();
    }


}
