package NuBeck;

import NuBeck.Models.ContaBancaria;
import NuBeck.Models.ContaCorrente;
import NuBeck.Models.ContaPoupanca;
import NuBeck.Models.ContaSalario;

import javax.swing.*;

public class Main {
    static void main(String[] args) {
        String resposta = JOptionPane.showInputDialog(
                null,
                "Digite a Opção"+"\n1 - Criar Conta\n2 - Sair",
                "Opção",
                JOptionPane.QUESTION_MESSAGE
        );

        int op = Integer.parseInt(resposta);

        while(op != 2){
            String tipoConta = JOptionPane.showInputDialog(
                    null,
                    "Digite o Tipo\n1 - Corrente\n2 - Poupança\n3 - Salario",
                    "Conta",
                    JOptionPane.QUESTION_MESSAGE
            );

            int contaOp = Integer.parseInt(tipoConta);

            if (contaOp == 1){
                ContaBancaria c = new ContaCorrente();
                c.setTitular(
                        JOptionPane.showInputDialog(
                        null,
                        "Digite o Nome",
                        "Nome",
                        JOptionPane.QUESTION_MESSAGE
                ));




            }else if (contaOp == 2){
                ContaBancaria c = new ContaPoupanca();
                c.setTitular(
                        JOptionPane.showInputDialog(
                                null,
                                "Digite o Nome",
                                "Nome",
                                JOptionPane.QUESTION_MESSAGE
                        ));

            }else if (contaOp == 3){
                ContaBancaria c = new ContaSalario();
                c.setTitular(
                        JOptionPane.showInputDialog(
                                null,
                                "Digite o Nome",
                                "Nome",
                                JOptionPane.QUESTION_MESSAGE
                        ));

            }

            JOptionPane.showMessageDialog(
                    null,
                    "Conta Criada",
                    "Mensagem",
                    JOptionPane.INFORMATION_MESSAGE
            );

            String acao = JOptionPane.showInputDialog(
                    null,
                    "Digite a Ação\n1 - Depositar\n2 - Sacar\n3 - Ver Saldo",
                    "Conta",
                    JOptionPane.QUESTION_MESSAGE
            );

            int acaoOp = Integer.parseInt(tipoConta);

        }
    }
}
