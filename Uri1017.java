import java.util.Scanner;

public class Uri1017 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int consumo, tempo, velocidade;
        float litros;

        consumo = 12;

        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();

        litros = (float) (tempo * velocidade) / consumo;

        System.out.printf("%.3f\n", litros);

        teclado.close();
    }
}