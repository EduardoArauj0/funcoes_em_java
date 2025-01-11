public class Aluno {

    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;

    public Aluno (int matricula, String nome, String curso, int anoIngresso){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
    }

    public int getMatricula(){
        return matricula;
    }

    public String getNome(){
        return nome;
    }

    public String getCurso(){
        return curso;
    }

    public int getAnoIngresso(){
        return anoIngresso;
    }
}