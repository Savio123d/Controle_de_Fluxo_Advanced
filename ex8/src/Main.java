import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String op;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o clima (ensolarado, chuvoso, nublado, neve): ");
        op = scanner.next();

        switch (op) {
            case "ensolarado" -> System.out.println("O dia está ensolarado. Aproveite para sair ao ar livre!");
            case "chuvoso" -> System.out.println("Está chovendo. Melhor ficar em casa e se proteger da chuva.");
            case "nublado" -> System.out.println("O dia está nublado. Fique atento, pode chover a qualquer momento.");
            case "neve" -> System.out.println("Está nevando. Um bom dia para se aquecer com um chocolate quente.");
            default -> System.out.println("Condição climática inválida. Por favor, informe uma opção válida.");
        }
        scanner.close();
    }
}
