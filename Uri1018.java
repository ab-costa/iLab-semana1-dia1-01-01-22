import java.util.Scanner;

public class Uri1018 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int n, c100, c50, c20, c10, c5, c2, c1, controle;
        
        n = teclado.nextInt();

        c100 = n / 100;
        controle = n % 100;
        c50 = controle / 50;
        controle %= 50;
        c20 = controle / 20;
        controle %= 20;
        c10 = controle / 10;
        controle %= 10;
        c5 = controle / 5;
        controle %= 5;
        c2 = controle / 2;
        controle %= 2;

        System.out.println(n);
        System.out.println(c100 + " nota(s) de R$ 100,00");
        System.out.println(c50 + " nota(s) de R$ 50,00");
        System.out.println(c20 + " nota(s) de R$ 20,00");
        System.out.println(c10 + " nota(s) de R$ 10,00");
        System.out.println(c5 + " nota(s) de R$ 5,00");
        System.out.println(c2 + " nota(s) de R$ 2,00");
        System.out.println(controle + " nota(s) de R$ 1,00");

        teclado.close();
    }
}