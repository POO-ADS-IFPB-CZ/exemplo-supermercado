package view;

import dao.SupermercadoDao;
import model.Cliente;
import model.Supermercado;

public class Main {
    public static void main(String[] args) {

        SupermercadoDao supermercadoDao = new SupermercadoDao();

        Supermercado supermercado = new Supermercado("111.111.111/0001-11",
                "Mercadinho da esquina");

        if(supermercadoDao.salvar(supermercado)){
            System.out.println("Salvo com sucesso!");
        }else{
            System.out.println("Falha ao salvar");
        }

    }
}