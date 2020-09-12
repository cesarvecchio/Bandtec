import java.util.Scanner;

public class ExercicioArray {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[7];

        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor para a posição " + (i + 1) + " do vetor");
            vetor[i] = leitor.nextInt();
        }

        for(int i = vetor.length - 1; i >= 0; i--) {
            System.out.print("Vetor[" + i + "] = " + vetor[i] + "; \t");
        }
        System.out.println();

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor[" + i + "] = " + vetor[i] + "; \t");
        }
    }
}
