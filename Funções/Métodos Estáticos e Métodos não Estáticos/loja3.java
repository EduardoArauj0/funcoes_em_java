public class loja3 {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;

    public loja3(String nomeFantasia, String razaoSocial, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public loja3(String nomeFantasia, String cnpj) {
        this(nomeFantasia, nomeFantasia, cnpj);
    }

    public void setnomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setrazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setcnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setvalorFat(double valorFat) {
        this.valorFat = valorFat;
    }

    public void setarea(double area) {
        this.area = area;
    }

    public void setnomeProprietario(String nomeProprietorio) {
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

    public static void compararFat_static(loja3 loja01, loja3 loja02) {
        if (loja01.getvalorFat() > loja02.getvalorFat()) {
            System.out.println("Loja de Maior Fat: " + loja01.nomeFantasia);
        } else {
            System.out.println("Loja de Maior Fat: " + loja02.nomeFantasia);
        }
    }

    public void compararFat_naoStatic(loja3 loja02) {
        if (this.getvalorFat() > loja02.getvalorFat()) {
            System.out.println("Loja de Maior Fat: " + this.nomeFantasia);
        } else {
            System.out.println("Loja de Maior Fat: " + loja02.nomeFantasia);
        }
    }
}
