package dao;

import model.Supermercado;

import java.util.HashSet;
import java.util.Set;

public class SupermercadoDao {

    private Set<Supermercado> supermercados;

    public SupermercadoDao() {
        supermercados = new HashSet<>();
    }

    public boolean salvar(Supermercado supermercado) {
        return supermercados.add(supermercado);
    }

    public boolean deletar(Supermercado supermercado) {
        return supermercados.remove(supermercado);
    }

    public Supermercado buscarPorCnpj(String cnpj){

    }

}
