public class Principal {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado (4);

        System.out.println("Nome: " + quadrado.getNomeFigura());
        System.out.println("Area: " + quadrado.getArea());
        System.out.println("Perimetro: " + quadrado.getPerimetro());
        System.out.println();

        Retangulo retangulo = new Retangulo(2, 4);

        System.out.println("Nome: " + retangulo.getNomeFigura());
        System.out.println("Area: " + retangulo.getArea());
        System.out.println("Perimetro: " + retangulo.getPerimetro());
        System.out.println();

        Circulo circulo = new Circulo(2);

        System.out.println("Nome: " + circulo.getNomeFigura());
        System.out.println("Area: " + circulo.getArea());
        System.out.println("Perimetro: " + circulo.getPerimetro());
        System.out.println();
    }
}
