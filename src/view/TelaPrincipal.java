package view;

import javax.swing.*;

public class TelaPrincipal extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public TelaPrincipal() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Supermercados POO");
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("img/supermercado.png");
        setIconImage(icon.getImage());

        setContentPane(contentPane);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        TelaPrincipal dialog = new TelaPrincipal();
        dialog.pack();
        dialog.setVisible(true);
    }
}
