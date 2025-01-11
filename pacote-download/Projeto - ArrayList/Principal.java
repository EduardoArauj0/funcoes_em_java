import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        
        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidadeAlunos = entrada.nextInt();

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Cadastro de Aluno " + (i + 1));
        
            System.out.print("Informe a matrícula: ");
            int matricula = entrada.nextInt();

            System.out.print("Informe o nome: ");
            String nome = entrada.next();

            System.out.print("Informe o curso: ");
            String curso = entrada.next();

            System.out.print("Informe o ano de ingresso: ");
            int anoIngresso = entrada.nextInt();

            Aluno aluno = new Aluno(matricula, nome, curso, anoIngresso);

            System.out.print("Quantas disciplinas deseja adicionar para este aluno? ");
            int quantidadeDisciplinas = entrada.nextInt();

            for (int j = 0; j < quantidadeDisciplinas; j++) {
                System.out.print("Informe o nome da disciplina " + (j + 1) + ": ");
                String disciplina = entrada.next();
                aluno.adicionarDisciplina(disciplina);
            }

            listaAlunos.add(aluno);
        }

        System.out.println("Listando os Alunos Cadastrados: ");

        for (Aluno aluno : listaAlunos) {
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());
            System.out.println("Disciplinas: " + aluno.getListaDisciplinas());
            System.out.println();
        }

        entrada.close();
    }
}
