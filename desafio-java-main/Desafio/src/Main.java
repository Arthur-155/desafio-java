import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int escolha, escolhaMatricula,subEscolha,escolhaEditar;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno>novoAluno = new ArrayList<>();


        while(true){
            System.out.println("====MENU:====\n");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Editar Aluno");
            System.out.println("3 - Listar Alunos");
            System.out.println("4 - Sair");
            escolha = scanner.nextInt();
            scanner.nextLine();
            switch(escolha){
                case 1:
                    Aluno novoAlunos = new Aluno();
                    System.out.println("Qual o nome do aluno: ");
                    String nome = scanner.nextLine();
                    novoAlunos.setNome(nome);

                    System.out.println("O aluno tem ensino médio ?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    subEscolha = scanner.nextInt();
                    scanner.nextLine();
                    switch(subEscolha){
                        case 1:
                            System.out.println("Aluno com ensino Médio!");
                            break;
                        case 2:
                            System.out.println("Impossível realizar cadastro, graduação incompleta!");
                            break;
                    }

                    System.out.println("Qual a nota do aluno: ");
                    double nota = scanner.nextDouble();
                    scanner.nextLine();
                    novoAlunos.setNota(nota);

                    System.out.println("O aluno está matriculado? ");
                    System.out.println("1- Sim");
                    System.out.println("2- Não");
                    subEscolha = scanner.nextInt();
                    switch(subEscolha){
                        case 1:
                            String Matriculado = "Matriculado";
                            break;
                        case 2:
                            String naoMatriculado = "Não está matriculado";
                            System.out.println("Matricule primeiro, depois faça o cadastro");
                            System.exit(0);
                    }
                    novoAlunos.setMatricula("Matriculado");
                    System.out.println("O aluno está fazendo Graduação ou pós Graduação");
                    System.out.println("1 - Graduação");
                    System.out.println("2 - Pós Graduação");
                    escolhaMatricula = scanner.nextInt();
                    scanner.nextLine();
                    switch(escolhaMatricula){
                        case 1:
                            System.out.println(novoAlunos.getNome());
                            System.out.println(novoAlunos.getMatricula());
                            System.out.println(novoAlunos.getNota());
                            System.out.println("Aluno fazendo graduação!");
                            System.out.println("Cadastro realizado!");
                            break;
                        case 2:
                            System.out.println(novoAlunos.getNome());
                            System.out.println(novoAlunos.getMatricula());
                            System.out.println("Aluno fazendo pós graduação!");
                    }
                    novoAluno.add(novoAlunos);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    if(novoAluno.isEmpty()){
                        System.out.println("Nenhum aluno foi encontrado!");
                        break;
                    }

                    System.out.println("Lista de alunos cadastrados: ");
                    for(int i=0; i<novoAluno.size(); i++){
                        System.out.println(i+"-"+novoAluno.get(i).getNome());
                    }

                    System.out.println("Digite o número do aluno que deseja editar: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();

                    if(indice < 0 || indice > novoAluno.size()){
                        System.out.println("Número inválido, tente novamente!");
                        break;
                    }

                    Aluno alunoEditar = novoAluno.get(indice);

                            System.out.println("O que você deseja editar ?");
                            System.out.println("1 - Editar nota");
                            System.out.println("2 - Editar nome do aluno");
                            System.out.println("3 - Editar matricula");
                            escolhaEditar = scanner.nextInt();
                            scanner.nextLine();
                            switch(escolhaEditar){
                                case 1:
                                    System.out.println("Nova nota: ");
                                    double novaNota = scanner.nextDouble();
                                    scanner.nextLine();
                                    alunoEditar.setNota(novaNota);
                                    break;
                                case 2:
                                    System.out.println("Qual novo nome deseja: ");
                                    String novoNome = scanner.nextLine();
                                    alunoEditar.setNome(novoNome);
                                    break;
                                case 3:
                                    System.out.println("Nova Matricula: ");
                                    System.out.println("1 - Mudar para pós graduação!");
                                    System.out.println("2 - Mudar para Graduação!");
                                    escolhaMatricula = scanner.nextInt();
                                    scanner.nextLine();
                                    if (escolhaMatricula == 1) {
                                        alunoEditar.setMatricula("Matrícula mudada para Pós Graduação!");
                                    } else if (escolhaMatricula == 2) {
                                        alunoEditar.setMatricula("Matrícula mudada para Graduação!");
                                    }else{
                                        System.out.println("Opção inválida");
                            }
                                    break;
                    }
                case 3:
            }
        }
    }
}




