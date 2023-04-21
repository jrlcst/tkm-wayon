package tkm.wayon.model;

public abstract class Bem {
    protected Double valor;
    protected String descricao;

    public Bem(Double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public abstract void exibirDetalhes();
}
