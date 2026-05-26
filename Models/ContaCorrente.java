package NuBeck.Models;

import javax.swing.*;

public class ContaCorrente extends ContaBancaria{

    @Override
    public void Sacar(){
        String saque = JOptionPane.showInputDialog(
                null,
                "Digite O valor do Saque(R$ 5,00 reais de Taxa)",
                "Sacar",
                JOptionPane.QUESTION_MESSAGE
        );

        double valor = Double.parseDouble(saque);

        this.saldo = saldo - (valor - 5);
    }
}
