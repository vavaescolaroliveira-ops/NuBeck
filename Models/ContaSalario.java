package NuBeck.Models;

import javax.swing.*;

public class ContaSalario extends ContaBancaria{
    @Override
    public void Sacar(){
        if (saques == 0){
            String saque = JOptionPane.showInputDialog(
                    null,
                    "Digite O valor do Saque(Um Saque Gratuito)",
                    "Sacar",
                    JOptionPane.QUESTION_MESSAGE
            );

            double valor = Double.parseDouble(saque);
            this.saldo = saldo - valor;

        }else{
            String saque = JOptionPane.showInputDialog(
                    null,
                    "Digite O valor do Saque(R$ 2,00 Reais de Taxa)",
                    "Sacar",
                    JOptionPane.QUESTION_MESSAGE
            );

            double valor = Double.parseDouble(saque);
            this.saldo = saldo - valor;

        }


        saques++;
    }

}
