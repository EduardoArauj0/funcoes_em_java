public class Principal {

    public static void main(String[] args) {
        
        VeiculoPasseio veiculo = new VeiculoPasseio(4, "1111 BA", 2022);
        
        Cliente cliente = new Cliente("123456789", "Eduardo", "Rua 33", "****@gmail.com", "7191234-5678", veiculo);
        Cliente cliente2 = new Cliente("987654321", "Andre", "Rua 44", "*****@gmail.com", "7199876-5432", new VeiculoPasseio(6,"2222 BA", 2022));
        Cliente cliente3 = new Cliente("111111111", "Reus", "Rua 55", "*****@gmail.com", "7191111-1111", new VeiculoPasseio(2,"3333 BA", 2022));

        System.out.println("Placa: " + cliente.getveiculo().getPlaca());
        System.out.println("Ano de Fabricação: " + cliente.getveiculo().getAnoFabricacao());
        System.out.println("Pedágio : " + cliente.getveiculo().calcPedagio());
        System.out.println();

        System.out.println("Placa: " + cliente2.getveiculo().getPlaca());
        System.out.println("Ano de Fabricação: " + cliente2.getveiculo().getAnoFabricacao());
        System.out.println("Pedágio : " + cliente2.getveiculo().calcPedagio());
        System.out.println();

        System.out.println("Placa: " + cliente3.getveiculo().getPlaca());
        System.out.println("Ano de Fabricação: " + cliente3.getveiculo().getAnoFabricacao());
        System.out.println("Pedágio : " + cliente3.getveiculo().calcPedagio());
        System.out.println();
    }
}
