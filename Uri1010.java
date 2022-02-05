import java.util.Scanner;

public class Uri1010 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int codigoPecaUm, codigoPecaDois, numeroPecasUm, numeroPecasDois;
        double valorPecaUm, valorPecaDois, total;

        codigoPecaUm = teclado.nextInt();
        numeroPecasUm = teclado.nextInt();
        valorPecaUm = teclado.nextDouble();
        codigoPecaDois = teclado.nextInt();
        numeroPecasDois = teclado.nextInt();
        valorPecaDois = teclado.nextDouble();

        total = numeroPecasUm * valorPecaUm + numeroPecasDois * valorPecaDois;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        teclado.close();
    }
}