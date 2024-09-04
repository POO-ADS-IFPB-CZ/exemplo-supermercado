package view;

import dao.SupermercadoDao;
import model.Cliente;
import model.Supermercado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import java.util.Set;

public class TelaCadastroCliente extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTable table1;
    private JButton atualizarButton;
    private Supermercado supermercado;
    private SupermercadoDao dao;

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

        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {
                preencherTabela();
                pack();
            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

    }

    private void createUIComponents() {
        table1 = new JTable();
        preencherTabela();
    }

    private void preencherTabela() {
        //TODO: Melhorar o código com lambda e stream
        String cnpj = supermercado.getCnpj();
        dao = new SupermercadoDao();
        supermercado = dao.buscarPorCnpj(cnpj);

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
