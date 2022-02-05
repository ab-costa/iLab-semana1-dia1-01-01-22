import java.util.Scanner;
import java.lang.Math;

public class Uri1015 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double x1, y1, x2, y2, raiz;

        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();

        raiz = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.printf("%.4f\n", raiz);

        teclado.close();
    }
}