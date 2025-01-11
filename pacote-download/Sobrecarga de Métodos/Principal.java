
public class Principal {
    
public static void main(String[] args) {

        loja loja01 = new loja("Minha Loja","Loja","555");
        loja01.setvalorFat(55);
        loja01.setarea(32);
        loja01.setnomeProprietario("Eu");

        loja loja02 = new loja("Mercadão do Povo", "", "10101010");


        System.out.println("Nome Fantasia : " + loja01.getnomeFantasia());
        System.out.println("Razao Social : " + loja01.getrazaoSocial());
        System.out.println("CNPJ : " + loja01.getcnpj());
        System.out.println("Valor Fat : " + loja01.getvalorFat());
        System.out.println("Area : " + loja01.getarea());
        System.out.println("Area : " + loja01.getnomeProprietario());

        System.out.println(" ");

        System.out.println("Nome Fantasia : " + loja02.getnomeFantasia());
        System.out.println("Razao Social : " + loja02.getrazaoSocial());
        System.out.println("CNPJ : " + loja02.getcnpj());
    
    }
}
