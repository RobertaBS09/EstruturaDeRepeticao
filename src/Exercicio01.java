import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1, v2;

        System.out.println("Digite o primeiro valor:");
        v1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        v2 = sc.nextInt();

        if (v2 > v1) {
            while (v2 >= v1) {

                System.out.println(v1);
                v1 = v1 + 1;


            }
        } else {
            System.out.println("O valor 2 não é maior que o valor 1.");
        }
    }
}
