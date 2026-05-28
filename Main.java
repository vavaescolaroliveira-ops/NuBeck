package NuBeck;

import NuBeck.Models.ContaBancaria;
import NuBeck.Models.ContaCorrente;
import NuBeck.Models.ContaPoupanca;
import NuBeck.Models.ContaSalario;

import javax.swing.*;

public class Main {
    static void main(String[] args) {
        ContaBancaria c1 = new ContaCorrente();
        ContaBancaria c2 = new ContaPoupanca();
        ContaBancaria c3 = new ContaSalario();

        c1.setTitular("Corrente");
        c1.setNumeroDaConta(1);
        c1.setSaldo(1000);
        c1.ImprimirConta();
        c1.Sacar();
        c1.Depositar();
        c1.ImprimirConta();

        c2.setTitular("Poupança");
        c2.setSaldo(1000);
        c2.ImprimirConta();
        c2.Sacar();
        c2.Depositar();
        c2.ImprimirConta();

        c3.setTitular("Salario");
        c3.setSaldo(1000);
        c3.ImprimirConta();
        c3.Sacar();
        c3.Depositar();
        c3.ImprimirConta();
        c3.Sacar();
        c3.ImprimirConta();



    }
}
