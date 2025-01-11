public class Circulo implements FiguraGeometrica {
   
    private double raio;
    
    public Circulo (double raio){
        this.raio = raio;
    }

    public double getraio (){
        return raio;
    }

    public void setraio(double raio){
        this.raio = raio;
    }

    @Override
    public String getNomeFigura() {
        return "Circulo";
    }

    @Override
    
    public double getArea(){
        return (this.raio * this.raio) * 3.14;
    }

    @Override
    public double getPerimetro() {
        return 2 * 3.14 * this.raio;
    }
}
