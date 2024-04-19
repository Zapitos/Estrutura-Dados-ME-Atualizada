public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDealunos = 0;


    public void adicionaPosicao(int posicao, Aluno aluno) {
        if (posicao < 0 || posicao > totalDealunos) {
            throw new IllegalArgumentException("Posição inválida");
        }

        if (totalDealunos == alunos.length) {
            aumentaCapacidade();
        }

        for (int i = totalDealunos; i > posicao; i--) {
            alunos[i] = alunos[i - 1];
        }

        alunos[posicao] = aluno;
        totalDealunos++;
    }

    public Aluno pega(int posicao) {
        if (posicao < 0 || posicao >= totalDealunos) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return alunos[posicao];
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao >= totalDealunos) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < totalDealunos - 1; i++) {
            alunos[i] = alunos[i + 1];
        }

        totalDealunos--;
    }

    private void aumentaCapacidade() {
        Aluno[] novoArray = new Aluno[alunos.length * 2];
        for (int i = 0; i < totalDealunos; i++) {
            novoArray[i] = alunos[i];
        }
        alunos = novoArray;
    }
}