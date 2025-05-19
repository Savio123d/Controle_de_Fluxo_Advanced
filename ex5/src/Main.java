import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int op;
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== MENU ======");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Deletar usuário");
        System.out.println("3 - Atualizar usuário");
        System.out.println("4 - Listar usuários");
        System.out.print("Informe um valor de 1 a 4: ");

        try {
            op = scanner.nextInt();
            switch (op) {
                case 1 -> System.out.println("Cadastrado com sucesso.");
                case 2 -> System.out.println("Deletado com sucesso.");
                case 3 -> System.out.println("Usuário atualizado com sucesso.");
                case 4 -> System.out.println("Lista de usuários.");
                default -> System.out.println("Opção inválida.");
            }
        } catch (InputMismatchException erro) {
            System.out.println("Erro: valor digitado não é um número inteiro.");
        }

        scanner.close();
    }
}
