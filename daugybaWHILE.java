import java.util.*;

public class daugybaWHILE {
    public static void main(String[] args) {

        int sk3;
        int daugyba3;
        int i = 1;

        System.out.println("Daugybos skaičiavimas su While ciklu");
        System.out.println("Įveskite skaičių, jį dauginsime nuo 1 iki 10:");
        Scanner S = new Scanner(System.in);
        sk3 = S.nextInt();

        while (i < 11) {
            daugyba3 = sk3 * i;
            System.out.println(sk3 + " * " + i + " = " + daugyba3);
            i++;

        }
    }
}
