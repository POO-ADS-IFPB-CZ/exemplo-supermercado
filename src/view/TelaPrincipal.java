package view;

import dao.SupermercadoDao;
import model.Supermercado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JFormattedTextField formattedTextField1;
    private JButton buscarButton;
    private JTextField textField1;
    private JButton clientesButton;
    private JButton produtosButton;
    private SupermercadoDao dao;

    public TelaPrincipal() {
        dao = new SupermercadoDao();
        setContentPane(contentPane);
//        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cnpj = formattedTextField1.getText();
                String nome = textField1.getText();
                //TODO: Validar os campos
                Supermercado supermercado = new Supermercado(cnpj, nome);

                if(dao.salvar(supermercado)){
                    JOptionPane.showMessageDialog(contentPane,
                            "Salvo com sucessso");
                }else{
                    JOptionPane.showMessageDialog(contentPane,
                            "Já existe supermercado com esse CNPJ",
                            "Mensagem de erro",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cnpj = formattedTextField1.getText();
                Supermercado supermercado = dao.buscarPorCnpj(cnpj);

                if(supermercado != null){
                    textField1.setText(supermercado.getNome());
                }else{
                    JOptionPane.showMessageDialog(contentPane,
                            "Supermercado não encontrado",
                            "Mensagem de erro",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cnpj = formattedTextField1.getText();
                String nome = textField1.getText();
                Supermercado supermercado = new Supermercado(cnpj, nome);

                if(dao.deletar(supermercado)){
                    JOptionPane.showMessageDialog(contentPane,
                            "Deletado com sucessso");
                }else{
                    JOptionPane.showMessageDialog(contentPane,
                            "Falha ao deletar",
                            "Mensagem de erro",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }

    public static void main(String[] args) {
        TelaPrincipal dialog = new TelaPrincipal();
        dialog.pack();
        dialog.setVisible(true);
//        System.exit(0);
    }
}
