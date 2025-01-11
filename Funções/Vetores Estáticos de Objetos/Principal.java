import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno[] listaAlunos = new Aluno[3];

        for (int i = 0; i < listaAlunos.length; i++) {
            System.out.println("Cadastro de Aluno " + (i + 1));
        
            System.out.print("Informe a matrícula: ");
            int matricula = entrada.nextInt();

            System.out.print("Informe o nome: ");
            String nome = entrada.next();

            System.out.print("Informe o curso: ");
            String curso = entrada.next();

            System.out.print("Informe o ano de ingresso: ");
            int anoIngresso = entrada.nextInt();

            listaAlunos[i] = new Aluno(matricula, nome, curso, anoIngresso);
        }

        System.out.println("Listando os Alunos Cadastrados: ");

        for (Aluno aluno : listaAlunos) {
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());
        }

        entrada.close();
    }
}
