package view;

import model.Cliente;
import model.Supermercado;

public class Main {
    public static void main(String[] args) {

        Supermercado supermercado = new Supermercado("111.111.111/1000-11",
                "Mercadinho da esquina");

        if(supermercado.addCliente(new Cliente("111.111.111-01","João",
                "9999-9999", "joao@gmail.com"))){
            System.out.println("Salvo com sucesso");
        }else{
            System.out.println("Falha ao salvar");
        }

        if(supermercado.addCliente(new Cliente("111.111.111-01","João",
                "9999-9999", "joao@gmail.com"))){
            System.out.println("Salvo com sucesso");
        }else{
            System.out.println("Falha ao salvar");
        }

        System.out.println(supermercado.getClientes());

    }
}