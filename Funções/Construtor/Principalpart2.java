public class Principalpart2 {
    public static void main(String[] args) {
        
        Aluno aluno01 = new Aluno(111, "Jose","Sistema da Informação",2019 );
        
        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
        System.out.println("Ano de Ingresso : " + aluno01.anoIngresso);

        Aluno aluno02 = new Aluno(222, "Maria", "Ciência da Computação", 2019);

        System.out.println("Matricula : " + aluno02.matricula);
        System.out.println("Nome : " + aluno02.nome);
        System.out.println("Curso : " + aluno02.curso);
        System.out.println("Ano de Ingresso : " + aluno02.anoIngresso);
    }
}
    class Aluno {
        public int matricula;
        public String nome;
        public String curso;
        public int anoIngresso;
        
        Aluno (int pMatricula, String pNome, String pCurso, int pAnoIngresso){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
        }
    }
