package strings;

import java.util.Arrays;

public class DuplicateChars {
    public static char[] duplicateChars(String string)
    {
        StringBuilder strd=new StringBuilder();
        StringBuilder strs=new StringBuilder();
        for (int i = 0; i < string.length(); i++)
        {
            String tmp= String.valueOf(string.charAt(i));//con il valueof ritornimao una striga con un solo carattere
            if(strs.toString().contains(tmp)&&!strd.toString().contains(tmp))
            {
                strd.append(tmp);
                strs.append(tmp);
            }
            else
            {
                strs.append(tmp);
            }
        }
        char[] res=strd.toString().toCharArray();//FACCIAMO DIVETARE STRD DA STRINGA A ARRAY DI CHAR
        Arrays.sort(res);//FACCIAMO L'ORDINAMNETO
        return res;
    }
}
