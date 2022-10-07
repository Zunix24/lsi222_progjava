package exercice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ds,ex,moy;
        Scanner kb = new Scanner (System.in);
        System.out.println("donner ds et examen");
        ds=kb.nextDouble();
        ex=kb.nextDouble();
        moy=ds*0.4+ex*0.6;
        System.out.println("La moyenne est " + moy);
        kb.close();
    }
}