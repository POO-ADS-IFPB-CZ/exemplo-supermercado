package dao;

import model.Supermercado;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SupermercadoDao {

    private File arquivo;

    public SupermercadoDao() {
        arquivo = new File("supermercados.ser");

        if(!arquivo.exists()){
            try{
                arquivo.createNewFile();
            }catch (IOException e){
                System.out.println("Falha ao criar arquivo");
            }
        }

    }

    public boolean salvar(Supermercado supermercado) {
//        return supermercados.add(supermercado);
        return false;
    }

    public boolean deletar(Supermercado supermercado) {
//        return supermercados.remove(supermercado);
        return false;
    }

    public Supermercado buscarPorCnpj(String cnpj){
        return null;
//        for(Supermercado supermercado : supermercados){
//            if(supermercado.getCnpj().equals(cnpj)) return supermercado;
//        }
//        return null;
    }

}
