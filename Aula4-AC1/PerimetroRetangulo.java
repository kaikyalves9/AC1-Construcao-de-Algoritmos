import java.util.Scanner;

public class PerimetroRetangulo {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo do perímetro de um retangulo.");

        // Solicita e recebe o número base do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero da base: ");
        int NumeroBase = scanner.nextInt();

        // Solicita e recebe o número da altura do usuário
        System.out.print("Digite o numero da altura: ");
        int NumeroAltura = scanner.nextInt();

        // Calcula o perimetro do retangulo 
        int resultadoPerimetro = 2 * (NumeroBase + NumeroAltura);

        // Exibe o resultado para o usuário
        System.out.println("O perímetro = " + resultadoPerimetro);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}   
