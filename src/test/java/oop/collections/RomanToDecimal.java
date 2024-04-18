package oop.collections;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {
    public static Map<Character,Integer> Roman()
    {
        Map<Character,Integer> Rom=new HashMap<>();
        Rom.put('I',1);
        Rom.put('V',5);
        Rom.put('X',10);
        Rom.put('L',50);
        Rom.put('C',100);
        Rom.put('D',500);
        Rom.put('M',1000);
        return Rom;
    }

    public static int romanToDecimal(String s) {
        int num = 0;
        Map<Character, Integer> map = Roman();
        for (int i = 0; i < s.length(); i++) {
            if (Character.compare(s.charAt(i), 'I') == 0) {
                if (i==s.length()-1 || (Character.compare(s.charAt(i + 1), 'V') != 0 && Character.compare(s.charAt(i + 1), 'X') != 0)) {
                    num = num + map.get('I');
                } else
                {
                    num = num - map.get('I');
                }
            }
            if (Character.compare(s.charAt(i), 'X') == 0) {
                if (i==s.length()-1 || (Character.compare(s.charAt(i + 1), 'L') != 0 && Character.compare(s.charAt(i + 1), 'C') != 0)) {
                    num = num + map.get('X');
                } else {
                    num = num - map.get('X');
                }
            }


            if (Character.compare(s.charAt(i), 'C') == 0) {
                if (i==s.length()-1 || (Character.compare(s.charAt(i + 1), 'D') != 0 && Character.compare(s.charAt(i + 1), 'M') != 0)) {
                    num = num + map.get('C');
                } else {
                    num = num - map.get('C');
                }

            }

            if (Character.compare(s.charAt(i), 'I') != 0 && Character.compare(s.charAt(i), 'X') != 0 && Character.compare(s.charAt(i), 'C') != 0  ) {
                num=num+map.get(s.charAt(i));
                }

        }
        return num;
    }



}


