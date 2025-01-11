public class Principal {

    public static void main(String[] args) {
        
       // Instanciando um objeto da classe com os parâmetros
        VeiculoCarga v02 = new VeiculoCarga(1000, "2222 BA", 2022);
        VeiculoPasseio v03 = new VeiculoPasseio(16, "3333 BA", 2022);
        VeiculoPequeno v04 = new VeiculoPequeno("FORD", "4444 BA", 2022);

        // Imprimindo informações sobre o veículo de carga
        System.out.println("Peso Máximo: " + v02.getPesoMax());
        System.out.println("Placa: " + v02.getPlaca());
        System.out.println("Ano de Fabricação: " + v02.getAnoFabricacao());
        System.out.println();
       
        // Imprimindo informações sobre o veículo de passeio
        System.out.println("Placa: " + v03.getPlaca());
        System.out.println("Ano Fabricação: " + v03.getAnoFabricacao());
        System.out.println("Quantidade Máxima de Passageiros: " + v03.getQtdeMaxPassageiros());
        System.out.println();
       
        // Imprimindo informações sobre o veículo pequeno
        System.out.println("Modelo: " + v04.getModelo());
        System.out.println("Placa: " + v04.getPlaca());
        System.out.println("Ano Fabricação: " + v04.getAnoFabricacao());
        System.out.println();
    }
}
