public class VeiculoCarga extends Veiculo {
    
    // Atributo da classe VeiculoCarga
    private int pesoMax;

    // Construtor da classe VeiculoCarga
    public VeiculoCarga (int pesoMax, String Placa, int AnoFabricacao){
        // Chamando o construtor da classe Veiculo
        super(Placa, AnoFabricacao);
        // Inicialização do atributo com o valor passado como parâmetro
        this.pesoMax = pesoMax;
    }

    // Get
    public int getPesoMax(){
        return pesoMax;
    }

    // Set
    public void setPesoMAx(int pesoMax){
        this.pesoMax = pesoMax;
    }

}
