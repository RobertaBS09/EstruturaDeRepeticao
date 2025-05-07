import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, contador, maior;

        maior =0;
        contador = 1;

        while (contador <= 5) {
            System.out.print("Digite o número: ");
            numero = sc.nextInt();
            if (contador ==1 || numero > maior) {
                maior = numero;
            }
            contador++;


        }
        System.out.println("O maior número é " + maior);
    }
}
