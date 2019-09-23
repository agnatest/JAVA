import java.util.*;

public class zenkluivedimas {
    public static void main(String[] args) {
        double sk5;
        double daugyba5;
        double dalyba;
        String eilute;

        System.out.println("Daugybos lentelė");
        System.out.println("Įveskite skaičių:");
        Scanner S = new Scanner(System.in);
        sk5 = S.nextInt();
        System.out.println("Įveskite daugybos * arba dalybos simbolį /:");
        Scanner E = new Scanner(System.in);
        eilute = E.next();

        if (eilute.equals("*")) {
            for (int i = 1; i < 12; i++) {
                daugyba5 = sk5 * i;
                if (daugyba5 == 50) {
                    System.out.println(sk5 + " * " + i + " = " + daugyba5 + " == 50");
                } else if (daugyba5 > 50) {
                    System.out.println(sk5 + " * " + i + " = " + daugyba5 + " > 50");
                } else {
                    System.out.println(sk5 + " * " + i + " = " + daugyba5 + " < 50");
                }
            }
        } else if (eilute.equals("/")) {
            for (int i = 1; i < 11; i++) {
                dalyba = sk5 / i;
                if (dalyba == 50) {
                    System.out.println(sk5 + " / " + i + " = " + dalyba + " == 50");
                } else if (dalyba > 50) {
                    System.out.println(sk5 + " / " + i + " = " + dalyba + " > 50");
                } else {
                    System.out.println(sk5 + " / " + i + " = " + dalyba + " < 50");
                }
            }
        } else {
            System.out.println("Blogai įvedėte simbolį.");
        }
    }
}

