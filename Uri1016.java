import java.util.Scanner;
import java.lang.Math;

public class Uri1016 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int distancia, minutos, vx, vy, tempo;

        vx = 60;
        vy = 90;

        distancia = teclado.nextInt();

        tempo = (distancia * 60) / (vy - vx);

        System.out.println(tempo + " minutos");

        teclado.close();
    }
}