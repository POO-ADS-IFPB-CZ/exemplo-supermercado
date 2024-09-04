package view;

import dao.SupermercadoDao;
import model.Cliente;
import model.Supermercado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAdicionarCliente extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private Supermercado supermercado;
    private SupermercadoDao dao;

    public TelaAdicionarCliente(Supermercado supermercado) {
        this.supermercado = supermercado;
        dao = new SupermercadoDao();
        setContentPane(contentPane);
        setModal(true);
        pack();
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: Validar os campos
                String cpf = textField1.getText();
                String nome = textField2.getText();
                String telefone = textField3.getText();
                String email = textField4.getText();
                Cliente cliente = new Cliente(cpf, nome, telefone, email);
                supermercado.addCliente(cliente);
                if(dao.atualizar(supermercado)){
                    JOptionPane.showMessageDialog(contentPane,
                            "Cliente adicionado com sucesso!");
                    dispose();
                }else {
                    JOptionPane.showMessageDialog(contentPane,
                            "Falha ao adicionar cliente",
                            "Mensagem de erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
