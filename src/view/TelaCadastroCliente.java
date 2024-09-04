package view;

import model.Cliente;
import model.Supermercado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Set;

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
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaAdicionarCliente telaAdicionarCliente =
                        new TelaAdicionarCliente(supermercado);
                telaAdicionarCliente.setVisible(true);
            }
        });
    }

    private void createUIComponents() {
        table1 = new JTable();
        preencherTabela();
    }

    private void preencherTabela() {
        //TODO: Melhorar o código com lambda e stream
        String titulos[] = {"CPF", "Nome", "Telefone", "Email"};
        Set<Cliente> clientes = supermercado.getClientes();
        List<Cliente> clienteList = clientes.stream().toList();
        String dados[][] = new String[clientes.size()][4];

        for(int i=0; i<clientes.size(); i++) {
            dados[i][0] = clienteList.get(i).getCpf();
            dados[i][1] = clienteList.get(i).getNome();
            dados[i][2] = clienteList.get(i).getTelefone();
            dados[i][3] = clienteList.get(i).getEmail();
        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        table1.setModel(model);
    }
}
