public abstract class  Veiculo {

    private String Placa;
    private int AnoFabricacao;
    protected double TaxaPedagio = 6.0;

    public Veiculo (String Placa, int AnoFabricacao){
        this.Placa = Placa;
        this.AnoFabricacao = AnoFabricacao;
    }

    public String getPlaca(){
        return Placa;
    }

    public int getAnoFabricacao(){
        return AnoFabricacao;
    }

    public void setPlaca(String Placa){
        this.Placa = Placa;
    }

    public void setAnoFabricacao(int AnoFabricacao){
        this.AnoFabricacao = AnoFabricacao;
    }

    public double calcPedagio(){
        return this.TaxaPedagio;
    }
}
