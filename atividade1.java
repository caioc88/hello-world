import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!!\n"); 
        System.out.println("\nAtividade Teste de Tópicos Especiais!!\n");
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("\nOlá, " + nome + "! Bem-vindo(a) ao GitHub. Esta é apenas uma atividade teste!! Obrigado!");
    }
}
