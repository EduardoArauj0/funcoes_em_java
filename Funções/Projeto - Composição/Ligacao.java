public class Ligacao {   

    private    String numOrigem;
    private    String numDestino;
    private    String localOrigem;
    private    String localDestino;
    private    Tempo horaInicio;
    private    Tempo horaFim;

    public boolean verificarNumero(String numero) {
        return numero.equals(numOrigem) || numero.equals(numDestino);
    }
    
    public void encerrarLigacao(Tempo horaFim) {
        this.horaFim = horaFim;
    }
    
    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horaInicio,  Tempo horaFim){

        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public String getnumOrigem(){
        return numOrigem;
    }
    public String getnumDestino(){
        return numDestino;
    }     
    public String getlocalOrigem(){
        return localOrigem;
    }
    public String getlocalDestino(){
        return localDestino;
    }
    public Tempo gethoraInicio(){
        return horaInicio;
    } 
    public Tempo gethoraFim(){
        return horaFim;
    }
    public double calcularValor() {
        if (horaFim == null) {
            return 0;
        } 
        else {
            int duracaoSegundos = calcularDuracaoSegundos();
            
            if (duracaoSegundos >= 20 && duracaoSegundos <= 60) {
                return 1.0; 
            } 
            else {
                int duracaoMinutos = duracaoSegundos / 60;
                return duracaoMinutos * 1.0; 
            }
        }
    }

    private int calcularDuracaoSegundos() {
        return (horaFim.getHora() - horaInicio.getHora()) * 3600 + (horaFim.getMinuto() - horaInicio.getMinuto()) * 60 + (horaFim.getSegundo() - horaInicio.getSegundo());
    }
}
