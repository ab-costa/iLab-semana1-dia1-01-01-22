import java.util.Scanner;

public class Uri1019 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int tempo, hora, minuto, segundo, controle;
        
        tempo = teclado.nextInt();

        hora = tempo / 3600;
        controle = tempo % 3600;
        minuto = controle / 60;
        controle %= 60;
        segundo = controle;

        System.out.println(hora + ":" + minuto + ":" + segundo);

        teclado.close();
    }
}