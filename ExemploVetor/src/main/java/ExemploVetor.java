import java.util.Scanner;

public class ExemploVetor {

    public static void exibeVetor(int[] v) {
        System.out.println("Elementos do vetor");

        for(int i = 0; i < v.length; i++) {
            System.out.print("Vetor[" + i + "] = " + v[i] + "\t");
        }
        System.out.println();
    }

    public static void somaVetor(int[] v) {
        int soma = 0;

        for(int i : v){
            soma += i;
        }

        System.out.println("A soma dos valores desse vetor é: " + soma);
    }

    public static void qtdParesVetor(int[] v) {
        int cont = 0;

        for(int i : v){
            if(i%2 == 0){
                cont ++;
            }
        }

        System.out.println("Esse vetor possui " + cont + " numeros pares");
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        int[] vet2 = {100, 200, 300, 400, 500, 600, 700};

        String[] vet3 = new String[4];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 10;
        }
//
//        exibeVetor(vetor);
//
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.println("Digite o valor de vetor[" + i + "]");
//            vetor[i] = leitor.nextInt();
//        }
//
//        exibeVetor(vetor);
//
//        exibeVetor(vet2);
//
//        for (int i = 0; i < vet3.length; i++) {
//            System.out.println("Digite o valor de vet3[" + i + "]");
//            vet3[i] = leitor.next();
//        }
//
//        for(String s : vet3) {
//            System.out.print(s + "\t");
//        }
//        System.out.println();

//        String[] vet4 = {"domingo", "segunda", "terça",
//                "quarta", "quinta", "sexta", "sabado"};
//        int number;
//        boolean valido = false;
//
//        System.out.println("Digite um numero de 1 a 7");
//        do{
//            number = leitor.nextInt();
//
//            if(number >= 1 && number <= 7) {
//                valido = true;
//            } else {
//                valido = false;
//                System.out.println("Numero invalido.");
//                System.out.println("Digite um numero novamente");
//            }
//        } while(!valido);
//
//        System.out.println(vet4[number - 1]);
//
//        somaVetor(vetor);
//
//        qtdParesVetor(vetor);

        int[] vet5;

        int tamanho;

        System.out.println("DIgite o tamanho do vetor vet5 (maior do qur 1)");
        tamanho = leitor.nextInt();
        while (tamanho <= 2) {
            System.out.println("Tamanho invalido. Digite novamente: ");
            tamanho = leitor.nextInt();
        }

        vet5 = new int[tamanho];

        for(int i = 0; i < vet5.length; i++) {
            System.out.println("Digite o valor de vet5[" + i + "]");
            vet5[i] = leitor.nextInt();
        }

        exibeVetor(vet5);
    }
}
