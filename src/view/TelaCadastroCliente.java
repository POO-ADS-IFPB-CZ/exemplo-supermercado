package view;

import model.Supermercado;

import javax.swing.*;

public class TelaCadastroCliente extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTable table1;
    private JButton atualizarButton;
    private Supermercado supermercado;

    public TelaCadastroCliente(Supermercado supermercado) {
        this.supermercado = supermercado;
        setContentPane(contentPane);
        setModal(true);
        pack();
        getRootPane().setDefaultButton(buttonOK);
    }
}
