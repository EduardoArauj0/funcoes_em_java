import java.util.Scanner;

public class Programa02 { 

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu nome");
        String nome = entrada.nextLine();

        System.out.println("Informe sua idade");
        int idade = entrada.nextInt();

        System.out.println("Nome Informado : " + nome);
        System.out.println("Idade Informado : " + idade);

        entrada.close();
    }
}
