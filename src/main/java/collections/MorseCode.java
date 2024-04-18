package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    public static Map<Character,String> Morsecode()
    {
        Map<Character, String> alfmorse = new HashMap<>();
        // Aggiungi le associazioni per le lettere maiuscole
        alfmorse.put('A', "._");
        alfmorse.put('B', "_...");
        alfmorse.put('C', "_._.");
        alfmorse.put('D', "_..");
        alfmorse.put('E', ".");
        alfmorse.put('F', ".._.");
        alfmorse.put('G', "__.");
        alfmorse.put('H', "....");
        alfmorse.put('I', "..");
        alfmorse.put('J', ".___");
        alfmorse.put('K', "_._");
        alfmorse.put('L', "._..");
        alfmorse.put('M', "__");
        alfmorse.put('N', "_.");
        alfmorse.put('O', "___");
        alfmorse.put('P', ".__.");
        alfmorse.put('Q', "__._");
        alfmorse.put('R', "._.");
        alfmorse.put('S', "...");
        alfmorse.put('T', "_");
        alfmorse.put('U', ".._");
        alfmorse.put('V', "..._");
        alfmorse.put('W', ".__");
        alfmorse.put('X', "_.._");
        alfmorse.put('Y', "_.__");
        alfmorse.put('Z', "__..");
        // Aggiungi le associazioni per le lettere minuscole
        alfmorse.put('a', "._");
        alfmorse.put('b', "_...");
        alfmorse.put('c', "_._.");
        alfmorse.put('d', "_..");
        alfmorse.put('e', ".");
        alfmorse.put('f', ".._.");
        alfmorse.put('g', "__.");
        alfmorse.put('h', "....");
        alfmorse.put('i', "..");
        alfmorse.put('j', ".___");
        alfmorse.put('k', "_._");
        alfmorse.put('l', "._..");
        alfmorse.put('m', "__");
        alfmorse.put('n', "_.");
        alfmorse.put('o', "___");
        alfmorse.put('p', ".__.");
        alfmorse.put('q', "__._");
        alfmorse.put('r', "._.");
        alfmorse.put('s', "...");
        alfmorse.put('t', "_");
        alfmorse.put('u', ".._");
        alfmorse.put('v', "..._");
        alfmorse.put('w', ".__");
        alfmorse.put('x', "_.._");
        alfmorse.put('y', "_.__");
        alfmorse.put('z', "__..");
        return alfmorse;

    }
    public static boolean Controllword(String word)
    {
        StringBuilder w=new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            if(!Character.isLetter(w.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }
    public static String morseCode(String string)
    {
        if(Controllword(string))
        {
            throw new IllegalArgumentException("String not correct");
        }

        Map<Character,String> Morse=Morsecode();
        StringBuilder wordMors=new StringBuilder();
        StringBuilder wordArr=new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            wordMors.append(Morse.get(wordArr.charAt(i)));
            if(i+1>=string.length()){break;}
            wordMors.append(" ");
        }
        return wordMors.toString();
    }


}
