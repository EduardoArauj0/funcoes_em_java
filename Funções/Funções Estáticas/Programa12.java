import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sb, gi, sr;
    
        System.out.println("Informe o Sálario Base : ");
        sb = entrada.nextDouble();
        gi = Programa12.calcGi(sb);
        sr = sb + gi;
    
        System.out.println("Sálario a receber :" + sr);
    
        entrada.close();
    }
    
    public static double calcGi(double sb) {
        double grat = sb * 5 / 100;
        double imp = sb * 7 / 100;

        return grat - imp;
    }
}
