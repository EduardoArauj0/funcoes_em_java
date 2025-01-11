public class loja2 {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;

    public loja2(String nomeFantasia, String razaoSocial, String cnpj){
       this.nomeFantasia = nomeFantasia;
       this.razaoSocial = razaoSocial;
       this.cnpj = cnpj;
     }
    
    public loja2(String nomeFantasia, String cnpj){
   
    this(nomeFantasia, nomeFantasia, cnpj);

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
