import java.util.Scanner;

public class ExercicioArray6 {
    public static void diaDoAno(int dia, int mes){
        int diaAno = 0;

        if (mes == 1 && dia > 0 && dia <= 31) {
            diaAno = dia;

        } else if (mes == 2 && dia > 0 && dia <= 28) {
            diaAno = dia + 31;

        } else if (mes == 3 && dia > 0 && dia <= 31) {
            diaAno = dia + 58;

        } else if (mes == 4 && dia > 0 && dia <= 30) {
            diaAno = dia + 90;

        } else if (mes == 5 && dia > 0 && dia <= 31) {
            diaAno = dia + 120;

        } else if (mes == 6 && dia > 0 && dia <= 30) {
            diaAno = dia + 151;

        } else if (mes == 7 && dia > 0 && dia <= 31) {
            diaAno = dia + 181;

        } else if (mes == 8 && dia > 0 && dia <= 30) {
            diaAno = dia + 212;

        } else if (mes == 9 && dia > 0 && dia <= 31) {
            diaAno = dia + 243;

        } else if (mes == 10 && dia > 0 && dia <= 30) {
            diaAno = dia + 273;

        } else if (mes == 11 && dia > 0 && dia <= 31) {
            diaAno = dia + 304;

        } else if (mes == 12 && dia > 0 && dia <= 30) {
            diaAno = dia + 334;

        }
        System.out.println("O dia " + dia + "/" + mes +
                " corresponde ao dia " + diaAno + " do ano");
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dia, mes;

        System.out.println("Digite um dia");
        dia = leitor.nextInt();

        System.out.println("Digite um mes");
        mes = leitor.nextInt();

        diaDoAno(dia, mes);
    }
}
