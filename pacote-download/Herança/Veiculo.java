public abstract class  Veiculo {

    // Atributos da classe Veiculo
    private String Placa;
    private int AnoFabricacao;

    // Construtor da classe Veiculo
    public Veiculo (String Placa, int AnoFabricacao){
        // Inicialização dos atributos com os valores passados como parâmetros
        this.Placa = Placa;
        this.AnoFabricacao = AnoFabricacao;
    }

    // Get
    public String getPlaca(){
        return Placa;
    }

    public int getAnoFabricacao(){
        return AnoFabricacao;
    }

    // Set
    public void setPlaca(String Placa){
        this.Placa = Placa;
    }

    public void setAnoFabricacao(int AnoFabricacao){
        this.AnoFabricacao = AnoFabricacao;
    }
}
