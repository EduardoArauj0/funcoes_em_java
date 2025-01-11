public class VeiculoPasseio extends Veiculo {
    
    // Atributo da classe VeiculoPasseio
    private int qtdeMaxPassageiros;

    // Construtor da classe VeiculoPasseio
    public VeiculoPasseio (int qtdeMaxPassageiros, String Placa, int AnoFabricacao){
        // Chamando o construtor da classe Veiculo
        super(Placa, AnoFabricacao);
        // Inicialização do atributo com o valor passado como parâmetro
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }

    // Get
    public int getQtdeMaxPassageiros(){
        return qtdeMaxPassageiros;
    }

    // Set
    public void setQtdeMaxPassageiros(int qtdeMaxPassageiros){
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }

}
