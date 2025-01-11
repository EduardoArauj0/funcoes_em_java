
public class loja {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;


    public loja(String nomeFantasia, String razaoSocial, String cnpj){

    this.nomeFantasia = nomeFantasia;
    
    if (razaoSocial.equals("")){
        this.razaoSocial = nomeFantasia;
    }
    else {
        this.razaoSocial = razaoSocial;
    }

    this.cnpj = cnpj;

    } 
    public void setnomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
    public void setrazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    public void setcnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public void setvalorFat(double valorFat){
        this.valorFat = valorFat;
    }
    public void setarea(double area){
        this.area = area;
    }
    public void setnomeProprietario(String nomeProprietario){
        this.nomeProprietario = nomeProprietario;
    }

public String getnomeFantasia() {
        return nomeFantasia;
}

public String getrazaoSocial() {
    return razaoSocial;
    }

public String getcnpj() {
    return cnpj;
    }  
    
public double getvalorFat() {
    return valorFat;
    }  

public double getarea() {
    return area;
    } 

public String getnomeProprietario() {
    return nomeProprietario;
    } 
}