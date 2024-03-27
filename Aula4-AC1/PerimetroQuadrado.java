import java.util.Scanner;

public class PerimetroQuadrado {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo do perímetro de um quadrado.");

        // Solicita e recebe o número do lado do quadrado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero do lado: ");
        int Numerolado = scanner.nextInt();

        // Calcula o perimetro do quadrado 
        int resultadoPerimetro = 4 * Numerolado;

        // Exibe o resultado para o usuário
        System.out.println("O perímetro do quadrado = " + resultadoPerimetro);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}   