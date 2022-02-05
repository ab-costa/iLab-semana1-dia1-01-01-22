import java.util.Scanner;

public class Uri1014 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x;
        float y, consumo;

        x = teclado.nextInt();
        y = teclado.nextFloat();

        consumo = x / y;

        System.out.printf("%.3f km/l\n", consumo);

        teclado.close();
    }
}