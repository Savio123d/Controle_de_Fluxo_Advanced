import java.util.InputMismatchException;
import java.util.Scanner;

//que merda que eu fiz nesse codigo ?


public class Main {
    public static void main(String[] args) {

        int[] vet = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o valor da posição %d: ", i + 1);
            try {
                vet[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro: valor digitado não é um número inteiro.");
                scanner.next();
                i--;
            }
        }
        System.out.println("Valores ímpares informados:");

        for (int i = 0; i < 10; i++) {
            if (vet[i] % 2 == 0)
                continue;
            System.out.println("Valor ímpar: " + vet[i]);
        }
    }
}