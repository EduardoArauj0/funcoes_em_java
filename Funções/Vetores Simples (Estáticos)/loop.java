

import java.util.Random;
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
    
        Scanner entrada = new Scanner(System.in);
        
        boolean acertou = false;
        while (!acertou) {
    
            System.out.print("Digite um número entre 1 e 100: ");
            int palpite = entrada.nextInt();
    
            if (palpite == numeroSecreto) {
                acertou = true;
                System.out.println("Parabéns! Você acertou ");
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior que o seu palpite.");
            } else {
                System.out.println("O número secreto é menor que o seu palpite.");
            }
        }
    
        entrada.close();
    }
}
    