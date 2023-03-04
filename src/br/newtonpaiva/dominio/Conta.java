package br.newtonpaiva.dominio;

import java.util.Objects;

public class Conta {

    private Integer numero;
    private Double saldo;


    public Conta() {
        this(null);
    }

    public Conta(Integer numero) { //Para executar a operação conta, é necessário inserir o número.
        this(numero, 0.0);
    }

    public Conta(Integer numero, Double saldo) { //posso criar uma operação com o mesmo nome, o que diferencia é os parametros.
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double sacar(Double valor) {
        if (valor == null || valor <= 0)
            throw new IllegalArgumentException("Valor menos ou");

        saldo -= valor;
        return saldo;
    }

    public Double depositar(Double valor) {
        if (valor == null || valor <= 0)
            throw new IllegalArgumentException("Valor menos ou");

        saldo += valor;
        return saldo;
    }

    public void transferir(Conta destino, Double valor) {
      if(this.getSaldo() < saldo)
          throw new IllegalArgumentException("Opção não disponível");

      if(this.equals(destino))
          throw new IllegalArgumentException("Opção não disponível");

          this.sacar(valor); //this (c) saca o valor.
        destino.depositar(valor); // destino (c2) deposita o valor inserido.

    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // caso as duas pisoções de memória seja iguais.
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numero, conta.numero);
    }
    @Override
    public int hashCode() { //pega algo e itens e converte em código (tipo criptografia)
        return Objects.hash(numero);
    }
}
