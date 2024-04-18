package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class WordAfterWord {
    public static int indexnextword(ArrayList<String> lib,String word)
    {
        int index=0;
        for (int i = 0; i < lib.size(); i++) {
            if(word.compareTo(lib.get(i))==0)
            {
                index=i+1;
                break;
            }
        }
        return index;
    }
    public static String wordAfterWord(String filename, String word) throws IOException
    {
        String libro = getLines(filename).toString().toLowerCase();
        TreeSet<String> lib= new TreeSet<>(lineToWords(libro));
        ArrayList<String> liba= new ArrayList<>(lib);
        int index=WordAfterWord.indexnextword(liba,word);
        return liba.get(index);
    }
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }


}
