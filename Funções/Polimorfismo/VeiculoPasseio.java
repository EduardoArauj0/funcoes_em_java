public class VeiculoPasseio extends Veiculo {
    
    private int qtdeMaxPassageiros;

    public VeiculoPasseio (int qtdeMaxPassageiros, String Placa, int AnoFabricacao){
        super(Placa, AnoFabricacao);
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }

    public int getQtdeMaxPassageiros(){
        return qtdeMaxPassageiros;
    }

    public void setQtdeMaxPassageiros(int qtdeMaxPassageiros){
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }

    @Override
    public double calcPedagio(){
        super.TaxaPedagio = 5.0;
        return super.TaxaPedagio * this.qtdeMaxPassageiros;
    }
}
