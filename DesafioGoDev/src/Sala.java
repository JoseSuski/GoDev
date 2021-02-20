public class Sala {

    String nome;

    @Override
    public String toString() {
        return "Sala{" +
                "nome='" + nome + '\'' +
                ", lotacao=" + lotacao +
                '}';
    }

    int lotacao;

    public Sala(String nome, int lotacao) {
        this.nome = nome;
        this.lotacao = lotacao;
    }

    public Sala() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }
}
