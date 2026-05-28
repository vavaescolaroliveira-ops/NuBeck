package NuBeck.Models;

import javax.swing.*;

public class ContaBancaria {
    private int numeroDaConta;
    double saldo;
    private String titular;
    double saques;
    double saldoInicial;
    double valor;
    double taxa;
    double valorDeposito;

    public void Sacar(){
        this.taxa = 0;
        String saque = JOptionPane.showInputDialog(
                null,
                "Digite O valor do Saque(Não será Cobrado Nenhuma Taxa)",
                "Sacar",
                JOptionPane.QUESTION_MESSAGE
        );

        this.valor = Double.parseDouble(saque);

        this.saldo = saldo - valor;

    }


    public void Depositar(){
        String deposito = JOptionPane.showInputDialog(
                null,
                "Digite O valor do Deposito",
                "Deposito",
                JOptionPane.QUESTION_MESSAGE
        );

        this.valorDeposito = Double.parseDouble(deposito);
        this.saldo += valorDeposito;

    }

    public void ImprimirConta(){
        JOptionPane.showMessageDialog(
                null,
                "Conta: "+getTitular()+"\nSaldo Inicial: "+getSaldoInicial()+"\n\n\nSaque Realizado: "+valor+"\nTaxa Aplicada: "+taxa+"\nDepositos: "+valorDeposito+"\n\n\nSaldo Final: "+getSaldo(),
                "Conta",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        this.saldoInicial = saldo;
    }

    public double getSaldo() {return saldo;}


    public double getSaldoInicial() {
        return saldoInicial;
    }

    public double getValor() {
        return valor;
    }
}
