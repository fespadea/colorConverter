package com.company;

/**
 * Created by fs279 on 1/23/17.
 */
public class tripletToHexa {
    public static String[] hexa = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
    static public void tripletToHexa(int f, int s, int t){
        int ff = f/16;
        int sf = f%16;
        int fs = s/16;
        int ss = s%16;
        int ft = t/16;
        int st = t%16;
        System.out.println(hexa[ff] + hexa[sf] + hexa[fs] + hexa[ss] + hexa[ft] + hexa[st]);
    }
}
