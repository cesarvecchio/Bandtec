import java.util.Scanner;

public class ExercicioArray5 {
    public static void carroMenorConsumo(String[] vetorCarro, double[] vetorConsumo) {
        int posicao = 0;
        double consumo = 0;

        for(int i = 0; i < vetorConsumo.length; i ++) {
            if(consumo == 0) {
                consumo = vetorConsumo[i];
                posicao = i;
            }

            if(consumo > vetorConsumo[i]) {
                consumo = vetorConsumo[i];
                posicao = i;
            }
        }
        System.out.println("O carro mais economico é o "
                + vetorCarro[posicao] +
                " com " + vetorConsumo[posicao] +
                " quilometros por litro");
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] vetorCarro = new String[5];
        double[] vetorConsumo = new double[5];

        for(int i = 0; i < vetorCarro.length; i++) {
            System.out.println("Digite um modelo de carro para a posição " + (i + 1) + " do vetor");
            vetorCarro[i] = leitor.next();
        }

        for(int i = 0; i < vetorCarro.length; i++) {
            System.out.println("Digite o consumo por litro do " + vetorCarro[i]);
            vetorConsumo[i] = leitor.nextDouble();
        }

        carroMenorConsumo(vetorCarro, vetorConsumo);
    }
}
