public class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void exibirDetalhes(){
        System.out.println(getNome());
        System.out.println(getMatricula());
        System.out.println(getNota());
    }

}
