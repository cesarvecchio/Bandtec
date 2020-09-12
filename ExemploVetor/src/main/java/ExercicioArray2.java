import java.util.Scanner;

public class ExercicioArray2 {
    public static void pesquisarNome(String[] vetor, String nome) {
        String texto = "Nome não encontrado";

        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i].equals(nome)){
                texto = "Nome encontrado no índice " + (i + 1);
                break;

            }
        }
        System.out.println(texto);
    }
    public static void main(String[] args) {
        String[] vetor = new String[10];
        Scanner leitor = new Scanner(System.in);
        String nome;

        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um nome para a posição " + (i + 1) + " do vetor");
            vetor[i] = leitor.next();
        }

        System.out.println("Digite um nome");
        nome = leitor.next();

        pesquisarNome(vetor, nome);
    }
}
