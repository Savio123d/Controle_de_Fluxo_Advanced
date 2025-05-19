import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int op;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe um número de (1-7): ");
        try {
            op = scanner.nextInt();
            switch (op) {
                case 1 -> System.out.println("1-Domingo");
                case 2 -> System.out.println("2-Segunda-Feira");
                case 3 -> System.out.println("3-Terça-Feira");
                case 4 -> System.out.println("4-Quarta-Feira");
                case 5 -> System.out.println("5-Quinta-Feira");
                case 6 -> System.out.println("6-Sexta-Feira");
                case 7 -> System.out.println("7-Sábado");
                default -> System.out.println("Dia inválido!");
            }
        } catch (InputMismatchException erro) {
            System.out.println("Erro: valor digitado não é um número inteiro.");
        }
        scanner.close();
    }
}
