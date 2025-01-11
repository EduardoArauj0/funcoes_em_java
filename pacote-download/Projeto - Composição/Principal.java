public class Principal {

    public static void main(String[] args) {
        
        Tempo horaInicio = new Tempo(10, 15, 2);
        Tempo horaFim = new Tempo(10, 17, 2);

        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", horaInicio, horaFim);

        System.out.println("Numero Origem :" + lig01.getnumOrigem());
        System.out.println("Numero Destino :" + lig01.getnumDestino());
        System.out.println("Local Origem :" + lig01.getlocalOrigem());
        System.out.println("Local Destino :" + lig01.getlocalDestino());
        System.out.println("Hora Inicio :" + lig01.gethoraInicio());
        System.out.println("Hora FIm :" + lig01.gethoraFim());
        System.out.println("Valor da ligação: R$" + lig01.calcularValor());

    }

}
