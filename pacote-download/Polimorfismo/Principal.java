public class Principal {

    public static void main(String[] args) {
        
        VeiculoCarga v02 = new VeiculoCarga(1000, "2222 BA", 2022);
        VeiculoPasseio v03 = new VeiculoPasseio(16, "3333 BA", 2022);
        VeiculoPequeno v04 = new VeiculoPequeno("FORD", "4444 BA", 2022);

        System.out.println("Peso Máximo: " + v02.getPesoMax());
        System.out.println("Placa: " + v02.getPlaca());
        System.out.println("Ano de Fabricação: " + v02.getAnoFabricacao());
        System.out.println("Pedágio v02: " + v02.calcPedagio());
        System.out.println();

        System.out.println("Placa: " + v03.getPlaca());
        System.out.println("Ano Fabricação: " + v03.getAnoFabricacao());
        System.out.println("Quantidade Máxima de Passageiros: " + v03.getQtdeMaxPassageiros());
        System.out.println("Pedágio v02: " + v03.calcPedagio());
        System.out.println();

        System.out.println("Modelo: " + v04.getModelo());
        System.out.println("Placa: " + v04.getPlaca());
        System.out.println("Ano Fabricação: " + v04.getAnoFabricacao());
        System.out.println("Pedágio v02: " + v04.calcPedagio());
        System.out.println();

    }
}
