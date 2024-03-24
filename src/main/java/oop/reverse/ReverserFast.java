package oop.reverse;

public class ReverserFast implements Reverser{
    @Override
    public String reverse(String stringa) {
        StringBuilder s=new StringBuilder(stringa);
        return s.reverse().toString();
    }
}
