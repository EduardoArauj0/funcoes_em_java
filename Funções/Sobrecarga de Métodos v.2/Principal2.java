public class Principal2 {

        public static void main(String[] args) {
       
        loja2 loja01 = new loja2("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        loja2 loja02 = new loja2("Mercadão do Povo", "", "10101010");
        loja2 loja03 = new loja2("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        
        loja01.setvalorFat(10000);
        loja02.setvalorFat(20000);
        loja03.setvalorFat(10000);

        
        System.out.println(" ****** Teste 1 ********");
        if ( loja01.getnomeFantasia() == loja03.getnomeFantasia() ){
        System.out.println("Lojas Iguais");
        }
        else {
        System.out.println("Lojas Diferentes");
        }

        System.out.println(" ****** Teste 2 ********");
        if ( loja01.getnomeFantasia().equals(loja03.getnomeFantasia()) ){
        System.out.println("Lojas Iguais");
        }
        else {
        System.out.println("Lojas Diferentes");
        }
       
        System.out.println(" ****** Teste 3 ********");
        if ( loja01 == loja03 ){
        System.out.println("Lojas Iguais");
        }
        else {
        System.out.println("Lojas Diferentes");
        }
       
        System.out.println(" ****** Teste 4 ********");
        if ( loja01.equals(loja03) ){
        System.out.println("Lojas Iguais");
        }
        else {
        System.out.println("Lojas Diferentes");
        }

        System.out.println(" ****** Teste 5 ********");
        if ( loja01.getvalorFat() == loja03.getvalorFat() ){
        System.out.println("Faturamentos Iguais");
        }
        else {
        System.out.println("Faturamentos Diferentes");
        }
    }
}
