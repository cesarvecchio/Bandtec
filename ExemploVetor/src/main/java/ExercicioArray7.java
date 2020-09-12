import java.util.Scanner;

public class ExercicioArray7 {
    public static int[] ordenar(int[] vetor){
        for(int i = 1; i < vetor.length; i++) {
            for(int j = 0; j < i; j++) {
                if (vetor[i] < vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        return vetor;
    }

    public static int[] ordenarDuasListas(int[] vetor1, int[] vetor2){
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            if(i <= 4) {
                vetor[i] = vetor1[i];
            }
            if(i >= 5){
                vetor[i] = vetor2[i - 5];
            }
        }

        return ordenar(vetor);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetorNumero1 = {3, 4, 1, 2, 7};
        int[] vetorNumero2 = {6, 8, 9, 5, 0};
        int[] vetorNumero3 = new int[10];

        for (int i = 0; i < vetorNumero1.length; i++) {
            System.out.print("vetorNumero1[" + i + "] = "
                    + vetorNumero1[i] + " \t");
        }
        System.out.println();

        for (int i = 0; i < vetorNumero2.length; i++) {
            System.out.print("vetorNumero2[" + i + "] = "
                    + vetorNumero2[i] + " \t");
        }
        System.out.println();
        System.out.println();

        vetorNumero1 = ordenar(vetorNumero1);
        vetorNumero2 = ordenar(vetorNumero2);

        for (int i = 0; i < vetorNumero1.length; i++) {
            System.out.print("vetorNumero1[" + i + "] = "
                    + vetorNumero1[i] + " \t");
        }

        System.out.println();

        for (int i = 0; i < vetorNumero2.length; i++) {
            System.out.print("vetorNumero2[" + i + "] = "
                    + vetorNumero2[i] + " \t");
        }


        System.out.println();
        System.out.println();

        vetorNumero3 = ordenarDuasListas(vetorNumero1, vetorNumero2);

        for (int i = 0; i < vetorNumero3.length; i++) {
            System.out.print("vetorNumero3[" + i + "] = "
                    + vetorNumero3[i] + " \t");
        }
    }
}
