import java.util.Scanner;

public class Uri1020 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int idadeEmDias, anos, meses, dias, controle;
        
        idadeEmDias = teclado.nextInt();

        anos = idadeEmDias / 365;
        controle = idadeEmDias % 365;
        meses = controle / 30;
        controle %= 30;
        dias = controle;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        teclado.close();
    }
}