public class Ligacao {   

    private    String numOrigem;
    private    String numDestino;
    private    String localOrigem;
    private    String localDestino;
    private    String horaInicio;
    private    String horaFim;

    public void encerrarLigacao(String horaFim){

    }
    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino,  String horaInicio){

        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = "";
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
    public String gethoraInicio(){
        return horaInicio;
    } 
    public String gethoraFim(){
        return horaFim;
    }
}
