import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Candidato> candidatos = new ArrayList();

        candidatos.add(new Candidato("Ana", 8.5));
        candidatos.add(new Candidato("João", 6.3));
        candidatos.add(new Candidato("Maria", 7.8));
        candidatos.add(new Candidato("Pedro", 5.4));
        candidatos.add(new Candidato("Lucas", 9.1));
        candidatos.add(new Candidato("Mariana", 4.7));
        candidatos.add(new Candidato("Carla", 7.2));
        candidatos.add(new Candidato("Rafael", 6.0));
        candidatos.add(new Candidato("Bruna", 8.9));
        candidatos.add(new Candidato("Felipe", 3.5));
        candidatos.add(new Candidato("Juliana", 7.6));
        candidatos.add(new Candidato("Tiago", 2.8));
        candidatos.add(new Candidato("Larissa", 9.0));
        candidatos.add(new Candidato("Carlos", 5.9));
        candidatos.add(new Candidato("Amanda", 7.1));
        candidatos.add(new Candidato("Gustavo", 8.3));
        candidatos.add(new Candidato("Camila", 4.4));
        candidatos.add(new Candidato("Rodrigo", 6.7));
        candidatos.add(new Candidato("Isabela", 7.4));
        candidatos.add(new Candidato("Diego", 8.0));
        candidatos.add(new Candidato("Patrícia", 6.2));
        candidatos.add(new Candidato("Eduardo", 7.7));
        candidatos.add(new Candidato("Fernanda", 9.3));
        candidatos.add(new Candidato("Marcelo", 4.8));
        candidatos.add(new Candidato("Sabrina", 7.0));
        candidatos.add(new Candidato("André", 5.6));
        candidatos.add(new Candidato("Vanessa", 8.1));
        candidatos.add(new Candidato("Bruno", 6.9));
        candidatos.add(new Candidato("Letícia", 7.5));
        candidatos.add(new Candidato("César", 3.9));
        for (Candidato f : candidatos )
            if (f.nota < 7 ){
                continue;
            }else{
                System.out.println("Nome: " + f.nome + ",nota: "+ f.nota);
            }

    }
}