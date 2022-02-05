import java.util.Scanner;

public class Uri1009 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        double salarioFixo, totalDeVendas, salarioTotal;
        double comissao = 0.15;

        nome = teclado.nextLine();
        salarioFixo = teclado.nextDouble();
        totalDeVendas = teclado.nextDouble();

        salarioTotal = salarioFixo + comissao * totalDeVendas;

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        teclado.close();
    }
}