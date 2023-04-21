package tkm.wayon.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Residencia extends Bem {
    private Integer metrosQuadrados;
    private String endereco;

    public Residencia(String descricao, double valor, Integer metrosQuadrados, String endereco) {
        super(valor, descricao);
        this.metrosQuadrados = metrosQuadrados;
        this.endereco = endereco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("-----------------DETALHES DA RESIDÊNCIA--------------------");
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor do Bem: " + valor);
        System.out.println("Metros Quadrados: " + metrosQuadrados);
        System.out.println("Endereço: " + endereco);
        System.out.println("----------------------------------------------------");
    }
}