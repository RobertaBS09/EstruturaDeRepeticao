import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num, cont=1;
        double fat=1;

        System.out.print("Digite o número para fazer o fatorial --> ");
        num=sc.nextInt();


        while  ( cont<=num){

            fat=fat * cont;

            cont++;




        }
        System.out.println(fat);
    }
}
