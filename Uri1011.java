import java.util.Scanner;

public class Uri1011 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double raio, volume;

        raio = teclado.nextDouble();

        volume = (4 * 3.14159 * raio * raio * raio) / 3;

        System.out.printf("VOLUME = %.3f\n", volume);

        teclado.close();
    }
}