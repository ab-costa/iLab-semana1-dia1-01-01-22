import java.util.Scanner;

public class Uri1002 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double raio;

        raio = teclado.nextDouble();

        System.out.printf("A=%.4f\n", 3.14159 * raio * raio);

        teclado.close();
    }
}