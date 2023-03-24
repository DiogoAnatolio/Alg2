package br.newtonpaiva.dominio;

public class ContaPoupanca extends Conta{

    public void aplicarRendimentos (Double percentual){
        Double saldo = getSaldo();

        setSaldo(saldo + saldo * percentual / 100);
    }
}
