public class Principal3 {
    public static void main(String[] args) {
       
        loja3 loja01 = new loja3 ("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        loja3 loja02 = new loja3 ("Mercadão do Povo", "", "10101010");
        loja3 loja03 = new loja3 ("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        
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

System.out.println("");

        System.out.println(" ****** Comparação com método estático ******** ");
        loja3.compararFat_static(loja01, loja02);

        System.out.println(" ****** Comparação com método NÃO estático ********");
        loja01.compararFat_naoStatic(loja02);

        System.out.println(" ****** Comparação com método NÃO estático ********");
        loja02.compararFat_naoStatic(loja01);
    }
}

