package NuBeck.Models;

import javax.swing.*;

public class ContaBancaria {
    private int numeroDaConta;
    double saldo;
    private String titular;
    int saques;

    public void Sacar(){
        String saque = JOptionPane.showInputDialog(
                null,
                "Digite O valor do Saque(Não será Cobrado Nenhuma Taxa)",
                "Sacar",
                JOptionPane.QUESTION_MESSAGE
        );

        double valor = Double.parseDouble(saque);

        this.saldo = saldo - valor;

    }


    public void Depositar(int valor){
        this.saldo = saldo + valor;
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


}
