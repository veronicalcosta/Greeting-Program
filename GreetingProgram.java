import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Cria um scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Exibe uma mensagem de saudação
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a) ao mundo Java.");

        // Fecha o scanner
        scanner.close();
    }
}
