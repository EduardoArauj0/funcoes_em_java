public class Ligacao {   

    private    String numOrigem;
    private    String numDestino;
    private    String localOrigem;
    private    String localDestino;
    private    Tempo horaInicio;
    private    Tempo horaFim;

    public void encerrarLigacao(Tempo horaFim) {
        this.horaFim = horaFim;
    }
    
    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horaInicio){

        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null;
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
}