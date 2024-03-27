import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo de celsius para fahrenheit.");

        // Solicita e recebe a temperatura em celsius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em celsius: ");
        int temperaturacelsius = scanner.nextInt();

        // Calcular celsius para fahrenheit 
        int temperaturafahrenheit = temperaturacelsius * 9/5 + 32;

        // Exibe o resultado para o usuário
        System.out.println("A temperatura em fahrenheit é " + temperaturafahrenheit);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}   