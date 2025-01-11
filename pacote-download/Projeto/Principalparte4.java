public class Principalparte4 {
    public static void main(String[] args) {
        
        Aluno aluno01 = new Aluno (111, "Jose", "Sistema da Informação", 2019, 0, "Não Matriculado");

        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano de Ingresso : " + aluno01.getAnoIngresso());
        System.out.println("Quantidade de Disciplinas : " + aluno01.getQtdeDisciplinas());
        System.out.println("Situação : " + aluno01.getSituacao());

        System.out.println();
        
        Aluno aluno02 = new Aluno(222, "Maria", "Ciência da Computação", 2019, 1, "Matriculado");

        System.out.println("Matricula : " + aluno02.getMatricula());
        System.out.println("Nome : " + aluno02.getNome());
        System.out.println("Curso : " + aluno02.getCurso());
        System.out.println("Ano de Ingresso : " + aluno02.getAnoIngresso());
        System.out.println("Quantidade de Disciplinas : " + aluno02.getQtdeDisciplinas());
        System.out.println("Situação : " + aluno02.getSituacao());
    }
}
    class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplinas;
    private String situacao;

    Aluno (int pMatricula, String pNome, String pCurso, int pAnoIngresso, int pQtdeDisciplinas, String pSituacao){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
        qtdeDisciplinas = pQtdeDisciplinas;
        situacao = pSituacao;
        }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    public int getAnoIngresso(){
        return anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getQtdeDisciplinas(){
        return qtdeDisciplinas;
    }
    public void setQtdeDisciplinas(int qtdeDisciplinas) {
        this.qtdeDisciplinas = qtdeDisciplinas;
    }

    public String getSituacao(){
        return situacao;
    }
    public void setSituacao(String situacao){
        this.situacao = situacao;
    }
}
