import java.util.Scanner;

public class Uri1008 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int numero, horasTrabalhadas;
        double valorDaHoraTrabalhada, salario;

        numero = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorDaHoraTrabalhada = teclado.nextDouble();

        salario = horasTrabalhadas * valorDaHoraTrabalhada;

        System.out.println("NUMBER = " +  numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        teclado.close();
    }
}