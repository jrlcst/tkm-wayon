package tkm.wayon.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Automovel extends Bem {
    private String marca;
    private String modelo;

    public Automovel(String descricao, double valor, String modelo, String marca) {
        super(valor, descricao);
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("-----------------DETALHES DO AUTOMÓVEL----------------------");
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor do Bem: " + valor);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("----------------------------------------------------");
    }
}