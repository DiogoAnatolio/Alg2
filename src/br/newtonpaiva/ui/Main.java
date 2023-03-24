package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Conta;
import br.newtonpaiva.dominio.ContaEspecial;
import br.newtonpaiva.dominio.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Conta c = new Conta(10);
        c.setSaldo(100.0);

        c.depositar(50.0);
        c.sacar(5.0);

        Conta c2 = new Conta(10);
        c2.setSaldo(500.0);

        Conta c3 = new Conta();

        if (c.equals(c2)) {  // igual a (c.getNumero == c2.getNumero)
            System.out.println("Mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }

        System.out.println(c.getSaldo());

        ContaEspecial ce = new ContaEspecial();

        ContaPoupanca cp = new ContaPoupanca();
        cp.setSaldo(100.0);
        cp.aplicarRendimentos(2.5);
        System.out.println(cp.getSaldo());


    }
}
