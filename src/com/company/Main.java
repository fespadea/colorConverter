package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("What are you entering? (triplet (255 65 4), hexa (f23ab2), html (blue)");
        Scanner type = new Scanner(System.in);
        String typer = type.next();
        System.out.println("Do it then.");
        if(typer.equals("triplet")){
            tripletToHexa.tripletToHexa(type.nextInt(),type.nextInt(),type.nextInt());
        }
    }
}
