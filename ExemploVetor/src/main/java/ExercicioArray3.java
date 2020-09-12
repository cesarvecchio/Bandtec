import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExercicioArray3 {
    public static void somarVetor(int[] vetor){
        int total = 0;

        for (int v : vetor){
            total += v;
        }

        System.out.println("Soma total dos valores no vetor: " + total);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor para a posição " + (i + 1) + " do vetor");
            vetor[i] = leitor.nextInt();
        }

        somarVetor(vetor);
    }
}
