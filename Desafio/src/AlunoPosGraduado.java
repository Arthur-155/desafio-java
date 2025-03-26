public class AlunoPosGraduado extends Aluno {
    String orientador;

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(orientador);
    }
}
