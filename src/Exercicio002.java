import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, resultado, contador;
        int resposta = 1;
        contador = 0;

        while (resposta == 1) {
            System.out.print("Digite um valor para a taboada:");
            valor = sc.nextInt();
            contador=0;
            while (contador <= 10) {
                resultado = valor * contador;
                System.out.println(valor + "*" + contador + "=" + resultado);
                contador++;

            }
            System.out.println("Você deseja uma nova taboada? 1=Sim e 0=não");
            resposta= sc.nextInt();

        }

    }
}
