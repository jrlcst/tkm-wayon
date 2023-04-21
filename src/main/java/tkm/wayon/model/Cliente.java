package tkm.wayon.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Cliente {
    private String nome;
    private Integer cpf;
    private List<Seguro> seguros = new ArrayList<>();

    public Cliente(String nome, Integer cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addSeguro(Seguro seguro) {
        seguros.add(seguro);
    }

    public void removeSeguro(Seguro seguro) {
        seguros.remove(seguro);
    }

    public void exibirDetalhes() {
        System.out.println("---------------DETALHES DO CLIENTE---------------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Seguros Contratados:");
        for (Seguro seguro : seguros) {
            seguro.exibirDetalhes();
        }
    }

}