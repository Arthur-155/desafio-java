import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int escolha, escolhaMatricula,subEscolha;
        int escolhaEditar;
        Aluno novoAluno = new Aluno();


        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Editar Aluno");
        System.out.println("3 - Listar Alunos");
        System.out.println("4 - Sair");
        escolha = scanner.nextInt();
        switch(escolha){
            case 1:

                novoAluno.setNome("Arthur");
                novoAluno.setNota(7.8);
                novoAluno.setMatricula("Matriculado");
                System.out.println("O aluno está fazendo Graduação ou pós Graduação");
                System.out.println("1 - Graduação");
                System.out.println("2 - Pós Graduação");
                escolhaMatricula = scanner.nextInt();
                switch(escolhaMatricula){
                    case 1:
                        System.out.println(novoAluno.getNome());
                        System.out.println(novoAluno.getMatricula());
                        System.out.println(novoAluno.getNota());
                        System.out.println("Aluno fazendo graduação!");
                        System.out.println("Cadastro realizado!");
                        break;
                    case 2:
                        System.out.println(novoAluno.getNome());
                        System.out.println(novoAluno.getMatricula());
                        System.out.println("Aluno fazendo pós graduação!");
                        System.out.println("O aluno tem ensino médio ?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        subEscolha = scanner.nextInt();
                        switch(subEscolha){
                            case 1:
                                System.out.println("Cadastro realizado!");
                                break;
                            case 2:
                                System.out.println("Impossível realizar cadastro, graduação incompleta!");
                                break;
                        }

                }
            case 2:
                Scanner novoScanner = new Scanner(System.in);
                System.out.println("Deseja editar aluno ?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                subEscolha = scanner.nextInt();
                switch(subEscolha){
                    case 1:
                        System.out.println("O que você deseja editar ?");
                        System.out.println("1 - Editar nota");
                        System.out.println("2 - Editar nome do aluno");
                        System.out.println("3 - Editar matricula");
                        escolhaEditar = novoScanner.nextInt();
                        switch(escolhaEditar){
                            case 1:
                                System.out.println("Qual nova nota do aluno ?");
                                double novaNota = novoAluno.setNota(novoScanner.nextDouble());
                        }
                }

        }


    }
}