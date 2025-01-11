import java.util.Scanner;

public class Programa09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorNotas = new int[5];
        int contNotasValidas = 0;

        while (contNotasValidas < 5) {
            System.out.println("Informe uma nota (entre 0 e 10): ");
            int nota = entrada.nextInt();

            if (nota >= 0 && nota <= 10) {
                vetorNotas[contNotasValidas] = nota;
                contNotasValidas++;
            } else {
                System.out.println("Nota inválida! Digite novamente.");
            }
        }

        System.out.println("Notas Válidas Armazenadas:");
        for (int cont = 0; cont < 5; cont++) {
            System.out.println("Nota " + (cont + 1) + ": " + vetorNotas[cont]);
        }

        entrada.close();
    } 
}