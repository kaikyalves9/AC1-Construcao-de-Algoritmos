import java.util.Scanner;
import java.lang.Math;

public class RaizCubica {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo de raiz cubica.");

        // Solicita e recebe a raiz cubica do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        double numero = scanner.nextDouble();

        // Calcula a raiz cuica
        double resultadoNumero = Math.cbrt(numero);
          

        // Exibe o resultado para o usuário
        System.out.println("A raiz cubica é " + resultadoNumero);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}