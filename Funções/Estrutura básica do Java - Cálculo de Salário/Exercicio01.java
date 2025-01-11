public class Exercicio01 {
        public static void main(String[] args) {
            
            double sb = 2500.0; 
            int hex = 10; 
    
           
            double sbhora = sb / 160.0; 
            int totalHTrab = 160 + hex;
            double st = sbhora * totalHTrab;

            System.out.println("Salario total: R$" + st);
        }
    }

