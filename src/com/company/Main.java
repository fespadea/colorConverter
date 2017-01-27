package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("What are you entering? (triplet (255 65 4), hexa (f23ab2), html (Blue)");
        Scanner type = new Scanner(System.in);
        String typer = type.next();
        System.out.println("Do it then.");
        if(typer.equals("triplet")){
            int [] nums = {type.nextInt(),type.nextInt(),type.nextInt()};
            tripletToHexa.tripletToHexa(nums[0],nums[1],nums[2]);
            tripletToHTML.tripletToHTML(nums[0],nums[1],nums[2]);
        }
        if(typer.equals("hexa")){
            String pi = type.next();
            hexaToTriplet.hexaToTriplet(pi.split(""));
            hexaToHTML.hexaToHTML(pi);
        }
        if(typer.equals("html")){
            String pi = type.next();
            HTMLToTriplet.HTMLToTriplet(pi);
            HTMLToHexa.HTMLToHexa(pi);
        }
    }
}
