import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int termo,cont,z;
        int x=1;
        int y=1;

        System.out.print("Digiite a quantidade de termos-->");
        termo =sc.nextInt();

        if (termo==1){
            System.out.println(x);
        }
        else if (termo==2){
            System.out.println(x + " " + y);
        }
        else {
            System.out.println(x+ " " + y);
            cont=3;
            while (cont<=termo){
                z=x+y;
                System.out.println(z+ " ");
                x=y;
                y=z;
                cont++;
            }
        }
    }
}
