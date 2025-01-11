import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sb, grat, imp, sr;
    
        System.out.println("Informe o Sálario Base : ");
        sb = entrada.nextDouble();
        imp =  Programa11.calcImp(sb);
        grat = Programa11.calcGrat(sb);
        sr = sb + grat - imp;
    
        System.out.println("Sálario a receber :" + sr);
    
        entrada.close();
    }
    
    public static double calcGrat(double sb)
    {
        return sb*5/100;
    }
    public static double calcImp(double sb)
    {
        return sb*7/100;
    }
}
