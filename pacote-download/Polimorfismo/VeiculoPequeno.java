public class VeiculoPequeno extends Veiculo {

    private String modelo;

    public VeiculoPequeno (String modelo, String Placa, int AnoFabricacao){
        super(Placa, AnoFabricacao);
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
