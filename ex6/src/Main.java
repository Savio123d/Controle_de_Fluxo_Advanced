public class Main {
    public static void main(String[] args) {

        int[] vet = {4, 8, 2, 23, 42, 9, 3, 15, 27, 31, 6, 0, 15, 7, 12, 13, 19, 21, 2, 15, 8, 7, 6, 4, 3, 9, 15, 10, 11, 1};

        for (int i = 0; i < 30; i++) {
            if (vet[i] == 15) {
                System.out.println("Número 15 encontrado na posição: " + i);
                break;
            }
        }
    }
}
