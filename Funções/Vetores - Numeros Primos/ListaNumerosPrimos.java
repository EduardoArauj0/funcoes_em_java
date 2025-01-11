
public class ListaNumerosPrimos {

        public static void main(String[] args) {

            int total = 100;

            int[] lista = new int[total];
    
            int contPrimos = 0;
        
                for (int numero = 2; numero <= total; numero++) {
                    int divisorEncontrado = 0;
        
                    for (int divisor = 2; divisor * divisor <= numero; divisor++) {
                        if (numero % divisor == 0) {
                            divisorEncontrado = 1;
                        }
                    }
        
                    if (divisorEncontrado == 0) {
                        lista[contPrimos++] = numero;
                    }
                }
        
                System.out.println("Números primos entre 1 e " + total);
                for (int i = 0; i < contPrimos; i++) {
                    System.out.print(lista[i] + " ");
                }
            }
        }
