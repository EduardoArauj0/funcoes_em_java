public class VeiculoPequeno extends Veiculo {

    // Atributo da classe VeiculoPequeno
    private String modelo;
   
    // Construtor da classe VeiculoPequeno
    public VeiculoPequeno (String modelo, String Placa, int AnoFabricacao){
        // Chamando o construtor da classe Veiculo
        super(Placa, AnoFabricacao);
        // Inicialização do atributo com o valor passado como parâmetro
        this.modelo = modelo;
    }

    // Get
    public String getModelo(){
        return modelo;
    }

    // Set
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
