package br.newtonpaiva.dominio;

public class ContaEspecial extends Conta {

    private Double limite;

    @Override
    public Double sacar(Double valor) {
        if (saldo + limite < valor) {
            throw new IllegalStateException("");
        }
        saldo = saldo - valor;
        return saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }


}
