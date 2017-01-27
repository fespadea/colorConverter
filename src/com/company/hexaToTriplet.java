package com.company;

/**
 * Created by fespa on 1/26/2017.
 */
public class hexaToTriplet {
    public static String[] hexa = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
    public static void hexaToTriplet(String [] hex){
        int x = 0;
        int [] ans = new int[6];
        for (String pip: hex) {
            int y = 0;
            for (String pi : hexa) {
                if (pip.equals(pi)) {
                    ans[x] = y;
                    x++;
                }
                y++;
            }
        }
        System.out.print(ans[0]*16+ans[1] + " ");
        System.out.print(ans[2]*16+ans[3] + " ");
        System.out.println(ans[4]*16+ans[5]);
    }
}
