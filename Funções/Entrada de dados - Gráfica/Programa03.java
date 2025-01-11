import javax.swing.JOptionPane;

public class Programa03 {
    public static void main(String[] args) {

        System.out.println("Infomre o seu nome");

        String nome = JOptionPane.showInputDialog("Informe seu nome");
        System.out.println("Nome informado : " + nome);

        String strIdade = JOptionPane.showInputDialog("Infomre sua idade ");
        int idade = Integer.parseInt(strIdade);
        System.out.println("Idade informada :" + idade);

        
    }    

}
