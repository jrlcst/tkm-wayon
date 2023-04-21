package tkm.wayon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Getter
@Setter
@AllArgsConstructor
public class Seguro {

    private Bem bem;
    private List<Cobertura> coberturas;

    public void addCobertura(Cobertura cobertura) {
        coberturas.add(cobertura);
    }

    public void removeCobertura(Cobertura cobertura) {
        coberturas.remove(cobertura);
    }

    public Double calcularPreco() {
        double preco = 0;
        for(Cobertura cob : coberturas){
            preco = cob.calculaPeso();
        }
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("--------------DETALHES DO SEGURO----------------------");
        System.out.println("Bem segurado: " + bem.descricao);
        System.out.println("Valor do bem segurado: " + bem.valor);
        System.out.println("Valor do Seguro: " + calcularPreco());
        System.out.println("Coberturas selecionadas:");
        for (Cobertura cobertura : coberturas) {
            cobertura.exibeDetalhes();
        }
    }
}
