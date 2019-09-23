import java.util.*;

public class salygos {
    public static void main(String[] args) {

        int sk4;
        int daugyba4;

        System.out.println("Daugybos skaičiavimas su FOR ciklu");
        System.out.println("Įveskite skaičių, jį dauginsime nuo 1 iki 10:");
        Scanner S = new Scanner(System.in);
        sk4 = S.nextInt();

        for (int i = 1; i < 11; i++) {
            daugyba4 = sk4 * i;

            if (daugyba4 == 50) {
                System.out.println(sk4 + " * " + i + " = " + daugyba4 + " == 50");
            } else if (daugyba4 > 50) {
                System.out.println(sk4 + " * " + i + " = " + daugyba4 + " > 50");
            } else {
                System.out.println(sk4 + " * " + i + " = " + daugyba4 + " < 50");
            }

        }
    }
}
