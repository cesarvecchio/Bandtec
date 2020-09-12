import java.util.Scanner;

public class ExercicioArray4 {
    public static void qtdVezes(int[] vetor, int numero){
        int qtd = 0;

        for(int v : vetor) {
            if(v == numero) {
                qtd++;
            }
        }
        System.out.println("O numero " + numero + " ocorre " + qtd + " vezes");
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        int numero;

        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor para a posição " + (i + 1) + " do vetor");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Digite um numero");
        numero = leitor.nextInt();

        qtdVezes(vetor, numero);
    }
}
