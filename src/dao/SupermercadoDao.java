package dao;

import model.Supermercado;

import java.io.*;
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

    public Set<Supermercado> getSupermercados(){
        if(arquivo.length()>0){
            //Há dados no arquivo, ler conjunto
            try{
                FileInputStream inputStream = new FileInputStream(arquivo);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                Set<Supermercado> supermercados =
                        (Set<Supermercado>) objectInputStream.readObject();
                return supermercados;
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não encontrado");
            } catch (IOException e) {
                System.out.println("Falha ao ler arquivo");
            } catch (ClassNotFoundException e) {
                System.out.println("Falha ao ler arquivo");
            }
        }else{
            //Não há nada no arquivo, criar um novo conjunto
            return new HashSet<>();
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
