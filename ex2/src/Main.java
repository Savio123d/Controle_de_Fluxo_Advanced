import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String op;
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU:");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar saldo");
        System.out.print("Escolha a operação (1-3): ");

        op = scanner.next();

        switch (op) {
            case "1" -> System.out.println("Dinheiro sacado.");
            case "2" -> System.out.println("Dinheiro depositado.");
            case "3" -> System.out.println("Saldo de R$ 120,22.");
            default -> System.out.println("Operação inválida.");
        }
        scanner.close();
    }
}
