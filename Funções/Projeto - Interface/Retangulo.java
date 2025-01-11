public class Retangulo implements FiguraGeometrica {

    private double altura;
    private double largura;

    public Retangulo (double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }


    public double getaltura(){
        return altura;
    }
    public double getlargura(){
        return largura;
    }


    public void setaltura(double altura){
        this.altura = altura;
    }    
    public void setlargura(double largura){
        this.largura = largura;
    }

    @Override
    public String getNomeFigura() {
        return "Retangulo";
    }

    @Override
    public double getArea(){
        return this.altura * this.largura;
    }

    @Override
    public double getPerimetro() {
        return (this.altura * 2) + (this.largura * 2);
    }
}

