import java.util.*;

public class salyga100 {
    public static void main(String[] args) {

        int sk6;
        int daugyba6;

        System.out.println("Daugybos skaičiavimas kol rezultatas neviršija 100");
        System.out.println("Įveskite skaičių:");
        Scanner S = new Scanner(System.in);
        sk6 = S.nextInt();

        for (int i = 1; i < 200; i++) {
            {
                daugyba6 = sk6 * i;
                if (daugyba6 == 100) {
                    System.out.println(sk6 + " * " + i + " = " + daugyba6 + " == 100");
                } else if (daugyba6 < 100) {
                    System.out.println(sk6 + " * " + i + " = " + daugyba6 + " < 100");
                } else {
                    break;
                }
            }
        }
    }
}