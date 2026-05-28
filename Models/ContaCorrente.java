package NuBeck.Models;

import javax.swing.*;

public class ContaCorrente extends ContaBancaria{

    @Override
    public void Sacar(){
        this.taxa = 5;
        String saque = JOptionPane.showInputDialog(
                null,
                "Digite O valor do Saque(R$ 5,00 reais de Taxa)",
                "Sacar",
                JOptionPane.QUESTION_MESSAGE
        );

        this.valor = Double.parseDouble(saque);

        this.saldo = saldo - (valor + taxa);
    }
}
