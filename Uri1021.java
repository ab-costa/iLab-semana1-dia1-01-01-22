import java.util.Scanner;

public class Uri1021 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int cedulas, moedas, controleCedulas, controleMoedas, c100, c50, c20, c10, c5, c2, m1, m50, m25, m10, m5, m01;
        double valor;
        
        valor = teclado.nextDouble();

        cedulas = (int) valor;
        moedas = (int) ((valor - cedulas) * 100);

        c100 = cedulas / 100;
        controleCedulas = cedulas % 100;
        c50 = controleCedulas / 50;
        controleCedulas %= 50;
        c20 = controleCedulas / 20;
        controleCedulas %= 20;
        c10 = controleCedulas / 10;
        controleCedulas %= 10;
        c5 = controleCedulas / 5;
        controleCedulas %= 5;
        c2 = controleCedulas / 2;
        controleCedulas %= 2;
        m1 = controleCedulas;
        
        m50 = moedas / 50;
        controleMoedas = moedas % 50;
        m25 = controleMoedas / 25;
        controleMoedas %= 25;
        m10 = controleMoedas / 10;
        controleMoedas %= 10;
        m5 = controleMoedas / 5;
        controleMoedas %= 5;
        m01 = controleMoedas;

        System.out.println("NOTAS:");
        System.out.println(c100 + " nota(s) de R$ 100.00");
        System.out.println(c50 + " nota(s) de R$ 50.00");
        System.out.println(c20 + " nota(s) de R$ 20.00");
        System.out.println(c10 + " nota(s) de R$ 10.00");
        System.out.println(c5 + " nota(s) de R$ 5.00");
        System.out.println(c2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m1 + " moeda(s) de R$ 1.00");
        System.out.println(m50 + " moeda(s) de R$ 0.50");
        System.out.println(m25 + " moeda(s) de R$ 0.25");
        System.out.println(m10 + " moeda(s) de R$ 0.10");
        System.out.println(m5 + " moeda(s) de R$ 0.05");
        System.out.println(m01 + " moeda(s) de R$ 0.01");

        teclado.close();
    }
}