package oop.reverse;

public class ReverserSlow implements Reverser {
    @Override
    public String reverse(String stringa) {
        char[] revstr=new char[stringa.length()];
        for (int i = 0,j=stringa.length()-1; i < stringa.length(); i++,j--) {
            revstr[i]=stringa.charAt(j);
        }
        return String.valueOf(revstr); //fa diventare revstr in stringa
    }

    public static void main(String[] args) {

        Reverser r= new ReverserSlow();
        r.reverse("!dlroW olleH");

    }
}
