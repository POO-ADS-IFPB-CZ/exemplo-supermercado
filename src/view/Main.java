package view;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        JOptionPane.showMessageDialog(null, "Hello world!",
//                "Mensagem de informação", JOptionPane.INFORMATION_MESSAGE,
//                icon);

//        ImageIcon icon = new ImageIcon("img/boneco.png");
//        String profissoes[] = {"Professor", "Técnico Administrativo", "Terceirizado"};
//        String retorno = (String) JOptionPane.showInputDialog(null,
//                "Escolha sua profissão", "Entrada de dados",
//                JOptionPane.WARNING_MESSAGE, icon, profissoes, profissoes[0]);
//        System.out.println(retorno);

//        ImageIcon icon = new ImageIcon("img/boneco.png");
//        int retorno = JOptionPane.showConfirmDialog(
//                null, "Deseja continuar?", "Título",
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.QUESTION_MESSAGE, icon);
//
//        if(retorno == JOptionPane.CLOSED_OPTION) {
//            System.out.println("Não escolheu nada");
//        }else{
//            System.out.println("Escolheu alguma coisa");
//        }

        String profissoes[] = {"Professor", "Técnico Administrativo", "Terceirizado"};
        int retorno = JOptionPane.showOptionDialog(null,"Minha mensagem",
                "Título da mensagem", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, profissoes, profissoes[0]);
        System.out.println(retorno);

    }
}