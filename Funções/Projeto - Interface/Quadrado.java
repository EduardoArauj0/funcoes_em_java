public class Quadrado implements FiguraGeometrica {

    private double lado;

    public Quadrado (double lado){
        this.lado = lado;
    }

    public double getlado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getArea(){
        return this.lado*this.lado;
    }

    @Override
    public double getPerimetro() {
        return this.lado * 4;
    }
}
