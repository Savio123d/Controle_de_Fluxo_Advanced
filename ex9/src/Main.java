import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Arroz", 8));
        produtos.add(new Produto("Feijão", 6));
        produtos.add(new Produto("Açúcar", 7));
        produtos.add(new Produto("Farinha", 5));
        produtos.add(new Produto("Macarrão", 9));
        produtos.add(new Produto("Óleo", 4));
        produtos.add(new Produto("Sal", 7));
        produtos.add(new Produto("Café", 6));
        produtos.add(new Produto("Leite", 8));
        produtos.add(new Produto("Pão", 3));
        produtos.add(new Produto("Manteiga", 7));
        produtos.add(new Produto("Queijo", 2));
        produtos.add(new Produto("Presunto", 9));
        produtos.add(new Produto("Frango", 5));
        produtos.add(new Produto("Carne", 7));
        produtos.add(new Produto("Peixe", 8));
        produtos.add(new Produto("Ovos", 4));
        produtos.add(new Produto("Refrigerante", 6));
        produtos.add(new Produto("Suco", 7));
        produtos.add(new Produto("Biscoito", 8));
        produtos.add(new Produto("Chocolate", 6));
        produtos.add(new Produto("Cerveja", 7));
        produtos.add(new Produto("Vinho", 9));
        produtos.add(new Produto("Salada", 4));
        produtos.add(new Produto("Tomate", 7));
        produtos.add(new Produto("Cebola", 5));
        produtos.add(new Produto("Alface", 8));
        produtos.add(new Produto("Batata", 6));
        produtos.add(new Produto("Cenoura", 7));
        produtos.add(new Produto("Maçã", 3));
        int cont = 1;
        for (Produto f : produtos ){
            if (f.quantidadeP <  5 ) {
                System.out.println("Estoque crítico encontrado!");
                System.out.print("Nome: " + f.nomeP + ", Quantidade: " + f.quantidadeP + ", Posição: " + cont);
                break;
            }
            cont++;
        }


    }
}