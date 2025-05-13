import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int contador,valor,maior;

        maior=0;
        contador=1;

        while (contador <=15){
            System.out.println("Digiite um Valor --->");
            valor=sc.nextInt();
            if (contador ==1 || valor > maior) {
                maior = valor;
            }
            contador++;



        } System.out.println("O maior número é " + maior);
    }
}
