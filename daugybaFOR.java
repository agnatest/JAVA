import java.util.*;

public class daugybaFOR {
    public static void main(String[] args) {

        int sk2;
        int daugyba2;

        System.out.println("Daugybos skaičiavimas su FOR ciklu");
        System.out.println("Įveskite skaičių, jį dauginsime nuo 1 iki 10:");
        Scanner S = new Scanner(System.in);
        sk2 = S.nextInt();
        for (int i = 1; i < 11; i++) {
            daugyba2 = sk2 * i;
            System.out.println(sk2 + " * " + i + " = " + daugyba2);
        }

    }
}
