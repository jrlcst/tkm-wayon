package tkm.wayon.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cobertura {
    private String tipo;
    private double valorSegurado;
    private double peso;

    public Cobertura(String tipo, double valorSegurado, double peso) {
        this.tipo = tipo;
        this.valorSegurado = valorSegurado;
        this.peso = peso;
    }

    public Double calculaPeso(){
        return this.peso * this.valorSegurado;
    }

    public void exibeDetalhes(){
        System.out.println("---------DETALHES DA COBERTURA----------");
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor segurado: " + valorSegurado);
        System.out.println("Peso da cobertura: " + peso);
    }
}