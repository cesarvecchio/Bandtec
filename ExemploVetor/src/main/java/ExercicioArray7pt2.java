import java.util.Arrays;
import java.util.Scanner;

public class ExercicioArray7pt2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetorNumero1 = {3, 4, 1, 2, 7};
        int[] vetorNumero2 = {6, 8, 9, 5, 0};
        int[] vetorNumero3 = new int[10];

        for (int i = 0; i < vetorNumero1.length; i++) {
            System.out.print("vetorNumero1[" + i + "] = "
                    +vetorNumero1[i] + " \t");
        }
        System.out.println();

        for (int i = 0; i < vetorNumero2.length; i++) {
            System.out.print("vetorNumero2[" + i + "] = "
                    +vetorNumero2[i] + " \t");
        }
        System.out.println();

        Arrays.sort(vetorNumero1);
        Arrays.sort(vetorNumero2);

        System.out.println();
        for (int i = 0; i < vetorNumero1.length; i++) {
            System.out.print("vetorNumero1[" + i + "] = "
                    +vetorNumero1[i] + " \t");
        }
        for (int i = 0; i < vetorNumero2.length; i++) {
            System.out.print("vetorNumero2[" + i + "] = "
                    +vetorNumero2[i] + " \t");
        }

        for (int i = 0; i < vetorNumero3.length; i++) {
            if(i < 5) {
                vetorNumero3[i] = vetorNumero1[i];
            }
            if(i > 4){
                vetorNumero3[i] = vetorNumero2[i - 5];
            }
        }

        System.out.println();
        System.out.println();

        Arrays.sort(vetorNumero3);

        for (int i = 0; i < vetorNumero3.length; i++) {
            System.out.print("vetorNumero3[" + i + "] = "
                    +vetorNumero3[i] + " \t");
        }


    }
}
