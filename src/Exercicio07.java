import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int dependente,contribuintes;
        double rendamensal,salariomin,IR,desconto;
        String CPF;
        System.out.println("Digite o numero de contribuintes-->");
        contribuintes=sc.nextInt();
        System.out.println("Salario mínimo atual-->");
        salariomin=sc.nextDouble();
         while(contribuintes>=1){
            System.out.println("Digite o CPF--->");
            CPF=sc.next();
            System.out.println("Digite o numero de dependentes-->");
            dependente=sc.nextInt();
            System.out.print("Digite a renda mensal -->R$ ");
            rendamensal= sc.nextDouble();

            desconto=salariomin* (0.05*dependente);
            rendamensal=rendamensal-desconto;
            if (rendamensal<=2 * salariomin){
                IR=0;
            } else if (rendamensal<=3 * salariomin) {
                IR=rendamensal*5/100;
            } else if (rendamensal<=5*salariomin) {
                IR= rendamensal *10/100;
            } else if (rendamensal<=7*salariomin) {
                IR= rendamensal *15/100;
            }
            else{
                IR=rendamensal*20/100;
            }
             System.out.println("IR= R$ "+IR);
             contribuintes --;
        }




    }
}
