import java.util.Scanner;

public class Programa07 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double nota;
        int cont = 0;
        double soma = 0;
        double media = 0;
        
        System.out.println("Informe uma nota ou -1 pata interromper");
        nota = entrada.nextDouble();

        
        while (nota != -1)
        {
            soma = soma + nota;
            cont++;    
           
            System.out.println("Informe PROXIMA nota ou -1 pata interromper");
            nota = entrada.nextDouble();
        }
        
        if (cont > 0)
        {
          media = soma/cont;
        }
        else
        {
            System.out.println("Não tivemos notas");
        }
        
        System.out.println("A media foi :" + media);
        
        if (media >= 7)
            System.out.println("Status: Aprovado");
        else
            System.out.println("Status: Reprovado");    
               
    entrada.close();

    }

} 
