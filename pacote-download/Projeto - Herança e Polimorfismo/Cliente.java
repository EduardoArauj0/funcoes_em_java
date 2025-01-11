public class Cliente {

    private String cpf_cnpj;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private Veiculo veiculo;

    public Cliente (String cpf_cnpj, String nome, String endereco, String email, String telefone, Veiculo veiculo){
        this.cpf_cnpj = cpf_cnpj;
        this.email = email;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.veiculo = veiculo;
    }

    public String getcpf_cnpj() {
        return cpf_cnpj;
    }

    public String getnome() {
        return nome;
    }

    public String getendereco(){
        return endereco;
    }

    public String getemail(){
        return email;
    }

    public String gettelefone(){
        return telefone;
    }

    public Veiculo getveiculo(){
        return veiculo;
    }


    public void setcpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setendereco(String endereco){
        this.endereco = endereco;
    }

    public void setemail(String email){
        this.email = email;
    }

    public void settelefone(String telefone){
        this.telefone = telefone;
    }

    public void setveiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
}
