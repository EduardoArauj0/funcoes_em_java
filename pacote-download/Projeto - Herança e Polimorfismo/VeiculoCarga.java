public class VeiculoCarga extends Veiculo {

    private int pesoMax;

    public VeiculoCarga (int pesoMax, String Placa, int AnoFabricacao){
        super(Placa, AnoFabricacao);
        this.pesoMax = pesoMax;
    }

    public int getPesoMax(){
        return pesoMax;
    }

    public void setPesoMAx(int pesoMax){
        this.pesoMax = pesoMax;
    }

    @Override
    public double calcPedagio(){
        super.TaxaPedagio = 2.0;
        return super.TaxaPedagio * this.pesoMax;
    }
}
