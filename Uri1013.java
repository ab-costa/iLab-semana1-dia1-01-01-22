import java.util.Scanner;
import java.lang.Math;

public class Uri1013 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c, ab, maior;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        ab = (a + b + Math.abs(a - b)) /2;

        maior = (ab + c + Math.abs(ab - c)) / 2;

        System.out.println(maior + " eh o maior");

        teclado.close();
    }
}