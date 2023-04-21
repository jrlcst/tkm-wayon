package tkm.wayon;

import tkm.wayon.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------CRIANDO CLIENTE-------------");
        Cliente cliente = new Cliente("João Silva", 1234);
        cliente.exibirDetalhes();
        System.out.println("-----------CLIENTE CRIADO-------------");
        System.out.println();

        System.out.println("-----------CRIANDO BENS-------------");
        Bem automovel = new Automovel("Carro", 75000D, "Fusca", "Volkswagen");
        Bem residencia = new Residencia("Apartamento", 650000D, 60, "Rua São Celso, 315, São Paulo - SP");

        automovel.exibirDetalhes();
        residencia.exibirDetalhes();
        System.out.println("-----------BENS CRIADOS-------------");
        System.out.println();

        System.out.println("-----------CRIANDO COBERTURAS-------------");
        Cobertura rouboAutomovel = new Cobertura("Roubo do automóvel", 100000, 0.2);
        Cobertura incendioAutomovel = new Cobertura("Incêndio do automóvel", 100000, 0.1);
        rouboAutomovel.exibeDetalhes();
        incendioAutomovel.exibeDetalhes();

        Cobertura rouboResidencia = new Cobertura("Roubo da residência", 500000, 0.3);
        Cobertura incendioResidencia = new Cobertura("Incêndio da residência", 500000, 0.2);
        rouboResidencia.exibeDetalhes();
        incendioResidencia.exibeDetalhes();
        System.out.println("-----------COBERTURAS CRIADAS-------------");
        System.out.println();

        System.out.println("-----------CRIANDO SEGUROS-------------");
        List<Cobertura> coberturasAutomovel = new ArrayList<>();
        coberturasAutomovel.add(rouboAutomovel);
        coberturasAutomovel.add(incendioAutomovel);
        Seguro seguroAutomovel = new Seguro(automovel, coberturasAutomovel);
        seguroAutomovel.exibirDetalhes();

        System.out.println();

        List<Cobertura> coberturasResidencia = new ArrayList<>();
        coberturasResidencia.add(rouboResidencia);
        coberturasResidencia.add(incendioResidencia);
        Seguro seguroResidencia = new Seguro(residencia, coberturasResidencia);
        seguroResidencia.exibirDetalhes();
        System.out.println("-----------SEGUROS CRIADOS-------------");
        System.out.println();

        System.out.println("-----------ADICIONANDO SEGUROS AO CLIENTE-------------");
        cliente.addSeguro(seguroAutomovel);
        cliente.addSeguro(seguroResidencia);
        cliente.exibirDetalhes();

        System.out.println("-----------SEGUROS ADICIONADOS-------------");
        System.out.println();

        System.out.println("-----------REMOVENDO SEGUROS DO CLIENTE-------------");
        cliente.removeSeguro(seguroAutomovel);

        cliente.exibirDetalhes();
        System.out.println("-----------SEGUROS REMOVIDOS-------------");
    }
}